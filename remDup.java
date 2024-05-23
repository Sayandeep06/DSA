public class remDup{
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int i, String newStr){
        if (i == str.length()){
            System.out.println(newStr);
            return;
        }

        char cChar = str.charAt(i);

        if(map[cChar - 'a'] == true){
            removeDuplicates(str, i+1, newStr);
        }else { 
            newStr += cChar;
            map[cChar - 'a'] = true;
            removeDuplicates(str, i+1, newStr);
        }

    }

    public static void main(String args[]){
        String str = "abbccda";
        removeDuplicates(str, 0, "");
    }

}
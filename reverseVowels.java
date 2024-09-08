
class reverseVowels{
    public static void main(String args[]){
        String s = "hello";
        String a = reverse(s);
        System.out.println(a);
    }
    public static String reverse(String s){
        char arr[] = s.toCharArray();
        int start = 0;
        int end = arr.length-1;
        String vowels = "aeiouAEIOU";
        while(start < end ){
            while(start < end && vowels.indexOf(arr[start])==-1){
                start ++;
            }
            while(start < end && vowels.indexOf(arr[end])==-1){
                end --;
            }
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        
            start ++;
            end --;
        }
        String newWord = new String(arr);
        return newWord;
    }
}
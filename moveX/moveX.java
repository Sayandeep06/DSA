public class moveX{
    public static void rec(String str, int i, int count, String newStr ){
        
        if(i == str.length()){
            for(int j = 0; j< count; j++){
                newStr +='x';
            }
            System.out.println(newStr);
            return;
        }
        char c = str.charAt(i);
        if( c == 'x'){
            count ++;
            rec(str, i+1, count, newStr);
        }
        else{
            newStr += c;
            rec(str, i+1, count, newStr);
        }

    }
    public static void main(String args[]){
        String str = "axbcxxd";
        rec(str, 0, 0, "");
    }
}
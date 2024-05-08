//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int i, char e) {
        if(i == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char c = str.charAt(i);
        if(c == e) {
            if(first == -1){
                first = i;
            } else {
                last = i;
            }
        }
        findOccurance(str, i+1, e);
    }
    public static void main(String[] args) {
        String str = "aabbcdaefaaahhheahhfddjkd";
        findOccurance(str, 0, 'a');
          
    }
}
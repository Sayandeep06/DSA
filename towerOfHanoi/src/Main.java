//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void towerOfHanoi(int n, String src, String helper, String destination) {
        if(n==1) {
            System.out.println("transfer"+ n +" from "+src+" to "+destination);
            return;
        }
        towerOfHanoi(n-1, src, destination, helper);
        System.out.println("transfer disk"+ n + " from "+src+" to "+destination);
        towerOfHanoi(n-1, helper, src, destination);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}
// 0(2^n)
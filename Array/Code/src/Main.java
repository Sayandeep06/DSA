//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //syntax of array
        //datatype[] variable = new datatype[size]
        int[] roll; //declaration of array. roll getting defined in the stack
        roll = new int[5]; //initialization where the object gets created in the memory(heap)
        for(int num : roll){  //for each element in the array print the element
            System.out.println(num+" ");
        }
        System.out.println(Arrays.toString(roll));
        //converts array to string and prints it out
        /*
            123
            456
            789
         */
        int[][] arr= new int[3][3];
        for(int row=0; row < arr.length; row++){
            for(int col=0; col < arr[row].length; col++)
                arr[row][col] = sc.nextInt();
        }// storing value of 2D array

        //ArrayList 
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(10); //adds to the list 
    }
}
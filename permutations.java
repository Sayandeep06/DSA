
import java.util.*;

public class permutations {
    public static void main(String args[]){
        ArrayList<String> ans = permutationsList("", "abcde");
        System.out.println(ans);
        System.out.println(noOfPerm("", "abcde"));
    }

    static ArrayList<String> permutationsList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        
        ArrayList<String> ans = new ArrayList<>();

        for (int i=0; i<= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f+ ch + s, up.substring(1)));
        }
        return ans;
    }

    static int noOfPerm(String p, String up){
        if(up.isEmpty()){
            return 1; 
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i=0; i<= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            count = count + noOfPerm(f+ ch + s, up.substring(1));
        }
        return count;
    }

}
 
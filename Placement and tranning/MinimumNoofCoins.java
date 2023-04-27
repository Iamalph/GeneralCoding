package greedy;

import java.util.Vector;

public class MinimumNoofCoins {
    static int deno[] ={1,2,5,10,20,50,100,500,1000};
    static int n = deno.length;
public static  void findMin(int V){
    Vector<Integer> ans = new Vector<>();
    for(int i= n-1;i>=0;i--){
        while(V > deno[i]){
            V = V- deno[i];
            ans.add(deno[i]);
        }
    }
    for(int i=0;i<ans.size();i++){
        System.out.print(ans.elementAt(i) + " ");
    }



}









    public static void main(String[] args){
        int n=93;
        System.out.print("Following  is minimal no of coins :"+ n + ":");
        findMin(n);
    }
}

// 1

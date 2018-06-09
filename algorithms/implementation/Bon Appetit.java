import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
          //MY SOLUTION
        
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int i,sum=0,sum1=0;
        int a[]=new int[n];
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
          int b=sc.nextInt();
         ArrayList<Integer> arr=new ArrayList<>();
         for( i=0;i<n;i++){
             arr.add(a[i]);
         }
         arr.remove(k);
         for(i=0;i<arr.size();i++)
         {
             sum=sum+arr.get(i);
         }
        // System.out.println(sum);
         int tot=sum/2;
         if(tot==b)
         System.out.println("Bon Appetit");
         else
         {
             int tot1=b-tot;
             System.out.println(tot1);
         }
         
         //SIMPLE SOLUTION
         
         Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int total = 0;
        
        for (int i = 0; i < n; i++) {
            int price = scanner.nextInt();
            if (i != k) total += price;
        }
        
        int charged = scanner.nextInt();
        
        System.out.println(total / 2 == charged ? "Bon Appetit" : charged - (total/2));
    }
}
    }
}

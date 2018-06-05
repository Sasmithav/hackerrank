import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
    
    
                //MY SOLUTION
                
                
                String s1="hackerrank";
      // ArrayList<Integer> arr=new ArrayList<>();
       int h=0,count=0,i,j;
       for(i=0;i<s1.length();i++){
           for(j=h;j<s.length();j++){
               if(s1.charAt(i)==s.charAt(j)){
                   h=j+1;
                   count++;
                  // arr.add(j);
                   break;
               }
           }
       }
       if(count==s1.length())
       {
          /* for(i=0;i<arr.size()-1;i++){
               if(arr.get(i)>arr.get(i+1))
                 return "NO";
               else
                System.out.println("yes");
           }*/
          return "YES";
       }
       else
      return "NO";
      
      
      
      //SIMPLE SOLUTION
      
       String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                    j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

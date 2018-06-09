import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int[] ar) {
    
    
    // MY SOLUTION
    
    
            int i,j,pos;
        int len=ar.length;
        int ar1[]={1,2,3,4,5};
            ArrayList<Integer> arr=new ArrayList<>();
            for(i=0;i<ar1.length;i++)
            {
                int count=0;
                for(j=0;j<len;j++){
                    if(ar1[i]==ar[j])
                        count++;
                }
                arr.add(count);
            }
        int max=arr.get(0);
        for( i=0;i<arr.size();i++){
            if(arr.get(i)>max)
            max=arr.get(i);
        }
        pos=arr.indexOf(max);
         return pos+1;
         
         
         //SIMPLE SOLUTION
         
         
         Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[5];
		for(int i = 0;i<n;i++){
			switch (scan.nextInt()){
			case 1 :
				arr[0]++;
				break;
			case 2 :
				arr[1]++;
				break;
			case 3 :
				arr[2]++;
				break;
			case 4 :
				arr[3]++;
				break;
			case 5 :
				arr[4]++;
				break;
			}
		}
		int highest = 0;
		int answer = 0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>highest){
				highest = arr[i];
				answer= i+1;
			}
		}
		System.out.println(answer);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = migratoryBirds(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

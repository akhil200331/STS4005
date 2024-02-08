import java.util.ArrayList;
import java.util.Scanner;

public class leaders {
  public static void leader(int arr[], int n){
        // Your code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        int max_from_right=0;
        for (int i=n-1;i>=0;i--){
            if (max_from_right<=arr[i]){
                al.add(0,arr[i]);
                max_from_right=arr[i];
            }
        }
        for (int i = 0; i < al.size(); i++) {
          System.out.print(al.get(i)+" ");
        }
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();// number of elemnets in an array
    int arr[] = new int[n];// array declaration
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt(); //taking input
    }
    leader(arr,n);
  }
  }


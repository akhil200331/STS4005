
import java.util.*;

public class majorityelement {
  public static int majorityElement(int a[], int size)
    {
        // your code here
        int c=0;
        int t=a[0];
        Arrays.sort(a);
        for (int i=0;i<size;i++){
            if (t==a[i]){
                c++;
            }
            else{
                t=a[i];
                c=1;
            }
            if (c>size/2) return t;
        }
        return -1;
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();// number of elemnets in an array
    int arr[] = new int[n];// array declaration
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt(); //taking input
    }
    System.out.println(majorityElement(arr,n));
  }
  }


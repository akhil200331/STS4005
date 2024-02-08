import java.util.Scanner;

public class Josephus {
  public static int survival(int n, int k) {
    if (n == 1)
      return 1;
    return (survival(n - 1, k) + k - 1) % n + 1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    System.out.println(survival(n, k));
  }
}




/*int sum = 0;
 
        // For finding out the removed 
        // chairs in each iteration 
        for(int i = 2; i <= n; i++) 
        {
            sum = (sum + k) % i;
        }
 
        return sum+1; */
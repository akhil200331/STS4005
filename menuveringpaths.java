import java.util.Scanner;

public class menuveringpaths {
  
    public static int NumberOfPath(int a, int b) 
    {
        //Your code here
        if (a==1 || b==1) return 1;
        return NumberOfPath(a-1,b)+NumberOfPath(a,b-1);
    }

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int r = s.nextInt();
      int c = s.nextInt();
  System.out.println(NumberOfPath(r, c));
}
}

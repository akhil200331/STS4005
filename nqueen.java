import java.util.Scanner;
//21BCE9784
public class nqueen {
  public static boolean isSafe(int sol[][], int i, int j) { //checking whether it is not present in same row and same column as well as diagonal
    int x,y;
    for (y = j; y >= 0; y--) {
      if (sol[i][y] == 1)
        return false;
    }
    for (x = i, y = j; x >= 0 && y >= 0; x--, y--) {
      if (sol[x][y] == 1)
        return false;
    }
    for (x = i, y = j; x < sol.length && y >= 0; x++, y--) {
      if (sol[x][y] == 1)
        return false;
    }

    return true;
  }

  public static boolean nsolve(int sol[][], int col) {// if not found we update the position for solution
    if (col >= sol.length)
      return true;
    for (int i = 0; i < sol.length; i++) {
      if (isSafe(sol, i, col)) {
        sol[i][col] = 1;
        if (nsolve(sol, col + 1))
          return true;
      }
      sol[i][col] = 0;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int board[][] = new int[N][N];
    if (nsolve(board, 0)) {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          System.out.print(board[i][j] + " ");
        }
        System.out.println();
      }
    }
    else {
      System.out.println("Solution doesn't exist");
    }
  }
}

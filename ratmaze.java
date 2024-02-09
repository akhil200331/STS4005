public class ratmaze {
  static int sol[][];
  static int count = 0;

  public static boolean solve(int maze[][], int r, int c) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
      sol[r][c] = 1;
      return true;
    }
    if (possible(maze, r, c)) {
      sol[r][c] = 1;
      if (solve(maze, r + 1, c)) {
        return true;
      }
      if (solve(maze, r, c + 1)) {
        return true;
      }
      sol[r][c] = 0;
      
    }
    return false;
  }

  private static boolean possible(int[][] maze, int r, int c) {
    count++;
    if (r >= 0 && c >= 0 && r < maze.length && c < maze[0].length && maze[r][c] == 1)
      return true;
    return false;
  }
  public static void main(String[] args) {
    int maze[][] ={{1, 0, 0, 0},{1, 1, 0, 1}, {1, 1, 0, 0},{ 0, 1, 1, 1 } };
    sol = new int[maze.length][maze[0].length];
    if (solve(maze, 0, 0)) {
      for (int i = 0; i < maze.length; i++) {
        for (int j = 0; j < maze[0].length; j++) {
          System.out.print(sol[i][j] + " ");
        }
        System.out.println();
      }
    }
    else {
      System.out.println("Solution doesn't exist");
    }
  }
  
}

public class PascalTriangleRecursion {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(calue(i, j) + " ");
            }
            System.out.println();
        }
    }
    
    public static int cal(int row, int col) {
        if (col == 0 || col == row) {
            return 1; // first and last element in each row is always 1
        } else {
            return cal(row - 1, col - 1) + cal(row - 1, col);
        }
    }
}

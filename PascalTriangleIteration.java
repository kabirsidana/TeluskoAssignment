
public class PascalTriangleIteration {
    public static void main(String[] args) {
        printtriangle(6);
    }
    
    public static void printtriangle(int n) {
        int[][] triangle = new int[n][];
        
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // first element in each row is always 1
            
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
            
            triangle[i][i] = 1; // last element in each row is always 1
        }
        
        // Print the Pascal's triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

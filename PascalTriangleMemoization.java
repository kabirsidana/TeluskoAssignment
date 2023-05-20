import java.util.HashMap;
import java.util.Map;

public class PascalTrianglecacheization {
    private static Map<String, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(calculate(i, j) + " ");
            }
            System.out.println();
        }
    }
    
    public static int calculate(int row, int col) {
        String key = row + "-" + col;
        
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        
        if (col == 0 || col == row) {
            cache.put(key, 1);
        } else {
            int value = calculate(row - 1, col - 1) + calculate(row - 1, col);
            cache.put(key, value);
        }
        
        return cache.get(key);
    }
}

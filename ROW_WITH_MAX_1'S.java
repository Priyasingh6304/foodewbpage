import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        

        int[][] arr = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int maxOnesCount = 0;
        int maxOnesRow = -1;
        
        for (int i = 0; i < n; i++) {
            int onesCount = 0;
            
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    onesCount++;
                }
            }
            
            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                maxOnesRow = i;
            }
        }
        
        System.out.println(maxOnesRow);
        
        sc.close();
    }
}

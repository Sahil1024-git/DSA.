package q13069;
import java.util.Scanner;
import java.util.*;

public class CTJ13069 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int w = input.nextInt(); 

        int[] p = new int[n];
        int[] q = new int[n];
        int[][] k = new int[n+1][w+1];

        for(int i = 0; i < n; i++)
            p[i] = input.nextInt();

        for(int i = 0; i < n; i++)
            q[i] = input.nextInt();
      
        for(int i = 0; i <= n; i++) k[i][0] = 0;
        for(int j = 0; j <= w; j++) k[0][j] = 0;


        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= w; j++){
                if(q[i-1] <= j)
                    k[i][j] = Math.max(k[i-1][j], p[i-1] + k[i-1][j - q[i-1]]);
                else
                    k[i][j] = k[i-1][j];
            }
        }

        System.out.println(k[n][w]);
    }
}

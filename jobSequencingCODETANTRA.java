package q31044;
import java.util.*;

public class CTJ31044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] jobs = new int[n][3];

        for (int i = 0; i < n; i++) {
            jobs[i][0] = sc.nextInt(); // Job ID
            jobs[i][1] = sc.nextInt(); // Deadline
            jobs[i][2] = sc.nextInt(); // Profit
        }

        Arrays.sort(jobs, (a, b) -> b[2] - a[2]);

        int max = 0;
        for (int[] j : jobs)
            max = Math.max(max, j[1]);

        boolean[] slot = new boolean[max + 1];
        int cnt = 0, profit = 0;

        for (int[] j : jobs) {
            for (int t = j[1]; t > 0; t--) {
                if (!slot[t]) {
                    slot[t] = true;
                    cnt++;
                    profit += j[2];
                    break;
                }
            }
        }

        System.out.println(cnt + " " + profit);
    }
}

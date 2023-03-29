package org.example.algorithm;

public class DynamicPrograming {
    public static int knapSack(int W, int[] wt, int[] val) {
        int n = wt.length;
        int[][] memo = new int[n + 1][W + 1];
        //品物の個数だけ繰り返す
        for (int i = 0; i <= n; i++) {
            //容量の分だけ繰り返す
            for (int j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    memo[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    memo[i][j] = Math.max(val[i - 1] + memo[i - 1][j - wt[i - 1]], memo[i - 1][j]);
                } else {
                    memo[i][j] = memo[i - 1][j];
                }
            }
        }
        return memo[n][W];
    }

    public static void main(String[] args) {
        int[] wt = {10,20,50,100};
        int[] val = {30,20,50,100};
        System.out.println(knapSack(300,wt,val));
    }
}

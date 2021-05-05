package Backtrack;

public class Q60GetPermutation {
    private  boolean[] used;
    private int[] factorial;
    private int n;
    private int k;

    public String getPermutation(int n, int k) {
        this.n = n;
        this.k = k;
        calculatedFactorial(n);
        used = new boolean[n + 1];
        StringBuilder path = new StringBuilder();
        dfs(0, path);
        return path.toString();
    }

    private void dfs(int index, StringBuilder path) {
        if (index == n) {
            return;
        }
        int cnt = factorial[n - 1 - index];
        for (int i = 0; i <= n; i++) {
            if (used[i]) {
                continue;
            }
            if (cnt < k) {
                k = k - cnt;
                continue;
            }
            path.append(i);
            used[i] = true;
            dfs(index + 1, path);
            return;
        }
    }

    private void calculatedFactorial(int n) {
        factorial = new int[n + 1];
        factorial[0] = 1;
        for (int i = 0; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
    }
}

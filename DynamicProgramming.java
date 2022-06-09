public class DynamicProgramming {

    public int factorialRecursive(int n) {
        if (n >= 1)
            return n * factorialRecursive(n - 1);
        else
            return 1;
    }

    public int factorialDP(int n) {
        int[] a = new int[n + 1];
        a[0] = 1;

        if (!(n >= 1)) {
            return a[0];
        }

        for (int i = 1; i <= n; i++) {
            a[i] = a[i - 1] * i;
        }
        return a[n];

    }

    public int fibonacciRecursive(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public int fibonacciDP(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        int[] a = new int[n + 1];
        a[0] = 0;
        a[1] = 1;

        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        return a[n];
    }

    public int combinationsRecursive(int a, int b) {
        if (a == 0 & b == 0) {
            return 0;
        }

        if (a == 1 & b == 0) {
            return 1;
        }

        if (a == 0 & b == 1) {
            return 1;
        }

        if (a == b) {
            if (a == 1 & b == 1) {
                return 2;
            } else return a;
        }

        if (a > b) {
            if (a - b == 1) {
                return 1;
            }
            if (a - b > 1) {
                return 0;
            }
        }

        if (b - a == 1) {
            return combinationsRecursive(a, b - 1) + b;
        } else {
            return combinationsRecursive(a, b - 1) + a;
        }
    }

    public int combinationDP(int a, int b) {
        int[][] ab = new int[1][b + 1];
        ab[0][0] = a;

        if (a < b) {
            for (int j = a; j <= b; j++) {

                if (j - a == 1) {
                    ab[0][j] = ab[0][j - 1] + j;
                } else {
                    ab[0][j] = ab[0][j - 1] + a;
                }

                if (a == j) {
                    if (a == 1 & j == 1) {
                        ab[0][j] = 2;
                    } else ab[0][j] = a;
                }
            }
        }
        if (a > b) {
            if (a - b == 1) {
                ab[0][b] = 1;
            } else ab[0][b] = 0;
        }
        return ab[0][b];
    }
}

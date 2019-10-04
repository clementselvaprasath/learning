package algo.week4;

import java.io.*;
import java.util.*;

public class BinarySearch {

    int binarySearch(int[] a, int x) {
        int left = 0, right = a.length - 1;

        while (left <= right) {
//            System.out.println("x: " + x);

            int medium = left + ((right - left) / 2);
//            System.out.println("medium: " + medium);

            if (a[medium] == x) return medium;

            if (x < a[medium]) {
                right = medium - 1;
            } else {
                left = medium + 1;
            }

//            System.out.println("left: " + left + ", right: " + right);
        }

        return -1;
    }

    static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
          b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            BinarySearch s = new BinarySearch();
            System.out.print(s.binarySearch(a, b[i]) + " ");
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

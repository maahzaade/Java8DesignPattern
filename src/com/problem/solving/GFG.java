package com.problem.solving;

// Java program to find longest
// Zig-Zag subsequence in an array

public class GFG {
    // Function to return longest
// Zig-Zag subsequence length
    static int zzis(int arr[], int n) {
    /*Z[i][0] = Length of the longest
        Zig-Zag subsequence ending at
        index i and last element is
        greater than its previous element
    Z[i][1] = Length of the longest
        Zig-Zag subsequence ending at
        index i and last element is
        smaller than its previous
        element */
        int Z[][] = new int[n][2];

        /* Initialize all values from 1 */
        for (int i = 0; i < n; i++)
            Z[i][0] = Z[i][1] = 1;

        printArray(Z, n);
        int res = 1; // Initialize result

        /* Compute values in bottom up manner */
        for (int i = 1; i < n; i++) {
            // Consider all elements as
            // previous of arr[i]
            for (int j = 0; j < i; j++) {
                // If arr[i] is greater, then
                // check with Z[j][1]
                if (arr[j] < arr[i] &&
                        Z[i][0] < Z[j][1] + 1)
                    Z[i][0] = Z[j][1] + 1;

                // If arr[i] is smaller, then
                // check with Z[j][0]
                if (arr[j] > arr[i] &&
                        Z[i][1] < Z[j][0] + 1)
                    Z[i][1] = Z[j][0] + 1;
            }

        /* Pick maximum of both values at
        index i */
            if (res < Math.max(Z[i][0], Z[i][1]))
                res = Math.max(Z[i][0], Z[i][1]);

            printArray(Z, n);
        }

        return res;
    }

    static void printArray(int p[][], int n) {
        System.out.println("------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(p[i][j]+"\t");
            }
            System.out.println();
        }
    }

    /* Driver program */
    public static void main(String[] args) {
        int arr[] = {10, 22, 9, 33, 49,
                50, 31, 60};
        int n = arr.length;
        System.out.println("Length of Longest " +
                "Zig-Zag subsequence is " +
                zzis(arr, n));
    }
}
// This code is contributed by Prerna Saini

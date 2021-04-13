package com.problem.solving;

import java.util.*;


//sort list with minimum number of sawps
public class MinSwap {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int originalArray[] = Arrays.copyOfRange(arr, 0, arr.length);

        divide(arr);

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        int swapCounter = 0;
        for (int counter = 0; counter < arr.length; counter++) {
            if (arr[counter] != originalArray[counter]) {
                swapCounter++;
            }
        }

        return swapCounter;
    }

    static void divide(int list[]) {

        int left = 0, right = list.length - 1;
        if (left < right) {
            int middle = (right - left) / 2;

            int leftList[] = Arrays.copyOfRange(list, left, middle + 1);
            divide(leftList);

            int rightList[] = Arrays.copyOfRange(list, middle + 1, right + 1);
            divide(rightList);

            combine(list, leftList, rightList);
        }
    }

    static void combine(int list[], int leftList[], int rightList[]) {
        int leftNumCounts = leftList.length;
        int rightNumCounts = rightList.length;


        int i = 0, j = 0, k =0;

        while (i < leftNumCounts && j < rightNumCounts) {
            if (leftList[i] <= rightList[j]) {
                list[k] = leftList[i];
                i++;
            } else {
                list[k] = rightList[j];
                j++;
            }
            k++;
        }

        while (i < leftNumCounts) {
            list[k] = leftList[i];
            i++;
            k++;
        }

        while (j < rightNumCounts) {
            list[k] = rightList[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {

        int[] arr = {4, 3, 1, 2};

        int res = minimumSwaps(arr);

        System.out.println("-----------");
        System.out.println(res);


    }
}

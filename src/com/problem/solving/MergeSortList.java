package com.problem.solving;

import java.util.ArrayList;

public class MergeSortList {

    private ArrayList<Integer> strList;

    // Constructor
    public MergeSortList(ArrayList<Integer> input) {
        strList = input;
    }

    public void sort() {
        strList = mergeSort(strList);
    }

    public ArrayList<Integer> mergeSort(ArrayList<Integer> whole) {
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int center;

        if (whole.size() == 1) {
            return whole;
        } else {
            center = whole.size() / 2;
            // copy the left half of whole into the left.
            for (int i = 0; i < center; i++) {
                left.add(whole.get(i));
            }

            //copy the right half of whole into the new arraylist.
            for (int i = center; i < whole.size(); i++) {
                right.add(whole.get(i));
            }

            // Sort the left and right halves of the arraylist.
            left = mergeSort(left);
            right = mergeSort(right);

            // Merge the results back together.
            merge(left, right, whole);
        }
        return whole;
    }

    private void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> whole) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;

        // As long as neither the left nor the right ArrayList has
        // been used up, keep taking the smaller of left.get(leftIndex)
        // or right.get(rightIndex) and adding it at both.get(bothIndex).
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if ((left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
                whole.set(wholeIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                whole.set(wholeIndex, right.get(rightIndex));
                rightIndex++;
            }
            wholeIndex++;
        }

        ArrayList<Integer> rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            // The left ArrayList has been use up...
            rest = right;
            restIndex = rightIndex;
        } else {
            // The right ArrayList has been used up...
            rest = left;
            restIndex = leftIndex;
        }

        // Copy the rest of whichever ArrayList (left or right) was not used up.
        for (int i = restIndex; i < rest.size(); i++) {
            whole.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
    }

    public void show() {
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        int arr[] = {10, 22, 9, 33, 49, 50, 31, 60};
//        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        for (int element : arr) {
            input.add(element);
        }
        System.out.println("************************");
        MergeSortList test = new MergeSortList(input);
        test.sort();
        System.out.println("Sorted:");
        test.show();


    }
}

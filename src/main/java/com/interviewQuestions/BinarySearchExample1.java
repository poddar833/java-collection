package com.interviewQuestions;

public class BinarySearchExample1 {
    private static int array[] = {2, 3, 4, 10, 40};

    public static int performBinarySearch(int key) {
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;
        int index = -1;

        while (start < end) {
            if (array[mid] == key) {
                index = mid;
                break;
            }
            if (array[mid] > key) {
                end = mid - 1;
                mid = (start + mid - 1) / 2;
            } else {
                start = mid + 1;
                mid = (mid + 1 + end) / 2;
            }

        }
        return index;
    }

    public static void main(String[] args) {
        int index = performBinarySearch(12);
        System.out.println("Index of the searched item: " + index);
    }

}

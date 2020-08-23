package codingNinjas;

import java.util.Scanner;

public class MergeSort {


    public static void mergeSort(int[] input) {
        int start = 0;
        int end = input.length - 1;


        mergeSort1(input, start, end);

    }

    /*public static int x=0;*/
    public static void mergeSort1(int[] input, int start, int end) {

        /*if(x==0){
            x=end;
        }*/
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort1(input, start, mid);
        mergeSort1(input, mid + 1, end);
        /*for (int a:input){
            System.out.println(a);
        }*/

        merge(input, start, end);

    }

    public static void merge(int[] input, int start, int end) {
        int i = start;
        int mid = (start + end) / 2;
        int j = mid + 1;
        int k = start;
        int[] temp = new int[input.length];

        while (i <= mid && j <= end) {
            if (input[i] < input[j]) {
                temp[k] = input[i];
                i++;
                k++;
            } else {
                temp[k] = input[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            temp[k] = input[i];
            i++;
            k++;
        }
        while (j <= end) {
            temp[k] = input[j];
            j++;
            k++;
        }

        for (int p = start; p <= end; p++) {
            input[p] = temp[p];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        mergeSort(input);


        for (int a : input) {
            System.out.print(a + " ");
        }
    }
}

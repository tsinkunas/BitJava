package com.tsink.app;

import java.util.Arrays;

public class Java4ND {
    public static void main(String[] args){
        int[] test1 = {1, 2, 3, 4, 5, 6, 7};
        int[] test2 = {7, 6, 5, 4, 3, 2, 1};
        int[] test3 = {121, 15, 156, 156, 16, 16, 51, 28, 66};
        System.out.println(smallestInArr(test1));
        System.out.println(smallestInArr(test2));
        System.out.println(smallestInArr(test3));
        System.out.println(largestInArr(test1));
        System.out.println(largestInArr(test2));
        System.out.println(largestInArr(test3));
        System.out.println(sumOfArr(test1));
        System.out.println(sumOfArr(test2));
        System.out.println(sumOfArr(test3));
        System.out.println(bubbleSort(test1));
        System.out.println(bubbleSort(test2));
        System.out.println(bubbleSort(test3));
    }

//1. Parašykite java funkciją / metodą, kuris priima masyvą skaičių ir gražina mažiausią.

    public static int smallestInArr(int[] arr){
    for (int i = 0; i < arr.length - 1; i++){
        for (int j = 0; j < arr.length - i - 1; j++){
            if (arr[j] > arr[j+1]){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
        return arr[0];
    }
//2. Parašykite java funkciją / metodą, kuris priima masyvą skaičių ir gražina didžiausią.

    public static int largestInArr(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] < arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr[0];
    }
//3. Parašykite java funkciją / metodą, kuris priima masyvą skaičių ir gražina sumą.

    public static int sumOfArr(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
        sum += arr[i];
        }
        return sum;
    }
//4. Parašykite java funkciją / metodą, kuris priima masyvą skaičių ir jį išrikiuoja.

    public static String bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return Arrays.toString(arr);
    }
}



package ru.kourilenko;

public class StringUtil {

//    public static void bubbleSortInt(int[] arr) {
//        for (int j = 0; j < arr.length; j++) {
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int rez = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = rez;
//                }
//            }
//        }
//    }

    public static void bubbleSort(String[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareToIgnoreCase(arr[i + 1])>0) {
                    String rez = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = rez;
                }
            }
        }
    }
}

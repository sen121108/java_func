package org.example.algoTime;

import java.util.*;
public class factorial {
    //O(n!)：階乗時間
    public class Permutation {
        public static void permute(int[] arr, int start, int end) {
            if (start == end) {
                // 順列を出力する場合
                System.out.println(Arrays.toString(arr));
            } else {
                for (int i = start; i <= end; i++) {
                    swap(arr, start, i);
                    permute(arr, start + 1, end);
                    swap(arr, start, i);
                }
            }
        }

        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}

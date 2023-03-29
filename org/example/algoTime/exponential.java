package org.example.algoTime;

import java.util.ArrayList;
import java.util.List;

public class exponential {
    //O(2^n)：指数時間
    public class Subset {
        public static void subset(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < (1 << n); i++) {
                List<Integer> subset = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) > 0) {
                        subset.add(arr[j]);
                    }
                }
                System.out.println(subset.toString());
            }
        }
    }

}

package org.example.algoTime;

public class linear {
    //O(n)：線形時間
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {  // 偶数であればカウントする
                count++;
            }
        }

        System.out.println("偶数の個数は " + count + " 個です。");

    }
}

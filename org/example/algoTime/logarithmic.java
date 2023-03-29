package org.example.algoTime;

public class logarithmic {
    //O(log n)：対数時間 線型時間より短くなる
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int left = 0;
        int right = array.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (array[mid] == target) {
                System.out.println("値 " + target + " はインデックス " + mid + " にあります。");
                break;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

    }
}

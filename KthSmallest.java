// Name : Kth Smallest
// Difficulty: Medium
// Accuracy: 35.17%
// Link : https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1


import java.util.PriorityQueue;

public class KthSmallest {

    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int item = 0;
        for (int i = 0; i < k; i++) {
            item = pq.remove();
        }
        return item;
    }

    public static void main(String[] args) {
        int[] nums = {7, 10, 4, 3, 20, 15};
        System.out.println(kthSmallest(nums, 3));
    }
}

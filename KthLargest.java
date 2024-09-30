import java.util.PriorityQueue;

public class KthLargest {
    public static int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(-arr[i]);
        }
        int item = 0;
        for (int i = 0; i < k; i++) {
            item = pq.poll();
        }
        return -item;
    }

    public static void main(String[] args) {
        int[] nums = {7, 10, 4, 3, 20, 15};
        System.out.println(kthLargest(nums, 3));
    }
}

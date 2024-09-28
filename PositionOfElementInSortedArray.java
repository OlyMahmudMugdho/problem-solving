import java.util.ArrayList;

// name : First and Last Occurrences
// Difficulty: Medium
// Accuracy: 37.36%
// GFG Link : https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x/0

public class PositionOfElementInSortedArray {
    public static boolean hasDuplicateInRight(int[] arr, int index, int val){
        if (index < arr.length){
            return  arr[index] == val;
        }
        return false;
    }

    public static boolean hasDuplicateInLeft(int[] arr, int index, int val){
        if (index >= 0) {
            return arr[index] == val;
        }
        return false;
    }

    public static int findLastIndex(int[] arr, int index, int val){
        while (arr[index] == val){
            index++;
            if (index >= arr.length){
                break;
            }
        }
        return index - 1;
    }

    public static int findFirstIndex(int[] arr, int index, int val){
        while (arr[index] == val){
            index--;
            if (index < 0){
                break;
            }
        }
        return index + 1;
    }

    public static ArrayList<Integer> getPositions(int arr[], int n, int x){
        ArrayList<Integer> result = new ArrayList<>();
        int first = -1;
        int last = -1;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high) /2;

            if (arr[mid] == x) {
                first = mid;
                last = mid;

                if (hasDuplicateInLeft(arr, mid, x)) {
                    first = findFirstIndex(arr, mid, x);
                }
                if (hasDuplicateInRight(arr, mid, x)) {
                    last = findLastIndex(arr, mid, x);
                }

                result.add(first);
                result.add(last);
                return result;
            }

            if (arr[mid] < x) {
                low = mid + 1;
            }

            if (arr[mid] > x) {
                high = mid - 1;
            }

        }
        result.add(first);
        result.add(last);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int n = 9;
        int x = 5;
        ArrayList<Integer> positions = getPositions(arr, n, x);
        System.out.println(positions);
    }
}

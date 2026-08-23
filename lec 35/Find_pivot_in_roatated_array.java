public class Find_pivot_in_roatated_array{
        static int search(int[] nums, int target) {

        int n = nums.length;

        int s = 0;
        int e = n - 1;

        // Find pivot
        while (s < e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > nums[n - 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        int pivot = s;

        if (target >= nums[pivot] && target <= nums[n - 1]) {
            return binarySearch(nums, pivot, n - 1, target);
        } else {
            return binarySearch(nums, 0, pivot - 1, target);
        }
    }

    static int binarySearch(int[] nums, int s, int e, int target) {

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;
    }




    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));

    }
    

}
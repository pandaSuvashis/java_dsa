public class BruteForce {

    private boolean canAllocate(int[] arr, int k, int limit) {

        int students = 1;
        int pages = 0;

        for (int book : arr) {

            if (pages + book <= limit) {
                pages += book;
            } else {
                students++;
                pages = book;
            }
        }

        return students <= k;
    }

    public int findPages(int[] arr, int k) {

        int n = arr.length;

        if (k > n) {
            return -1;
        }

        int min = 0;
        int max = 0;

        // Minimum possible answer = largest book
        for (int book : arr) {
            min = Math.max(min, book);
            max += book;
        }

        // Try every possible maximum
        for (int limit = min; limit <= max; limit++) {

            if (canAllocate(arr, k, limit)) {
                return limit;
            }
        }

        return -1;
    }


  

    public static void main(String[] args) {

        int[] arr = {12, 34, 67, 90};
        int k = 2;

        BruteForce solution = new BruteForce();

        int answer = solution.findPages(arr, k);

        System.out.println("Minimum maximum pages = " + answer);
    }


}
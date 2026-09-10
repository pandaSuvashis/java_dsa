import java.util.ArrayList;

public class Main {

    private static boolean isValid(ArrayList<Integer> boards, int k, int mid) {

        int painterCount = 1;
        int currentSum = 0;

        for (int i = 0; i < boards.size(); i++) {

            int board = boards.get(i);

            if (board > mid) {
                return false;
            }

            if (currentSum + board <= mid) {
                currentSum += board;
            } 
            else {
                painterCount++;
                currentSum = board;

                if (painterCount > k) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {

        int sum = 0;

        for (int i = 0; i < boards.size(); i++) {
            sum += boards.get(i);
        }

        int start = 0;
        int end = sum;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isValid(boards, k, mid)) {
                ans = mid;
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> boards = new ArrayList<>();

        boards.add(10);
        boards.add(20);
        boards.add(30);
        boards.add(40);

        int k = 2;

        int answer = findLargestMinDistance(boards, k);

        System.out.println("Minimum maximum board allocation: " + answer);
    }
}
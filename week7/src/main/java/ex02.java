public class ex02 {
    public static void main(String[] args) {

        int[] nums = {4, 9, 7, 5, 1};
        int target = 14;


        public int[] twoSum ( int[] nums, int target){


            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    sum = nums[i] + nums[j];
                    if (sum == target) {
                        int[] list = {i, j};
                        return list;
                    }
                }

            }
        }
    }
}

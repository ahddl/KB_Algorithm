//리스트 [4,9,7,5,1]에서 k개의 숫자를 더해서 target이 될 수 있나요? (중복x)

import org.w3c.dom.ls.LSOutput;

public class ex01 {
    public static void main(String[] args) {

        int[] nums = {4,9,7,5,1};
        int k =2;
        int target =  14;


        System.out.println(solution(nums, k, target));
    }


    public static boolean solution(int[] nums, int k, int target){
        return dfs(nums, k, target, 0,0,0);
    }

    private static boolean dfs(int[] nums, int k, int target, int start, int depth, int sum){
        if(depth == k){
            return sum == target;
        }
        for (int i = start ; i < nums.length; i++){
            if(dfs(nums,k,target,i+1,depth+1, sum+nums[i])){
                return true;
            }
        }
        return false;
    }

}


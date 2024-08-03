//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        class Solution {
            public int[] twoSum(int[] nums, int target) {
                int sum,answer;

                for (int i =0 ; i <= nums.length ;i++){
                    for (int j = 0; j <= nums.length ; j++){

                        if(i==j){
                            continue;


                        }
                        sum =nums[i]+nums[j];
                        if (sum == target ){
                           return answer[]={i,j};

                        }
                    }

                    }
            }
        }
    }
}
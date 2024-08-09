// class Solution {
//     public int missingNumber(int[] nums) {
//         int n=1;
//         for(int i=2;i<=nums.length;i++){
//             n+=i;
//         }
//         for(int i=0;i<nums.length;i++){
//             n-=nums[i];
//         }
//         return n;
//     }
// }

// public class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int ans = 0;
//         for (int i = 1; i <= n; i++) {
//             ans = ans ^ i;
//         }
//         for (int i = 0; i < nums.length; i++) {
//             ans = ans ^ nums[i];
//         }
//         return ans;
//     }
// }
class Solution{
    public int missingNumber(int[] nums){
        int n=nums.length;
        int sum=0;
        int total=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return total-sum;
    }
}

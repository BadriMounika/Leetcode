class Solution {
    public int fun(int n,int[] dp) {
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fun(n-1, dp)+fun(n-2, dp);
        
    }
    public int fib(int n){
        if(n==0) return 0;
        int f=0;
        int s=1;
        for(int i=2;i<=n;i++){
            int sum=f+s;
            f=s;
            s=sum;
        }
        return s;
    }
}
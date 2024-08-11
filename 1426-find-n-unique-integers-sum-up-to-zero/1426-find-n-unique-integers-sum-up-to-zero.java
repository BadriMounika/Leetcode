class Solution {
    public int[] sumZero(int n) {
        int[] m=new int[n];
        int sum=0;
        for(int i=0;i<n-1;i++){
            m[i]=i+1;
            sum+=m[i];

        }
        m[n-1]=(-(sum));
        return m;
    }
}
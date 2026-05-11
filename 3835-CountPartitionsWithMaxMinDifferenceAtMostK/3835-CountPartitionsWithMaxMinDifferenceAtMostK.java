// Last updated: 5/11/2026, 9:54:38 AM
class Solution {
    public int countPartitions(int[] a,int k) {
        var n=a.length;
        var M=(long)1e9+7;

        var mx=new LinkedList<Integer>();
        mx.addLast(a[0]);
        var mn=new LinkedList<Integer>();
        mn.addLast(a[0]);

        var dp=new long[n];
        dp[0]=1;

        long sm=1;

        for(int i=0,j=1;j<n;j++)
        {
            while(mx.size()>0&&mx.peekLast()<a[j])mx.pollLast();
            mx.addLast(a[j]);

            while(mn.size()>0&&mn.peekLast()>a[j])mn.pollLast();
            mn.addLast(a[j]);

            while(mx.peekFirst()-mn.peekFirst()>k)
            {
                if(mx.peekFirst()==a[i])mx.pollFirst();
                if(mn.peekFirst()==a[i])mn.pollFirst();
                sm-=dp[i]; sm=(sm+M)%M;
                i++;
            }

            dp[j]+=(i>0?dp[i-1]:1)+sm;
            dp[j]%=M;
            sm+=dp[j];
            sm%=M;
        }
        return (int)dp[n-1];
    }
}
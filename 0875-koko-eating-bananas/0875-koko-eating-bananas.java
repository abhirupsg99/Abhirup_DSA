class Solution {
    private long func(int[] piles,int n,int speed){
        n=piles.length;
        long hour=0;
        for(int i=0;i<n;i++){
            hour =hour+(piles[i]/speed);
            if(piles[i]%speed != 0){
                hour++;
            }
        }
        return hour;
    }
    public int minEatingSpeed(int[] piles, int h)
     {
        int n=piles.length;
        Arrays.sort(piles);
        int low=1;
        int high=piles[n-1];
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            long hr=func(piles,n,mid);
            if(hr>h){
                low=mid+1;
            }else{
                res=mid;
                high=mid-1;
            }
        }
        return res;

        
    }
}
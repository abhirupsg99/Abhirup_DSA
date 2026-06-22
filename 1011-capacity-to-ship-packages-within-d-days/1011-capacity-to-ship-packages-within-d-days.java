class Solution {
    private boolean canShip(int[] weights, int days, int cap){
        int day=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]<=cap){
                load=load+weights[i];
            }else{
                day++;
                load=weights[i];
            }
            if(day>days) return false;
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high += weights[i];
        }
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canShip(weights,days,mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
        
    }
}
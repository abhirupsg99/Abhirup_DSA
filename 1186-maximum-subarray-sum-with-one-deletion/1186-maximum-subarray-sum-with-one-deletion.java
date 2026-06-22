class Solution {
    public int maximumSum(int[] arr) {
        int nodel=arr[0];
        int onedel=Integer.MIN_VALUE;
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            int prevnodel=nodel;
            int prevonedel=onedel;
            nodel=Math.max(nodel+arr[i],arr[i]);
            int x;
            if(prevonedel==Integer.MIN_VALUE){
                x=arr[i];

            }else{
                x=prevonedel+arr[i];
            }
            onedel=Math.max(x,prevnodel);
            res=Math.max(res,Math.max(onedel,nodel));
        }return res;

        
    }
}
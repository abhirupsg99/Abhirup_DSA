class Solution {
public:
    int counter(int num){
        int cnt=0;
        while(num){
            cnt++;
            num=num & (num-1);

        }return cnt;

    }
    vector<int> sortByBits(vector<int>& arr) {
        sort(arr.begin(),arr.end(),[&](int a,int b){
            int bitsA=counter(a);
            int bitsB=counter(b);
            if(bitsA==bitsB)
            {
                return a<b;
            }else{
                return bitsA<bitsB;
            }

        });
        return arr;
    }
};
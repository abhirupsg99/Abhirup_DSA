class Solution {
public:
    bool checkGoodInteger(int n) {
        int squaresum=0;
        int digitsum=0;
        int diff=0;
        while(n>0){
            int digit=n%10;
            squaresum += digit*digit;
            digitsum  += digit;
            n=n/10;
            diff=squaresum-digitsum;
        }
        if(diff>=50){
            return true;
        }
        return false;
    }
};
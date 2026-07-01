class Solution {
public:
    int M=1e9+7;
    int countHomogenous(string s) {
        int n=s.length();
        int res=0;
        int length=0;
        for(int i=0;i<n;i++){
            if(i>0 && s[i]==s[i-1]){
                length+=1;
            }else{
                length=1;
            
            }
            res=(res+length)%M;
        }
        
        return res;
    }
};
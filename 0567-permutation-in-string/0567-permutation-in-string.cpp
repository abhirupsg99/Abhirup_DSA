class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        int n1=s1.size();
        int n2=s2.size();
        if(n1>n2) return false;
        unordered_map<char,int> f,x;
        for(char ch : s1 ){
            f[ch]++;
        }
        int low=0;
        for(int high=0;high<n2;high++)
        {
            x[s2[high]]++;
            if(high-low+1>n1)
            {
                x[s2[low]]--;
                if(x[s2[low]]==0){
                    x.erase(s2[low]);
                }
                low++;
            }
        if(f==x){
            return true;
        }
        }
        return false;
        
    }
};
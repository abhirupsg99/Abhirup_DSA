class Solution {
public:
    bool checkIfPangram(string sentence) {
        unordered_map<char,int> mp;
        for(char ch:sentence){
            mp[ch]++;
        }
        if(mp.size()==26){
            return true;
        }else{
            return false;
        }
    }
};
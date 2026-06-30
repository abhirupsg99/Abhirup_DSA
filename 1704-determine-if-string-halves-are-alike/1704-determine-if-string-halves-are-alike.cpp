class Solution {
public:
    bool isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        return true;
        else
        return false;
    }
    bool halvesAreAlike(string s) {
        int n=s.length();
        int m=n/2;
        int i=0;
        int j=m;
        int cntleft=0;
        int cntright=0;
        while(i<m && j<n){
            if(isVowel(s[i])){
                cntleft++;

            }
            if(isVowel(s[j])){
                cntright++;
            }
            i++;
            j++;
        }
        if(cntleft==cntright)
        return true;
        else
        return false;
    }
};
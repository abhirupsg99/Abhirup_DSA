public class Solution {
    public bool DetectCapitalUse(string word) {
        int cnt=0;
        foreach(char ch in word){
            if(char.IsUpper(ch)){
                cnt++;
            }
        }
            if(cnt==word.Length) return true;
            if(cnt==0) return true;
            if(cnt==1 && char.IsUpper(word[0])) return true;
        return false;
    }
}
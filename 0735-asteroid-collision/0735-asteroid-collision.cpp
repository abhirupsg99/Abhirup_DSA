class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        vector<int> ass;
        for(int i=0;i<asteroids.size();i++){
            
            while(!ass.empty() && asteroids[i]<0 && ass.back()>0){
                 int sum=asteroids[i]+ass.back();
                if(sum<0){
                    ass.pop_back();
                }
                else if(sum>0){
                    asteroids[i]=0;
                }else{
                    ass.pop_back();
                    asteroids[i]=0;
                }
                if(asteroids[i]==0)
                break;

            }
            if(asteroids[i]!=0){
                ass.push_back(asteroids[i]);
            }
        }
        int s=ass.size();
        vector<int> res(s);
        int i=s-1;
        while(!ass.empty()){
            res[i]=ass.back();
            ass.pop_back();
            i--;
        }
        return res;

        
    }
};
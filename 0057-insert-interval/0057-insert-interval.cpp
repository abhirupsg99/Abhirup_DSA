class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        if(intervals.empty()) return {newInterval};
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> tmp;
        bool insert=false;
        for(int i=0;i<intervals.size();i++){
            if(intervals[i][0]>newInterval[0] && insert==false){
                tmp.push_back(newInterval);
                insert=true;
            }
            tmp.push_back(intervals[i]);
        }
        if(!insert){
            tmp.push_back(newInterval);
        }
        vector<vector<int>> res;
        res.push_back(tmp[0]);
        for(int i=1;i<tmp.size();i++){
            if(res.back()[1]>=tmp[i][0]){
                res.back()[1]=max(res.back()[1],tmp[i][1]);
            }else{
                res.push_back(tmp[i]);
            }
        }
        return res;

    }
};
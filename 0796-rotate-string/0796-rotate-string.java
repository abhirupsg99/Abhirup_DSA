class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;

        }
        String tmc=s + s;
        return tmc.contains(goal);
        
    }
}
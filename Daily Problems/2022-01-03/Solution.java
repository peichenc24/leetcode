class Solution {
    public int findJudge(int n, int[][] trust) {
        int[][] people = new int[n][2];
        for(int[] person : trust){
            int out = person[0];
            int in = person[1];
            people[out - 1][0] ++;
            people[in - 1][1] ++;
        }
        for(int i = 0; i < n; i ++){
            if(people[i][0] == 0 && people[i][1] == n - 1)
                return i + 1;
        }
        return -1;
    }
}
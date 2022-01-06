class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int m = trips.length;
        int max = 0;
        for(int[] trip : trips){
            max = Math.max(trip[2], max);
        }
        int[] diff = new int[max + 1];
        for(int i = 0; i < m; i++){
            int np = trips[i][0];
            int sl = trips[i][1];
            int el = trips[i][2];
            diff[sl] += np;
            diff[el] -=  np;
        }
        int start = diff[0];
        if(start > capacity) return false;
        for(int i = 1; i <= max; i++){
            start = start + diff[i];
            if(start > capacity) return false;
        }
        return true;
    }
}
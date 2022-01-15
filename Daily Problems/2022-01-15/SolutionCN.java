class SolutionCN {
    public int totalMoney(int n) {
        int ans = 0;
        int day = 0;
        int num = 1;
        int current = 1;

        while(n > 0)
        {
            ans += current;
            current++;
            day++;
            n--;

            if(day == 7){
                day = 0;
                num++;
                current = num;
            }

        }

        return ans;
    }
}
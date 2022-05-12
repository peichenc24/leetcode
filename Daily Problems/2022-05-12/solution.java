class Solution {
    List<List<Integer>>ans= new ArrayList<>();
    public void swap(int i,int j,int[]nums){
        int k=nums[i];
        nums[i]=nums[j];
        nums[j]=k;
    }
    
    public void fun(int k, int[]nums){
        if(k==nums.length){
            List<Integer>a= new ArrayList<>();
        for(int x:nums)a.add(x);
            ans.add(a);
            return;
        }
        HashSet<Integer>s=new HashSet<>();
		//here i'm creating an hash set for one recurrsion
        for(int i=k;i<nums.length;i++){
		//there i'm checking and making sure that nums[i] is not getting repeteation 
          if(s.contains(nums[i]))continue;
            s.add(nums[i]);
            swap(i,k,nums);
            fun(k+1,nums);
            swap(i,k,nums);
       
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
       
    fun(0,nums);
        return ans;
    }
}
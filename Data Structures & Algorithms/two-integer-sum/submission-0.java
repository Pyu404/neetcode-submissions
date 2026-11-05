class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int x=target-nums[i];
            if(mp.containsKey(x))
            {
                //System.out.println(mp.get(x)+" "+i);
                ans[0]=mp.get(x);
                ans[1]=i;
                //return new int [] {,i};
            }
            mp.put(nums[i],i);
        }

        return ans;
    }
}

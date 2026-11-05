class Solution {
    public int majorityElement(int[] nums) {
        int cnt=1,ele=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(ele==nums[i])
            {
                cnt++;
            }
            else
            {
                if(ele!=nums[i])
                cnt--;
                
                if(cnt==0)
                {
                    ele=nums[i];
                    cnt=1;
                }
            }
        }
        return ele;
    }
}
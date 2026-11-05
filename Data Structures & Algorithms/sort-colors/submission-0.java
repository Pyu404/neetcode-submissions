class Solution {
    private void swap(int []nums,int i,int j)
    {
        int x=nums[i];
        nums[i]=nums[j];
        nums[j]=x;
    }
    public void sortColors(int[] nums) {
        int i=0,j=nums.length-1,k=0;

        while(i<j)
        {
            if(nums[i]==0)
            {
              swap(nums,i,k);
              i++;k++;
            }
            else if(nums[i]==2)
            {
            swap(nums,i,j);
            i++;
            j--;
            }
            else
            {
             i++;
            }
        }
    }
}
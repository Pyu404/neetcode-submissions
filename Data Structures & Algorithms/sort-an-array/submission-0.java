class Solution {
    private void merge(int [] nums,int left,int md,int right)
    {
        int n=right-left+1;
        int [] arr=new int[n];
        int i=left;
        int j=md+1;
        int k=0;
        while(i<=md&&j<=right)
        {
            if(nums[i]<nums[j])
            {
              arr[k++]=nums[i++];
            }
            else
            {
                arr[k++]=nums[j++];
            }
        }

        while(i<=md)
        {
            arr[k++]=nums[i++];
        }
        while(j<=right)
        {
            arr[k++]=nums[j++];
        }

        for( i=0;i<n;i++)
        {
           nums[left+i]=arr[i];
        }
        
    }
    private void mergesort(int [] nums,int left,int right)
    {
     if(left<right){
      int md=(left+right)/2;
      mergesort(nums,left,md);
      mergesort(nums,md+1,right);
      merge(nums,left,md,right);
     }
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);

        return nums;
    }
}
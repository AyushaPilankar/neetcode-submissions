class Solution {
    //using selection sort 
    public int[] sortArray(int[] nums) {
        //nums = [10,9,1,1,1,2,3,1]
        int n=nums.length;
      for(int i=0;i<n-1;i++){
        int min=nums[i];
        int mindx=i;
        for(int j=i;j<n;j++){
            if(nums[j]<min){
                min=nums[j];
                mindx=j;
            }
        }
            int temp=nums[i];
            nums[i]=nums[mindx];
            nums[mindx]=temp;

        
        
      }
      return nums;  
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        int j=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[j]==nums[i]){
                count++;
                if(count>2){
                    nums[i]=100000;
                    c++;
                    count--;
                }
            }
                else{
                    count=1;
                    j=i;
                }
        }
        
        int s=-1;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==100000&&s==-1){
                s=k;
            }
            else if(nums[k]!=100000&& s!=-1){
                nums[s]=nums[k];
                nums[k]=100000;
                s++;
            }
        }
        return nums.length-c;
    }
}
        
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        Set<Integer> s3=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        for(int ele1:nums1){
            s1.add(ele1);
        }
        for(int ele2:nums2){
            s2.add(ele2);
        }
        for(int ele3:nums3){
            s3.add(ele3);
        }
        for(int val1:s1){      
                if(s2.contains(val1)||s3.contains(val1)){
                    res.add(val1);
                }
            }
        for(int val2:s2){  
                if(s3.contains(val2)){
                    res.add(val2);
                }
            }
        List<Integer> lst=new ArrayList<>(res);   
    return lst;
    }
}
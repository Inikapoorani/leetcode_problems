class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int k=0;
        Set<Integer> s=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        for(int i=0;i<l1;i++){
            s.add(nums1[i]);
            }
            for(int j=0;j<l2;j++){
                if(s.contains(nums2[j])){
                   res.add(nums2[j]) ;
                }
            }
            int size=res.size();
            int[] arr=new int[size];
            for(int ele:res){
                arr[k]=ele;
                k++;

            }
            
            return arr;
        }
}
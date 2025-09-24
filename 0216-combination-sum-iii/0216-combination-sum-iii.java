class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1,k,n,new ArrayList<>(), result);
        return result;
    }
    public void backtrack(int n,int k,int target,List<Integer> cur,List<List<Integer>>result) {
        if (target==0 && cur.size()==k) {
             result.add(new ArrayList<>(cur));
             return;
        }
        if(cur.size()>k || target<0)return;
        for(int i=n;i<=9;i++){
            if(i>target) break;
            cur.add(i);
            backtrack(i+1,k,target-i,cur,result);
            cur.remove(cur.size()-1);
        }
    }
}
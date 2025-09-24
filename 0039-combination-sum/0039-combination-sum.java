 class Solution {
    // private void backtrack(int[] candidates, int idx, int target, List<Integer> cur, int sum, List<List<Integer>>result) {
    //     if (sum == target) {
    //         result.add(new ArrayList<>(cur));
    //         return;
    //     }
    //     if (idx >= candidates.length || sum > target) return;
    //     cur.add(candidates[idx]);
    //     backtrack(candidates, idx, target, cur, sum + candidates[idx],result);
    //     cur.remove(cur.size() - 1); 
    //     backtrack(candidates, idx + 1, target, cur, sum,result);
    // }
    // public List<List<Integer>> combinationSum(int[] candidates, int target) {
    //     List<List<Integer>> result = new ArrayList<>();
    //     backtrack(candidates, 0, target, new ArrayList<>(), 0,result);
    //     return result;
    // }
    // }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }
    public void backtrack(int[] candidates, int idx, int target, List<Integer> cur,List<List<Integer>>result) {
        if (target==0) {
             result.add(new ArrayList<>(cur));
             return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(candidates[i]>target) break;
            cur.add(candidates[i]);
            backtrack(candidates,i,target-candidates[i],cur,result);
            cur.remove(cur.size()-1);
        }
    }
 }
    

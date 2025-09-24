 class Solution {
    private void backtrack(int[] candidates, int idx, int target, List<Integer> cur, int sum, List<List<Integer>>result) {
        if (sum == target) {
            result.add(new ArrayList<>(cur));
            return;
        }

        if (idx >= candidates.length || sum > target) return;

        cur.add(candidates[idx]);
        backtrack(candidates, idx, target, cur, sum + candidates[idx],result);
        cur.remove(cur.size() - 1); 

        backtrack(candidates, idx + 1, target, cur, sum,result);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), 0,result);
        return result;
    }
    }

    // public void combinationSum(int[] candidates, int target){
    //     List<Integer> temp;
    //     List<List<Integer>> result = new ArrayList<>();
    //     int sum=0;
    //     int n=candidates.length;
    //     for(int i=0;i<n;i++){
    //         sum=candidates[i];
    //         for(int j=0;j<n;j++){
    //             if(sum==target){
    //                 temp.add(candidates[i]);
    //                 result.add(new ArrayList<>(temp));
    //                 break;
    //             }
    //             else if(sum!=target){
    //                 sum+=candidates[j];
    //                 if(sum==target){
    //                  temp.add(candidates[i]);
    //                  result.add(new ArrayList<>(temp));
    //                  break;
    //                 }
    //                 if(sum>target){
    //                     break;
    //                 }
    //             }
    //         }
    //     }
    //     return result;
       
    //     if(target < 0) return;
    //     if(target == sum){
    //         result.add(new ArrayList<>(temp));
    //         return;
    //     }    
    //     if(index >= candidates.length) return;
    //     temp.add(candidates[index]);
    //     combinationSum(candidates,result,index+1,temp);
    //     temp.remove(temp.size()-1);
    //     combinationSum(candidates,result,index+1,temp);
    // }
    // public List<List<Integer>> combinationSum(int[] candidates,int result, int target) {
    //     List<List<Integer>> result = new ArrayList<>();
    //     getCombinations(result, candidates, target, 0, new ArrayList<>());
    //     return result;
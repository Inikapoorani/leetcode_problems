class Solution {
     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
             if (i > idx && candidates[i] == candidates[i-1]) continue;
             if(candidates[i]>target) break;
             cur.add(candidates[i]);
             backtrack(candidates,i+1,target-candidates[i],cur,result);
             cur.remove(cur.size()-1);
      }
    }
  }
// private void backtrack(int[] candidates, int idx, int target, List<Integer> cur, int sum, List<List<Integer>>result) {
//         if (sum == target) {
//              result.add(new ArrayList<>(cur));
//             return;
//          }
//          if (idx >= candidates.length || sum > target) return;
//          cur.add(candidates[idx]);
//          backtrack(candidates, idx, target, cur, sum + candidates[idx],result);
//          cur.remove(cur.size() - 1); 
//          while(idx+1<candidates.length && candidates[idx]==candidates[idx+1])idx++;
//          backtrack(candidates, idx + 1, target, cur, sum,result);
//      } 
//      public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//          List<List<Integer>> result = new ArrayList<>();
//          backtrack(candidates, 0, target, new ArrayList<>(), 0,result);
//          return result;
//      }
// }

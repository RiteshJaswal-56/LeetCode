class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(k,n,1,result,new ArrayList<>());
        return result;
    }
    private void backtrack(int k,int n,int start,List<List<Integer>> result,List<Integer> temp){
        if(temp.size() == k){
            if(n == 0){
                result.add(new ArrayList<>(temp));
                return;
            }
        }
        for(int i=start;i<=9;i++){                                               
            temp.add(i);
            backtrack(k,n-i,i+1,result,temp);
            temp.remove(temp.size()-1);
        }
    }
}

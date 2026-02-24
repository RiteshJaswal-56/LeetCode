class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n , k , 1, result , new ArrayList<>());
        return result;
    }
    private void backtrack(int n,int k,int index ,List<List<Integer>> result,List<Integer> temp){
        if(k == temp.size()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<=n;i++){
            temp.add(i);
            backtrack(n,k,i+1,result,temp);
            temp.remove(temp.size()-1);
        }
    }
}
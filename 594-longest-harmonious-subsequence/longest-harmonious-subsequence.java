class Solution {
    public int findLHS(int[] nums) {
        int res =0;
        Map<Integer,Integer> hp = new HashMap<>();
        for(int i: nums){
            hp.put(i,hp.getOrDefault(i,0)+1);
        }
        for(int i:hp.keySet()){
            if(hp.containsKey(i+1)){
                res= Math.max(res,hp.get(i)+hp.get(i+1));
            }
        }
        return res;
    }
}
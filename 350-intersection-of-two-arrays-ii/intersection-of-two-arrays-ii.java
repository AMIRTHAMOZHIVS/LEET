class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        HashMap<Integer,Integer> n1 = new HashMap<>();
        for(int x : nums1){
            if(n1.containsKey(x)){
                n1.put(x,n1.get(x)+1);
            }else{
                n1.put(x,1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int x : nums2){
            if(n1.containsKey(x) && n1.get(x)>0 ){
                arr.add(x);
                n1.put(x,n1.get(x)-1);
            }
        }
        
        int ans[] = new int[arr.size()];
        for(int i=0 ; i<arr.size() ; i++){
            ans[i] = arr.get(i);
        }
        return ans;
        
    }
}
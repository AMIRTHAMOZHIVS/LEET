class Solution {
    ArrayList<Integer>ar;
    private int find(TreeNode r){
        if(r.left==null && r.right==null){
            int val=r.val,base=2;
            for(int i=ar.size()-1;i>=0;i--){
                if(ar.get(i)==1)val+=base;
                base=base*2;
            }
            return val;
        }
        int ans = 0;
        ar.add(r.val);
        if(r.left!=null) ans+=find(r.left);
        if(r.right!=null) ans+=find(r.right);
        ar.remove(ar.size()-1);
        return ans;
    }
    public int sumRootToLeaf(TreeNode root) {
        ar = new ArrayList();
        return find(root);
    }
}
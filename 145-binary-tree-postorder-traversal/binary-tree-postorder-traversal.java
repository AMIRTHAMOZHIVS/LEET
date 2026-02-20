class Solution {
    enum Direction {
        LEFT, RIGHT
    }
    class Pair {
        TreeNode node;
        Direction processed;

        Pair(TreeNode node, Direction processed) {
            this.node = node;
            this.processed = processed;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        TreeNode curr = root;
        Deque<Pair> stack = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        while(curr != null || !stack.isEmpty()) {
            if(curr != null) {
                stack.push(new Pair(curr, Direction.LEFT));
                curr = curr.left;
            } else {
                Pair pair = stack.pop();
                if(pair.processed == Direction.RIGHT) {
                    result.add(pair.node.val);
                    curr = null;
                } else {
                    pair.processed = Direction.RIGHT;
                    stack.push(pair);
                    curr = pair.node.right;
                }
            }
        }
        return result;
    }
}
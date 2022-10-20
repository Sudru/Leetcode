public class MaximumDepthOfBinaryTree104 {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int a = 1+maxDepth(root.left);
        int b = 1+maxDepth(root.right);
        
        return a>b?a:b;
        
        
        
    }
    public class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
    }
}

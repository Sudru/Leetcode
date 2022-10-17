public class InsertIntoBinaryTree701{
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode data = new TreeNode();
        data.val = val;
        if(root == null){
            return data;
        }
        TreeNode temp = root;
        while(temp.left!=null || temp.right!=null){
            if(val>temp.val && temp.right!=null){
                temp = temp.right;
            }else if(val<temp.val && temp.left!=null){
                temp = temp.left;
            }else
                break;
        }
        if(temp.val>val){
            temp.left = data;
        }else{
            temp.right = data;
        }
        return root;
    }

    public class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
    }
}
import java.util.ArrayList;
import java.util.List;

public class PostOrder145{
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return list;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);        

        return list;
    }
    public class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
    }
}
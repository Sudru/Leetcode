import java.util.ArrayList;
import java.util.List;

public class PreOrder144 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
    public class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
    }
}

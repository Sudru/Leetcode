import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal94 {
    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return list;
        }
        inorderTraversal(root.left);
        list.add(root.val);        
        inorderTraversal(root.right);
        return list;
    }
    public class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
    }
}

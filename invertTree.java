public class invertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        if(root.left!=null && root.right != null){
            TreeNode temp = root.right;
            root.right = invertTree(root.left);
            root.left = invertTree(temp);

        }
        else if(root.left != null){
            root.right = invertTree(root.left);
            root.left = null;
        }
        else if(root.right != null){
            root.left = invertTree(root.right);
            root.right = null;
        }
        return root;
    }
}

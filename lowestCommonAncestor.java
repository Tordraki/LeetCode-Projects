public class lowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findmin(root, p, q);
    }
    
    public TreeNode findmin(TreeNode root, TreeNode p, TreeNode q){
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        else if(root.val < p.val){
            if(q.val < root.val){
                return root;
            }
            else{
                return findmin(root.right, p, q);
            }
        }
        else if(q.val > root.val){
            return root;
        }
        else{
            return findmin(root.left, p, q);
        }
    }
    /*public TreeNode findmin(TreeNode root, TreeNode p, TreeNode q){
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        else if(contains(root.right, p)){
            if(contains(root.right, q)){
                return findmin(root.right, p, q);
            }
            else{
                return root;
            }
        }
        else if(contains(root.right, q)){
            return root;
        }
        else{
            return findmin(root.left, p, q);
        }


    }

    public boolean contains(TreeNode root, TreeNode p){
        if(root == null){
            return false;
        }
        else if(root.val == p.val){
            return true;
        }
        else{
            return contains(root.left, p) || contains(root.right, p);
        }
    }
    */

}

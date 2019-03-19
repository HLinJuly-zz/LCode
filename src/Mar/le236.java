/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class le236{
    private TreeNode ans;
    public le236(){
        this.ans=null;
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        this.recurseTree(root,p,q);
        return this.ans;
    }
    public boolean recurseTree(TreeNode cur, TreeNode p, TreeNode q){
        if(cur==null){
            return false;
        }
        int left = recurseTree(cur.left, p,q)?1:0;
        int right = recurseTree(cur.right, p,q)?1:0;
        int mid = (cur==p||cur==q)?1:0;

        if(mid+left+right>=2)
            this.ans = cur;
        return(mid+left+right>0);
    }
}
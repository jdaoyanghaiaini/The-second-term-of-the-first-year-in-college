public class BinaSearchTree {
    static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    TreeNode root;

    public TreeNode search(int val) {
        if(root==null) {
            return null;
        }
        TreeNode cur = root;
        while(cur!=null) {
            if(cur.val>val) {
                cur = cur.left;
            } else if (cur.val<val) {
                cur = cur.right;
            }else {
                return root;
            }
        }
        return null;
    }

    public boolean insert(int val) {
        TreeNode node = new TreeNode(val);
        if(root==null) {
            root = node;
            return true;
        }
        TreeNode parent = root;
        TreeNode cur = root;
        while(cur!=null) {
            if(cur.val>val) {
                parent = cur;
                cur = cur.left;
            } else if (cur.val<val) {
                parent = cur;
                cur = cur.right;
            }else {
                return false;
            }
        }
        if(parent.val > val) {
            parent.left = node;
        }
        else {
            parent.right = node;
        }
        return true;
    }

    public boolean remove(int val) {

    }

}
class Test {
    public static void main(String[] args) {
        BinaSearchTree binaSearchTree = new BinaSearchTree();
    }
}

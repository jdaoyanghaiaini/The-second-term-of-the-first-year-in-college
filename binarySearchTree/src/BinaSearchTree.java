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
        TreeNode cur = root;
        TreeNode parent = null;
        if(cur==null) {
            return false;
        }
        while(cur!=null) {
            if(cur.val>val) {
                parent = cur;
                cur = cur.left;
            } else if (cur.val<val) {
                parent = cur;
                cur = cur.right;
            }else {
                removeElement(parent,cur);
                return true;
            }
        }
        return false;
    }

    private void removeElement(TreeNode parent, TreeNode cur) {
        if(cur.left==null) {
            if(cur==root) {
                cur = cur.right;
            }else {
                if(parent.left==cur) {
                    parent.left = cur.right;
                }else {
                    parent.right = cur.right;
                }
            }
        } else if (cur.right==null) {
            if(cur==root) {
               cur = cur.left;
            }else {
                if(parent.left==cur) {
                    parent.left = cur.left;
                }else {
                    parent.right = cur.left;
                }
            }
        }else {
            TreeNode target = cur.right;
            TreeNode targetParent = cur;
            while(target.left!=null) {
                targetParent = target;
                target = target.left;
            }
            cur.val = target.val;
            if(target == targetParent.left) {
                targetParent.left = target.right;
            }
            else {
                targetParent.right = target.right;
            }
        }
    }

}
class Test {
    public static void main(String[] args) {
        BinaSearchTree binaSearchTree = new BinaSearchTree();
    }
}

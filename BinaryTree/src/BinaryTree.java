public class BinaryTree {
    static class TreeNode {
        private char val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }
    public TreeNode createTreeNode() {
        TreeNode root = new TreeNode('a');
        TreeNode nodeB = new TreeNode('b');
        TreeNode nodeC = new TreeNode('c');
        TreeNode nodeD = new TreeNode('d');
        TreeNode nodeE = new TreeNode('e');
        TreeNode nodeF = new TreeNode('f');

        root.left = nodeB;
        root.right = nodeC;
        nodeB.left = nodeD;
        nodeB.right = nodeE;
        nodeC.right = nodeF;

        return root; // 返回根节点A
    }
    public void preOrder(TreeNode root) {
        if(root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val+ " ");
        inOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    public int treeSize(TreeNode root) {
        if(root == null) return 0;
        return treeSize(root.left) + treeSize(root.right) +1;
    }

    public int getLeafNodeCount(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return getLeafNodeCount(root.left) + getLeafNodeCount(root.right);
    }

    public int getLevelCount(TreeNode root,int k) {
        if(root ==null) return 0;
        if(k == 1 ) return 1;
        return getLevelCount(root.left,k-1) + getLevelCount(root.right,k-1);
    }

    public TreeNode find(TreeNode root,char ch) {
        if(root == null)    return null;
        if(root.val == ch)  return root;

        TreeNode ret = find(root.left,ch);
        if(ret != null) return ret;

        TreeNode ret2 = find(root.right,ch);
        if(ret2 != null)    return ret2;

        return null;
    }

    public int getHeight(TreeNode root) {
        if(root == null)    return 0;
        int leftH = getHeight(root.left);
        int leftR  = getHeight(root.right);
        return leftH>=leftR ?leftH+1:leftR+1;
    }
}
class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BinaryTree.TreeNode root = binaryTree.createTreeNode();
        binaryTree.preOrder(root);
        System.out.println();
        binaryTree.inOrder(root);
        System.out.println();
        binaryTree.postOrder(root);
        System.out.println();
        System.out.println(binaryTree.treeSize(root));
        System.out.println(binaryTree.getLeafNodeCount(root));
        System.out.println(binaryTree.getLevelCount(root,3));
        binaryTree.find(root,'e');
        System.out.println(binaryTree.getHeight(root));
    }
}


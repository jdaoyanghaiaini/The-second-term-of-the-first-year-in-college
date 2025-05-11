import java.util.Stack;

public class FindAncestor {}
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    class Solution1{
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root == p || root == q) return root;
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            findPath(s1, p, root);
            findPath(s2, q, root);
            int gap = s1.size() - s2.size();
            if (gap < 0) {
                Stack<TreeNode> tmp = new Stack<>();
                tmp = s1;
                s1 = s2;
                s2 = s1;
            }

            while (gap != 0) {
                s1.pop();
                gap--;
            }
            while (!s1.empty()) {
                if (s1.peek() == s2.peek())
                    return s1.pop();
                else {
                    s1.pop();
                    s2.pop();
                }
            }
            return null;
        }

        public boolean findPath(Stack s, TreeNode Node, TreeNode root) {
            if (root == null) return false;
            s.push(root);
            if (root == Node) return true;
            //看看左子树
            boolean flg = findPath(s, Node, root.left);
            if (flg) {
                return true;
            }
            //查查右子树
            flg = findPath(s, Node, root.right);
            if (flg) {
                return true;
            }
            s.pop();
            return false;
        }
    }

class Test3 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        TreeNode node4 = new TreeNode(4);
        TreeNode node6 = new TreeNode(6);
        TreeNode node0 = new TreeNode(0);
        TreeNode node8 = new TreeNode(8);
        TreeNode node1 = new TreeNode(1);
        root.left = node5;
        root.right = node1;
        node5.left = node6;
        node5.right = node2;
        node2.left = node7;
        node2.right = node4;
        node1.left = node0;
        node1.right = node8;

        Solution1 solution1 = new Solution1();
        solution1.lowestCommonAncestor(root,node5,node4);
    }
}

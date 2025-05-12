public class NoRecursive {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        Stack<TreeNode> st = new Stack<>();
//        if(root==null)  return list;
//        TreeNode cur = root;
//        while(cur!=null || !st.isEmpty()) {
//
//            while(cur!=null) {
//                list.add(cur.val);
//                st.push(cur);
//                cur = cur.left;
//            }
//            cur = st.pop().right;
//        }
//        return list;
//    }

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        Stack<TreeNode> st = new Stack<>();
//        if(root==null)  return list;
//        TreeNode cur = root;
//        while(cur!=null || !st.isEmpty()) {
//            while(cur!=null) {
//                st.push(cur);
//                cur = cur.left;
//            }
//            cur = st.pop();
//            list.add(cur.val);
//            cur = cur.right;
//        }
//        return list;
//    }
}


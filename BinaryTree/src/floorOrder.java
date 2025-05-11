import java.util.*;

public class floorOrder {

}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        if(root == null)    return list;
        queue.offer(root);
        while(!queue.isEmpty()) {
            LinkedList<Integer> cur = new LinkedList<>();
            int sz = queue.size();
            while(sz!=0) {
                TreeNode tmp = queue.peek();
                if(tmp==null){
                    sz--;
                    continue;
                }
//                cur.add(tmp.val);
                addNode(queue.poll(),queue);
                sz--;
            }
            list.add(cur);
            Collections.reverse(list);
        }
        return list;
    }
    public Queue<TreeNode> addNode(TreeNode root,Queue<TreeNode> queue) {
        if(root.left!=null) queue.offer(root.left);
        if(root.right!=null) queue.offer(root.right);

        return queue;
    }
}
//import java.util.Scanner;
//class TreeNode{
//    char val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(char ch) {
//        this.val = ch;
//    }
//}
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class createTree {
//    public static int i = 0;
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String str = in.nextLine();
//            TreeNode root = createTree(str);
//            inOrder(root);
//        }
//    }
//
//    public static TreeNode createTree(String str) {
//        TreeNode root = null;
//        char ch = str.charAt(i);
//        if(ch!='#') {
//            i++;
//            root = new TreeNode(ch);
//            root.left = createTree(str);
//            root.right = createTree(str);
//        }else {
//            i++;
//        }
//        return root;
//    }
//
//    public static void inOrder(TreeNode root) {
//        if(root == null)    return;
//        inOrder(root.left);
//        System.out.print(root.val+" ");
//        inOrder(root.right);
//    }
//}
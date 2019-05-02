package practice.algorithm.tree;

public class Traverse {
    public static void preTraverse(TreeNode root){
        if (root == null) return;
        System.out.print(root.getVal() + ",");
        preTraverse(root.getLeft());
        preTraverse(root.getRight());
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.ConstrucBTree();
        preTraverse(root);
    }
}

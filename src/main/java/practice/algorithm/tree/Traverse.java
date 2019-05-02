package practice.algorithm.tree;

import java.util.Stack;

/**
 * 二叉树的递归和非递归遍历
 */

public class Traverse {
    public static void preTraverse(TreeNode root){
        if (root == null) return;
        System.out.print(root.getVal() + ",");
        preTraverse(root.getLeft());
        preTraverse(root.getRight());
    }

    public static void preTraverse1(TreeNode root){
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (stack.size()!=0){
            TreeNode p = stack.pop();
            System.out.print(p.getVal() + ",");
            if (p.getRight()!=null) stack.push(p.getRight());
            if (p.getLeft()!=null) stack.push(p.getLeft());
        }

    }

    public static void inTraverse(TreeNode root){
        if (root == null) return;
        inTraverse(root.getLeft());
        System.out.print(root.getVal() + ",");
        inTraverse(root.getRight());
    }

    public static void inTraverse1(TreeNode root){
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode p = root;

        while (p!=null || stack.size()!=0) {
            while (p!=null){
                stack.push(p);
                p = p.getLeft();
            }
            if (stack.size()!=0) {
                TreeNode q = stack.pop();
                System.out.print(q.getVal() + ",");
                p = q.getRight();
            }
        }
    }

    public static void postTraverse(TreeNode root){
        if (root == null) return;
        postTraverse(root.getLeft());
        postTraverse(root.getRight());
        System.out.print(root.getVal() + ",");
    }

    public static void postTraverse1(TreeNode root){
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> resStack = new Stack<Integer>();
        stack.push(root);
        while (stack.size()!=0){
            TreeNode p = stack.pop();
            resStack.push(p.getVal());
            if (p.getLeft()!=null) stack.push(p.getLeft());
            if (p.getRight()!=null) stack.push(p.getRight());
        }
        while (resStack.size()!=0){
            System.out.print(resStack.pop() + ",");
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.ConstrucBTree();
        preTraverse(root);
        System.out.println();
        preTraverse1(root);
        System.out.println();
        inTraverse(root);
        System.out.println();
        inTraverse1(root);
        System.out.println();
        postTraverse(root);
        System.out.println();
        postTraverse1(root);
    }
}

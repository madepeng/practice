package practice.algorithm.tree;

import lombok.Data;

/**
 * @author 去
 * @description: 二叉排序树的构建以及查找（递归和循环）
 * @date 2019/5/3 - 10:18
 */
@Data
public class BST {
    @Data
    public static class Node{
        private Integer val;
        private Node left;
        private Node right;

        public Node(Integer val) {
            this.val = val;
        }
    }

    /**
     * 构建二叉排序树,返回构建完成的根节点
     * @param arr
     */
    public static Node constructBST(int[] arr){
        Node root = new Node(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            insertNode(root, arr[i]);
        }
        return root;
    }

    /**
     * 插入结点
     */
    public static Node insertNode(Node root, Integer k){
        if (root == null){
            root = new Node(k);
            return root;
        }else if (root.val > k){
            root.left = insertNode(root.left, k);
        }else if (root.val < k){
            root.right = insertNode(root.right, k);
        }else if (root.val.equals(k)){//最后一个用else，不用else if的话，最后就不用return了，这样比较方便。
            return null;
        }
        return root;
    }

    public static void inTraverse(Node root){
        if (root == null) return;
        inTraverse(root.left);
        System.out.print(root.val + ",");
        inTraverse(root.right);
    }

    /**
     * 递归查找
     * @param root
     * @param k
     * @return
     */
    public static Node search(Node root,int k){
        if (root == null || root.val.equals(k)) return root;
        if (root.val.compareTo(k)>0) return search(root.left,k);
        else return search(root.right,k);
    }

    public static Node search1(Node root,int k){
        if (root == null) return root;
        while (root!=null){
            if (root.val.equals(k)) return root;
            if (root.val.compareTo(k)>0) root = root.left;
            else root = root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {25,25,18,46,2,53,39,32,4,74,67,60,11};
        Node root = constructBST(arr);
        inTraverse(root);
        System.out.println();
        System.out.println(search(root,11));
        System.out.println();
        System.out.println(search1(root,11));
    }
}
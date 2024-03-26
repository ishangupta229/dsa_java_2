import java.util.*;
public class MinDistance {
    static class node {
        int data;
        node left;
        node right;

        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    static class Binary_Tree {
        static int idx=-1;
        public static node Binary_Tree(int [] nodes) {
            idx++;
            if (nodes[idx]==-1) {
                return null;
            }
            node newnode = new node(nodes[idx]);
            newnode.left = Binary_Tree(nodes);
            newnode.right = Binary_Tree(nodes);
            return newnode;
        }
        
    }
    
    public static node lca(node root, int n1, int n2) {
        if (root==null) return null;
        if (root.data==n1 || root.data==n2) return root;
        node left = lca(root.left, n1, n2);
        node right = lca(root.right, n1, n2);
        if (left!=null && right!=null) {
            return root;
        } else if (left!=null) {
            return left;
        } else if (right!=null) {
            return right;
        } else {
            return null;
        }
    }

    // static int l;
    // static int r;
    public static int minDis(node root, int n1, int n2) {
        node common = lca(root,n1,n2);
        int dis1 = locDis(common, n1);   
        int dis2 = locDis(common, n2);
        return dis1 + dis2;  
    }
    public static int locDis(node root , int n) {
        if (root == null) return -1;
        if (root.data == n) return 0;
        int left = locDis(root.left, n);
        int right = locDis(root.right, n);
        // System.out.println("l " + left + " " + root.data);
        // System.out.println("r" +right + " " + root.data);
        if(left==-1 && right==-1) return -1;
        if (left != -1) return left + 1;
        if (right != -1) return right + 1;

        return -1;
    }
    public static void main(String[] args) {
        int node [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_Tree tree = new Binary_Tree();
        node root = tree.Binary_Tree(node);
        // System.out.println(root.left.data);
        // System.out.println(lca(root, 2, 4).data);
        System.out.println(minDis(root, 2,3));
    }
}

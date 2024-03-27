import java.util.*;
public class Sumtree {
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
    static int idx=-1;
    static class Binary_Tree {
        public static node Binary_Tree(int arry[]) {
            idx++;
            if (arry[idx]==-1) {
                return null;
            }
            node newnode = new node(arry[idx]);
            newnode.left = Binary_Tree(arry);
            newnode.right = Binary_Tree(arry);

            return newnode;
        }
    }
    public static int sumTree(node root) {
        if (root==null) {
            return 0;
        }
        int curr = root.data;

        int lt = sumTree(root.left);
        int rt = sumTree(root.right);

        int l = root.left==null ? 0:root.left.data;
        int r = root.right==null ? 0:root.right.data;

        root.data = rt + lt + l + r;
        return curr;
    }
    public static node preoder(node root) {
        if (root==null) {
            return null;
        }
        System.out.print(root.data + " ");
        node left = preoder(root.left);
        node right = preoder(root.right);
        return root;
    }
    public static void main(String[] args) {
        int node1[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_Tree tree = new Binary_Tree();
        node root = tree.Binary_Tree(node1);
        sumTree(root);
        preoder(root);
    }   
}

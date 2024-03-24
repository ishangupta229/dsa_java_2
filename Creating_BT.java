import java.util.*;
public class Creating_BT {
    static node root;
    
    static class node {
        int data;
        node left;
        node right;

        node(int data){
            this.data =data;
            this.left =null;
            this.right = null;
        }
    }

    static class Binary_Tree{
        static int idx=-1;
        public static node Binary_Tree(int [] n) {
            idx++;
            if (n[idx]==-1) {
                return null;
            }
            node newnode = new node(n[idx]);
            newnode.left = Binary_Tree(n);
            newnode.right = Binary_Tree(n);
            root = newnode;
            return newnode;
        }
        public static void preorder(node root) {
            if (root == null) {
                return;                
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    
    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,-1};

        Binary_Tree tree = new Binary_Tree();
        node n = tree.Binary_Tree(nodes);
        System.out.println(n.data);

        tree.preorder(root);
    }
}

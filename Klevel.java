import java.util.*;
import java.util.LinkedList;

public class Klevel {
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
    static int i = 1;
    public static void kLevel(node root ,int level ) {
        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            node temp = q.remove();
            if (temp==null) {
                if (q.isEmpty()) {
                    break;
                } else{
                    q.add(null);
                }
                i++;
            } else {
                if (i==level) {
                    System.out.print(temp.data+" ");
                }
                if (temp.left!=null) {
                    q.add(temp.left);
                }
                if (temp.right!=null) {
                    q.add(temp.right);
                }
            }
        }



    }
    public static void main(String[] args) {
        int node1[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Binary_Tree tree = new Binary_Tree();
        node root = tree.Binary_Tree(node1);
        kLevel(root, 2);
    }
}

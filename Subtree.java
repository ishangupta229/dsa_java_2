import java.util.*;
public class Subtree {
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
    public static boolean identical(node r, node sr) {
        if(r==null && sr==null){
            return true;
        }
        if (r==null || sr==null || r.data!=sr.data || !identical(r.right, sr.right) || !identical(r.left, sr.left)) {
            return false;
        }
        return true;
    }

    public static boolean finding(node r, node sr) {
        // if (r==null && sr==null) {
        //     return true;
        // }
        if (r==null || sr==null) {
            return false;
        }
        if (r.data==sr.data) {
            if (identical(r, sr)) {
                return true;
            }
        }
        return finding(r.right, sr) || finding(r.left, sr);
        
    }

    public static void main(String[] args) {
        int node1[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // int node2[] = {2,4,-1,-1,5,-1,-1};
        int node2[] = {1,-1,6,-1,-1};

        Binary_Tree tree = new Binary_Tree();
        node root = tree.Binary_Tree(node1);
        idx=-1; 
        Binary_Tree subtree = new Binary_Tree();
        node subroot = subtree.Binary_Tree(node2);
        
        System.out.println(finding(root, subroot));;

        // System.out.println(subroot.left.data);

    }
}

import java.util.*;
import java.util.LinkedList;
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
        public static void inorder(node root) {
            if (root==null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }

        public static void postorder(node root) {
            if (root==null) {
                return;                
            }
            
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levTrav(node root) {
            if (root==null) {
                return;
            }
            Queue <node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                node curr = q.remove();
                if (curr==null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                } else{
                    System.out.print(curr.data + " ");
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }

        static int x;
        static int y;
        public static int height(node root) {
            if (root==null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                return 1;
            }
            x += height(root.left);
            y += height(root.right);
            // System.out.println("x = " + x );
            // System.out.println("y = " + y );
            return x>=y ? x:y ;
        }

        public static int sum(node root) {
            if (root==null) {
                return 0;
            }
            return root.data + sum(root.left)+ sum(root.right);
        }
        
        public static int count(node root) {
            if (root==null) {
                return 0;
            }
            return 1 + count(root.left)+ count(root.right);
        }


    }
    
    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,7,8,-1,-1,-1,-1};

        Binary_Tree tree = new Binary_Tree();
        node n = tree.Binary_Tree(nodes);
        System.out.println(n.data);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        
        tree.levTrav(root);
        System.out.println("Height of the tree = " + tree.height(root));
        System.out.println(tree.count(root));
        System.out.println(tree.sum(root));
    }
}

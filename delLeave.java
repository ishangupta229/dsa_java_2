public class delLeave {
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
    public static void delLeave(node root, int tar) {
        if (root==null) return;

        delLeave(root.left, tar);
        delLeave(root.right, tar);

        if (root.data == tar && root.left==null && root.right==null) {
                root=null;
                return;
        }     
    }
    public static void inoder(node root) {
        if (root==null) {
            return;            
        }
        System.out.print(root.data + " ");
        inoder(root.left);
        inoder(root.right);
        
    }
    public static void main(String[] args) {
        int nodes [] = {1,3,3,-1,-1,2,-1,-1,3,-1,-1};

        Binary_Tree tree = new Binary_Tree();
        node root = tree.Binary_Tree(nodes);
        inoder(root);System.out.println();
        delLeave(root, 3);
        inoder(root);
    }
}

public class Univalued_BT {
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
    static int main;
    public static boolean uniVal(node root) {
        if (root==null) return true;
        if (root.data != main ) return false;
        boolean left = uniVal(root.left);
        boolean right = uniVal(root.right);
        // if (!left || !right ) return false;
        return left && right;
    }

    public static void main(String[] args) {
        int nodes [] = {2,2,2,-1,-1,2,-1,-1,2,-1,-1};
        Binary_Tree tree = new Binary_Tree();
        node root = tree.Binary_Tree(nodes);

        main = root.data ;
        System.out.println(uniVal(root));

    }
}

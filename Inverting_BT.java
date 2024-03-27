public class Inverting_BT {
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

    public static boolean chkMir(node r1,node r2) {
        if (r1==null && r2==null) {
            return true;
        } else if (r1==null || r2==null){
            return false;
        }
        if (r1.data != r2.data) return false;

        return chkMir(r1.left, r2.right) && chkMir(r1.right, r2.left);        
    }

    public static void main(String[] args) {
        int nodes1 [] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        int nodes2[] = {1,3,7,-1,-1,3,-1,-1,2,5,-1,-1,4,-1,-1};

        Binary_Tree tree1 = new Binary_Tree();
        node root1 = tree1.Binary_Tree(nodes1);
        idx =-1;
        Binary_Tree tree2 = new Binary_Tree();
        node root2 = tree2.Binary_Tree(nodes2);

        System.out.println(chkMir(root1, root2));;
    }
}

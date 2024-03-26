import java.util.*;
import java.util.LinkedList;
// import queue_f_stack.queue;

public class TopView_BT {
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

    static class info{
        node node;
        int dis;

        info(node data, int dis){
            this.node=data;
            this.dis=dis;
        }
    }
    static int max;
    static int min;
    public static void topView(node root) {
        HashMap <Integer,node> map = new HashMap<>();
        Queue <info> q = new LinkedList<>();
        q.add(new info(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            info temp = q.remove();
            if (temp==null) {
                if (q.isEmpty()) {
                    break;
                } else{
                    q.add(null);
                }
            }else {
                if (!map.containsKey(temp.dis)) {
                    map.put(temp.dis, temp.node);
                }
                max = temp.dis>max ? temp.dis:max;
                min = temp.dis<min ? temp.dis:min;
                if (temp.node.left!=null) {
                    q.add(new info(temp.node.left, temp.dis-1));
                }
                if (temp.node.right!=null) {
                    q.add(new info(temp.node.right, temp.dis+1));
                }
            }
        }
        while(min<=max){
            node tmp = map.get(min);
            System.out.print(tmp.data + " ");
            min++;
        }

    }
    public static void main(String[] args) {
        int node1[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Binary_Tree tree = new Binary_Tree();
        node root = tree.Binary_Tree(node1);

        topView(root);
    }
}

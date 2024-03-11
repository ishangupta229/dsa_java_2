import java.util.Stack;
public class Push_at_bottom {
    public static void puchatbottom(Stack <Integer> s,int data) {
        if (s.empty()) {
            s.push(data);
            return;
        }
        int temp = s.pop();
        puchatbottom(s,data);
        s.push(temp);
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        puchatbottom(s, 0);
        System.out.println(s);

    }   
}

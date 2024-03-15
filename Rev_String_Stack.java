import java.util.Stack;
public class Rev_String_Stack {
    public static String rev_str(String str) {
        Stack<Character> S = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            S.push(str.charAt(i));
        }

        StringBuilder sb =new StringBuilder("");
        while (!S.empty()) {
            char temp = S.pop();
            sb.append(temp);          
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String S = "nahsi";
        String ans = rev_str(S);
        System.out.println(ans);
        
    }
}

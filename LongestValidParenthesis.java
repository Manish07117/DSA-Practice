import java.util.*;

public class longestParenthesis {
    public static int longestValidParenthesis(String s){
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    int length=i-st.peek();
                    maxLength=Math.max(maxLength,length);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s=")()())";
        System.out.println(longestValidParenthesis(s));
    }
}

import java.util.Stack;

public class first {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(12);
        st.push(14);
        st.push(10);
        st.push(18);
        st.push(17);
        st.push(16);
        System.out.println(st);
        System.out.println(st.peek());
        while(st.size()>3){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}

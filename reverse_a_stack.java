import java.util.Stack;
public class reverse_a_stack {
    public static void main(String[] args) {
        Stack<Integer> sto=new Stack<>();
        sto.push(10);
        sto.push(20);
        sto.push(30);
        sto.push(40);
        System.out.println(sto);
        Stack<Integer> str=new Stack<>();
        while(!sto.isEmpty()){
            int element=sto.pop();
            str.push(element);
        }
        System.out.println(str);
    }
}

import java.util.Stack;

public class push_element_at_bottom {
    public static void main(String[] args) {
        Stack <Integer> sto =new Stack<>();
        sto.push(10);
        sto.push(20);
        sto.push(30);
        sto.push(40);
        System.out.println(sto);
        int new_element=5;
        Stack <Integer> temp =new Stack<>();
        while(!sto.isEmpty()){
            temp.push(sto.pop());
        }
        sto.push(new_element);
        while(!temp.isEmpty()){
            sto.push(temp.pop());
        }
        System.out.println(sto);
    }
}

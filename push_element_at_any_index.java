import java.util.Stack;

public class push_element_at_any_index {
    public static void main(String[] args) {
        Stack<Integer> sto = new Stack<>();
        sto.push(10);
        sto.push(20);
        sto.push(30);
        sto.push(40);
        System.out.println(sto);
        int new_element=78;
        int pos=2;
        Stack<Integer> temp= new Stack<>();
        while(sto.size()>=pos){
            temp.push(sto.pop());
        }
        sto.push(new_element);
        while(temp.size()>0){
            sto.push(temp.pop());
        }
        System.out.println(sto);
    }
}
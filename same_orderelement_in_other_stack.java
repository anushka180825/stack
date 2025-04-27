import java.util.Stack;
public class same_orderelement_in_other_stack {
    public static void main(String[] args) {
        Stack<Integer> sto= new Stack<>();
        sto.push(10);
        sto.push(20);
        sto.push(30);
        sto.push(40);
        System.out.println(sto);
        Stack<Integer> stt= new Stack<>();
        while(!sto.isEmpty()){
            int element=sto.pop();
            stt.push(element);
        }

        Stack<Integer> sts= new Stack<>();
        while(!stt.isEmpty()){
         int sam =stt.pop();
            sts.push(sam);
        }
        System.out.println(sts);
    }
}

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        //Stack = LIFO data structure - Last In First Out
        //        stores objects into a sort of "vertical tower"
        //        push() to add to the top
        //        pop()  to remove from the top
        Stack<String> st = new Stack<>();
        System.out.println(st.empty());
        st.push("add1");
        st.push("add2");
        st.push("add3");
        st.push("add4");

        st.pop();
        String myFavFame = st.pop();
        //System.out.println(myFavFame);
        //System.out.println(st.peek());
        //System.out.println(st);
        for (int i = 0; i < 1000; i++){
            st.push("add4");
        }
        //uses of Stack
        // 1. undo/redo features of text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)
    }
}

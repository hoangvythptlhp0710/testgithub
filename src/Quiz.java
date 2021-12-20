
class A {
    public static int count = 0;
    public A(){
        count++;
    }
}
public class Quiz {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        System.out.println(a1.count);
    }
}

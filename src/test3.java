public class test3 {
    public static void main(String[] args){
        String mytext = " hello     there   ";
        mytext = mytext.replaceAll("( )+", "%");
        System.out.println(mytext);
    }
}


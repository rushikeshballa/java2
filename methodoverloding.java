public class methodoverloding {
    // method overloding 
    static int myMethod(int x,int y){
        return (x+y);
    }
    static String myMethod( String x){
        return (x+"?");
    }
    static int add(int x, int y){
        return (x+y);
    }

    public static void main(String[] args) {
       int x= myMethod(10, 20);
       System.out.println(x);
       String y =myMethod("String");
       System.out.println(y);
    }
}

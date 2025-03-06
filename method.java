public class method {
    int x=0;
    static void mymethod() {
        System.out.println("my MEthord");
    }
    // passing the arguments in method
    static void function(int x,int y){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        mymethod();
        function(10, 20);
    }
}
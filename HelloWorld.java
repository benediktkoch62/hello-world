public class HelloWorld {

    private myMethod(String str) {
        return (str);
    }
        
    public static void main(String[] args) {
        // Prints "Hello ..." to the terminal window.
        for (int i = 0; i < args.length; i++) {
            System.out.println("Hello " + myMethod(args[i]));   
        }
    }

}

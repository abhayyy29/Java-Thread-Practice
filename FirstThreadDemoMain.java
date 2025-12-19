public class FirstThreadDemoMain {
    public static void main(String[] args) {
        System.out.println("good");
        System.out.println("Hello");
        FirstThreadDemo ab = new FirstThreadDemo();
        ab.start();
        System.out.println("GoodBYe");
        System.out.println("Abhay");
        
    }
    
}

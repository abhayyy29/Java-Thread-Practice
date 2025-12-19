public class ThreadTaskMain {
    public static void main(String[] args) {
        
        System.out.println("Hello");
        System.out.println("Hi");
        Runnable r = new ThreadTask();
        Thread t = new Thread(r);
        t.start();
        System.out.println("BYe");
        System.out.println("Good");



    }
}

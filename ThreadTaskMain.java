public class ThreadTaskMain {
    public static void main(String[] args) {
        
        System.out.println("Hello");
        System.out.println("Hi");
        Runnable r = new ThreadTask();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        System.out.println("BYe");
        System.out.println("Good");



    }
}

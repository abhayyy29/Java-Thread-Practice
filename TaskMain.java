public class TaskMain {
    public static void main(String[] args) {
        
        Counter c = new Counter();
        Task tsk = new Task(c);
        Thread t1 = new Thread(tsk); 
        t1.start();
        try{
        t1.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
                }
        System.out.println(c.getCount());
    }
}

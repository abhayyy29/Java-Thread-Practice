public class QuestionMain {
    public static void main(String[] args) {
        
        Question tsk = new Question();
        Thread t1 = new Thread(tsk);
        t1.start();
         
    }
    
}

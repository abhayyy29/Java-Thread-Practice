 class Task implements Runnable {
   
     private Counter c;
     Task(Counter c){
        this.c= c;
     }
    public void run(){
        for(int i=1; i<=100;i++){
            c.setCount(i);
            System.out.println(i);
        }
    }
    
}

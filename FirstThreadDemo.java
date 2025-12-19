class FirstThreadDemo extends Thread {

    public void run() {
       Thread.currentThread().getName();
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
    }
}


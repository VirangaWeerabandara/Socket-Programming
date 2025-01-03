package Threads;

public class MultiThreading extends Thread{
    private int thread_id;

    public MultiThreading(int t){
        this.thread_id = t;
    }

    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println(i+" is from "+thread_id);

            //if(thread_id==2){
            //    throw new RuntimeException();
            //}

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}

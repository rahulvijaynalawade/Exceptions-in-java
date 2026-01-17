package therwadClass;

public class MyThread extends Thread{

    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("thread"+ Thread.currentThread().getId() + "is runing "+ i);
        }

        try{
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("thread is interrupted");
        }

    }
}


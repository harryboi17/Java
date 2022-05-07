package BASICS;
//Both thread will run concurrently
//i.e t1 will execute then t2 then again t1
class Mythread1 extends Thread{
    public void run(){
        int n = 100;
        while(n-- != 0)
            System.out.println("Harshit");
    }
}
class Mythread2 extends Thread{
    public void run(){
        int n = 100;
        while(n-- != 0)
            System.out.println("Vanshika");
    }
}

class MyThreadRun1 implements Runnable{
    public void run(){
        int n = 100;
        while(n-- != 0)
            System.out.println("Im Harshit Bansal");
    }
}
class MyThreadRun2 implements Runnable{
    public void run(){
        int n = 100;
        while(n-- != 0)
            System.out.println("Im Vanshika M");
    }
}

public class Multithreading {
    public static void main(String[] args) {
//        Mythread1 t1 = new Mythread1();
//        Mythread2 t2 = new Mythread2();
//        t1.start();
//        t2.start();

        MyThreadRun1 bullet1 = new MyThreadRun1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRun2 bullet2 = new MyThreadRun2();
        Thread gun2 = new Thread(bullet2); // Runnable dont have a start function, thus we uses Thread to run them

        gun1.start();
        gun2.start();
    }
}

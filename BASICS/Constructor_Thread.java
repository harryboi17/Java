package BASICS;

// Thread Constructors: Thread(), Thread(String), Thread(Runnable), Thread(Runnable, String)
/*
class Mythr extends Thread {
    public Mythr(String name) {
        super(name);
    }

    public void run() {
        int t = 0;
        while (t++ < 100)
            System.out.println("Harshit");
    }
}
*/


class Mythr extends Thread {
    public Mythr(String name) {
        super(name);
    }

    public void run() {
        int t = 0;
        while(true) {
            try {
                Thread.sleep(455); //pause a Thread for 455m0s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("This is " + this.getName());
        }
    }
}

public class Constructor_Thread {
    public static void main(String[] args) {
        //*************Constructor in Thread****************
//        Mythr t1 = new Mythr("Harshit");
//        Mythr t2 = new Mythr("Vanshika");
//        t1.start();
//        t2.start();
//        System.out.println("id of the thread is " + t1.getId());
//        System.out.println("name of the thread is " + t1.getName());

//        //****************Priority Order********************
//        Mythr t1 = new Mythr("Harshit1");
//        Mythr t2 = new Mythr("Harshit2 (MIN)");
//        Mythr t3 = new Mythr("Harshit3");
//        Mythr t4 = new Mythr("Harshit4");
//        Mythr t5 = new Mythr("Harshit5 (MAX)");
//        t5.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t1.start(); t2.start(); t3.start(); t4.start(); t5.start();

        //****************Thread Methods**************
        Mythr t1 = new Mythr("Harhsit");
        Mythr t2 = new Mythr("MON");

        t1.start();
//        try{
//            t1.join();
//        }catch(Exception e){
//            System.out.println(e);
//        }
        t2.start();

    }


}

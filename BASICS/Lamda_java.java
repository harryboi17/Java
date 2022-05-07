package BASICS;

interface DemoAno{
    void meth1(int a);
//    void meth2();
}
class AnoDemo implements DemoAno{
    public void display(){
        System.out.println("Hello");
    }
    @Override
    public void meth1(int a) {
        System.out.println("hii");
    }
//    @Override
//    public void meth2() {
//    }
}
public class Lamda_java {
    public static void main(String[] args) {
//        DemoAno d = new DemoAno() { //Annonymous class
//            @Override
//            public void meth1() {
//                System.out.println("Byee");
//            }
//
//            @Override
//            public void meth2() {
//
//            }
//        };
//        d.meth1();

        DemoAno ad = (a)->{System.out.println("This is lemda function" + a);}; //this can only be used when there is
                                                                                //only method in interface
        ad.meth1(4);
    }
}

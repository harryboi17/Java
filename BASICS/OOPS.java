package BASICS;
/*
class AsConstructorArg{
    Test t;

    AsConstructorArg(Test t){
        this.t=t;}

    void display(){
        System.out.println(t.i);}
}

class Test{
    int i =10;

    Test(){
        AsConstructorArg ar = new AsConstructorArg(this);
        ar.display();}

    public static void main(String[] args){
        Test t1 = new Test();
    }
}
*/

class test {
    static int count;
    public test() {
        count++;
        System.err.println("creating a new object");
    }

    public test(int val1, int val2){
        this (); //calling default constructor
        x = val1;
        y = val2;
    }

    void something(int x, int y){
        this.x = x;
        this.y = y;
    }

    void walk(){
        System.out.println("the value of x is" + x + "and y is " + y);
    }

    int x;
    int y;

    int count(int n) {
        return n;
    }
}

class developer extends test{
    public developer(int val1, int val2){
        // super(val1, val2);
        x = val1;
        y = val2;
    }

    void walk(){
        System.out.println("this is developer class walk");
    }
}

public class OOPS {

    // public void swap(int a, int b) {
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }

    public static void main(String[] arg) {
        OOPS o = new OOPS(); //create class object to access its functions

        test t = new test();
        t.x = 10;
        t.y = 20;
        System.out.println(t.x + " " + t.y);

        test t2 = new test(3, 4);
        System.err.println(t2.x + " " + t2.y);
        // swap(t.x, t.y);
        // System.out.println(t.x + " " + t.y);
        System.out.println(t.count(5));
        System.out.println(test.count);

        test t3 = new test();
        t3.something(3, 4);
        System.err.println(t3.x + " " + t3.y);
        System.out.println(test.count);

        developer d = new developer(7, 8);
        System.out.println(test.count);
        System.out.println(d.x + " " + d.y);
        d.something(1, 2);
        System.out.println(d.x + " " + d.y);

        d.walk(); //this will trigger developer class walk, since it exists. if it don't exist, then it will trigger parent class walk
    }
}
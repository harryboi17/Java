package BASICS;

/* using This to invoke current class method
class This1{

    void show(){
        System.out.println("This class show method");}

    void display(){
        System.out.println("Display Method");
        this.show();}

    public static void main(String []args){
        This1 t = new This1();
        t.display();
        new Test().show();
    }}

class Test{
    void show(){
        System.out.println("Test class show method");}
}
*/
/*
// to invoke current class constructor
class This2{

    This2(){
        System.out.println("default constructor");}


    This2(int x){
        this();
        System.out.println("parameterized constructor");}


    public static void main(String []args){
        This2 t = new This2(10);}
}
 */
/*
class ReturnObject{
    int a;

    ReturnObject(int i){
        a=i;}

    ReturnObject method(){
        ReturnObject ro = new ReturnObject(a+10);
        return ro;}

    public static void main(String []a){
        ReturnObject ro1  = new ReturnObject(2);

        ReturnObject ro2 = ro1.method();
        System.out.println("a after call "+ro2.a);
        ro2 = ro2.method();
        System.out.println("a after call "+ro2.a);
    }
}
*/
/*
//accessing inner class code from static area of outer class

class Outer1{

class Inner1{
     void show(){
	System.out.println("inner class method");}
}

void display(){
	System.out.println("Outer class method");}

public static void main(String[] args){
Outer1 o = new Outer1();
o.display();
Outer1.Inner1 i = o.new Inner1();
i.show();

//or
//Outer1.Inner1 i = new Outer1().new Inner1();
//i.show();

//or
//new Outer1().new Inner1().show();
}
}
 */

public class OOPS_2 {
}
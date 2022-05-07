package BASICS;
//Search Oracle JavaDoc for more info on this
/**
*This is a Java Documentation File, where we will learn various ways to implement JavaDoc
 * This is <i>italic</i> word<p>This is a new paragraph</p>
* @author Harshit
* @version 0.1
* @since 2022
 *@see <a href = "https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target = "_blank">Java Docs</a>
 */

public class Java_Doc{
    /**
     *
     * @param a - first Number
     * @param b - Second Number
     * @return sum of the inputs
     * @throws Exception if a or b is 0
     * @deprecated This method is deprecated please use + Operator
     */
    public int add(int a, int b) throws Exception{
        if(a == 0 || b == 0)
            throw new Exception();
        System.out.println("the sum is " +  (a+b));
        return a+b;
    }

    /**
     * Hey this is Harshit
     * @param args This is the command line argument
     */
    public static void main(String[] args) {
        System.out.println("This is my main method");
        Java_Doc j = new Java_Doc();
        try {
            j.add(0, 4);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

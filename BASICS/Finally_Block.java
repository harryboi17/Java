package BASICS;

public class Finally_Block {
    public static int greet(){
        try{
            int a = 50;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of this program"); //usually if return c gets executed
                                                                    //then without finally we won't get cout
        }
        return 0;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);

        int a = 5;
        int b = 6;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Im finally for value of b = " + b);
                // even though func ended with break, but finally got executed, even after breaking of loop
            }
            b--;
        }
    }
}

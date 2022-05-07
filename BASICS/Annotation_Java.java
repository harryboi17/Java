package BASICS;

class Anno extends Book{

    public Anno(String name, String author, String issued_to, String issued_on) {
        super(name, author, issued_to, issued_on);
    }

    @Override //this is used to check if the method below is actually overRiding another method or not
    public void Anoot(){
        System.out.println("byee");
    }

    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class Annotation_Java {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Anno a = new Anno("a", "b", "c", "d");
        a.Anoot();
        a.sum(1,2);
    }
}

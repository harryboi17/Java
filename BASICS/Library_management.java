package BASICS;
/*
    Create a Library Management system which is capable of issuing books to the students
    Books should have info like:
    1. Book name
    2. Book author
    3. Issued to
    4. Issued on
    User should be able to add book, return issued books, issue books
    Assume that all the users are registered with their names in central Database
 */

import java.util.ArrayList;

class Book{
    public String name, author, issued_to, issued_on;

    public Book(String name, String author, String issued_to, String issued_on) {
        this.name = name;
        this.author = author;
        this.issued_to = issued_to;
        this.issued_on = issued_on;
    }

    public void Anoot(){ //test method for java file Annatation
        System.out.println("hii");
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + "' |" +
                " author='" + author + "' |" +
                " issued_to='" + issued_to + "' |" +
                " issued_on='" + issued_on +"'"+
                '}';
    }
}

class Library{
    public ArrayList<Book> books;
    public ArrayList<Book> Issued = new ArrayList<>();

    public Library(ArrayList<Book> books){
        this.books = books;
    }

    public void addBook(Book book){
        System.out.println("The " + book +" has been added to the Library\n");
        this.books.add(book);
    }

    public void returnBook(Book b){
        System.out.println("The"+ b +" has been returned\n");
        this.Issued.remove(b);
        b.issued_to = "/";
        b.issued_on = "/";
        this.books.add(b);
    }

    public void issueBook(Book b, String name, String date){
        System.out.println("The book has been issued from the Library to " + name + " on " + date +"\n" );
        this.books.remove(b);
        b.issued_to = name;
        b.issued_on = date;
        this.Issued.add(b);
    }
}

public class Library_management {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Calculus", "Harshit", "/", "/");
        bk.add(b1);
        Book b2 = new Book("English", "Vanshika", "/", "/");
        bk.add(b2);
        Book b3 = new Book("SEX", "Snehil", "/", "/");
        bk.add(b3);
        Book b4 = new Book("ALL_IN_ONE", "Karishma", "/", "/");
        bk.add(b4);

        Library Lib = new Library(bk);
        Book b5 = new Book("WebDev", "Tanmay", "/", "/");
        Lib.addBook(b5);

        for(var b : Lib.books)
            System.out.println(b);
        System.out.println();

        Lib.issueBook(b3,"Dhruv", "1/22/2022");
        Lib.issueBook(b4, "Bhumika", "2/14/2022");

        for(var b : Lib.books)
            System.out.println(b);
        System.out.println();
        for(var b : Lib.Issued)
            System.out.println(b);
        System.out.println();

        Lib.returnBook(b3);

        for(var b : Lib.books)
            System.out.println(b);
        System.out.println();
        for(var b : Lib.Issued)
            System.out.println(b);
        System.out.println();


    }
}

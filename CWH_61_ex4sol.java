package com.company;

class library{
    String[] books;
    int no_of_books;
    library(){
        this.books=new String[100];
        this.no_of_books=0;
    }

    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for (String book : this.books){
            if (book==null){
                continue;
            }
            System.out.println("*"+book);
        }
    }
    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued! ");
                this.books[i]=null;
                return;
            }
            System.out.println("* "+book);
        }
        System.out.println("This book does not ");
    }
}
public class CWH_61_ex4sol {
    public static void main(String[] args) {
        library centralLibrary=new library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("c++");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("c++");
    }
}

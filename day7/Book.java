public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void display(){
        System.out.println("Book title: " +title );
        System.out.println("Book author: " +author );
        System.out.println("Book price: " +price );


    }

    public static void main(String[] args) {
        Book b1=new Book("Love", "piyush", 500);
        Book b2=new Book("Life", "Adiyta", 560);

        b1.display();
        b2.display();
    }
    
}

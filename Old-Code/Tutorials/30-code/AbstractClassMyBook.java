//Write MyBook Class
class AbstractClassMyBook extends AbstractClassBook {
    int price;
    AbstractClassMyBook(String title, String author, int price) {
        super(title, author);   
        this.price = price;
    }
    
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + this.price);
    }
}

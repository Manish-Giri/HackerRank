import java.util.*;
abstract class AbstractClassBook
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}

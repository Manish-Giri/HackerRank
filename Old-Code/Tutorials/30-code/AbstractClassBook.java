import java.util.*;
abstract class AbstractClassBook
{
    String title;
    String author;
    AbstractClassBook(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}

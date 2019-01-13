import java.util.ArrayList;

public class AplicationLibraryCatalogMain{
    public static void main(String[] args) {
        System.out.println("---------1------------");
        Novel n = new Novel();
        Album a = new Album();
        a.setName("AlbumulA1");
        n.setName("NuvelaN1");
        ArrayList<Book> books=new ArrayList<Book>();
        books.add(n);
        books.add(a);
        books.remove(a);
        for(Book i:books){
            System.out.println(i.getName());
            System.out.println("------------2---------");
        }
    }
}

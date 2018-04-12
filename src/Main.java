import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        HashSet books = new HashSet();
        int count = 0;
        while (sc.hasNext()) {
            if(count++ < 10)
            books.add(sc.next());
            else
                break;
        }
        System.out.println(books);
    }
}



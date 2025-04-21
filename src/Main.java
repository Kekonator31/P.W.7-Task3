import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

    public static void check(Hashtable<String, String> t, String word){
        if(t.containsKey(word)){
            System.out.println(word + " in Ukraine means " + t.get(word));
        }
        else{
            System.out.println(word + " doesnt have in Ukraine dictionary (Possibly)");
        }
    }

    public static void main(String[] args) {

        Hashtable<String, String> translate = new Hashtable<>();

        translate.put("Apple", "Яблуко");
        translate.put("Table", "Стіл");
        translate.put("Sun", "Сонце");

        check(translate, "Apple");

        translate.put("Table", "Парта");

        check(translate, "Table");

        translate.remove("Sun");

        check(translate, "Sun");
        check(translate, "Apple");
        check(translate, "Moon");

        System.out.println();
        System.out.println("Words and his translate:");
        for(Enumeration<String> e = translate.keys(); e.hasMoreElements();){
            String word = e.nextElement();
            System.out.println(word + " = " + translate.get(word));
        }
    }
}
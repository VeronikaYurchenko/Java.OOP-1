import javax.lang.model.element.Name;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {

//        Persona father = new Persona("Papa");
//        Persona son = new Persona("Son");
//        Persona sister = new Persona("Sister");
//        Persona grandSister = new Persona("grandSister");

        Persona papa = new Persona("Ima", "F", 33, "lib1");
        Persona son = new Persona("Sin", "F", 13, "lib2");

        papa.PersLibr.AddBook("Пушкин", "Собрание сочинений", "RU");
        papa.PersLibr.AddBook("Носов", "Незнайка на луне", "RU");
        papa.PersLibr.Cat_lib("Bengal", "Murzik");

        son.PersLibr.AddBook("Народное авторство", "Азбука", "RU");
        son.PersLibr.AddBook("", "Light blue", "RU");
        son.PersLibr.Cat_lib("Bobtail", "Pushok");
        papa.AddName(son);
        view.treeView(papa, 0);

        System.out.println("*".repeat(15));
        view.bookView(papa);

        System.out.println("*".repeat(15));
        view.bookView(son);
//        papa.Voice();
//        father.AddName(son);
//        father.AddName(sister);
//        sister.AddName(grandSister);





    }
}

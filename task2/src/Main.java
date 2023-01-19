public class Main {
    public static void main(String[] args) {

        Persona father = new Persona("John");
        Persona son = new Persona("David");
        Persona daughter = new Persona("Marta");
        Persona granddaughter = new Persona("Lena");
        Persona mother = new Persona("Liza");
        father. AddName(son);
        father. AddName(daughter);
        daughter.AddName(granddaughter);
        TreeView.view(father,1);
    }

}
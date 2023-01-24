import java.util.ArrayList;

public class Cat_lib {
    public String ABreed;
    public String AName;
    }
class Cat_Lib extends Animal{
    public String Cat_libName;
    public void Lib(String Cat_libName){
        this.Cat_libName = Cat_libName;}
    ArrayList<Cat_lib> listBreed = new ArrayList<>();

    public void AddBreed(String Breed, String AnimalName){
    Cat_lib lb = new Cat_lib();
        SetAnimalBreed(Breed);
        SetAnimalName(AnimalName);
        lb.ABreed = GetAnimalBreed();
        lb.AName = GetAnimalName();

        listBreed.add(lb);
    }

    public ArrayList<Cat_lib> getBreedList(){
        return listBreed;
    }

}
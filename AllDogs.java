import java.util.ArrayList;
import java.util.List;

public class AllDogs {
    private List<Dog> dogList;

    // Constructor
    public AllDogs() {
        this.dogList = new ArrayList<>();
    }

    // Method to add a dog to the list
    public void addDog(Dog dog) {
        dogList.add(dog);
    }

    // Method to search for a dog based on criteria
    public Dog searchDog(Dog searchDog) {
        for (Dog dog : dogList) {
            if (dog.getBreed().equals(searchDog.getBreed()) &&
                dog.getAge() == searchDog.getAge() &&
                dog.getSex().equals(searchDog.getSex()) &&
                dog.isDesexed().equals(searchDog.isDesexed())) {
                return dog; // Found a matching dog
            }
        }
        return null; // No matching dog found
    }
    
}

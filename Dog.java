public class Dog {
    private String name;
    private String breed;
    private int age;
    private String sex;
    private long microchipNumber;
    private String isDesexed;

    // Parameterized Constructor
    public Dog(String name, String breed, int age, String sex, long microchipNumber, String isDesexed) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.sex = sex;
        this.microchipNumber = microchipNumber;
        this.isDesexed = isDesexed;
    }

    // Default Constructor
    public Dog() {
        this.name = "";
        this.breed = "";
        this.age = 0;
        this.sex = "";
        this.microchipNumber = 0;
        this.isDesexed = "";
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public long getMicrochipNumber() {
        return microchipNumber;
    }

    public String isDesexed() {
        return isDesexed;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMicrochipNumber(long microchipNumber) {
        this.microchipNumber = microchipNumber;
    }

    public void setDesexed(String isDesexed) {
        this.isDesexed = isDesexed;
    }

    public String toString() {
        return "Breed: " + breed + "\nName: " + name + "\nSex: " + sex + "\nMicrochip: " +
                microchipNumber + "\nAge: " + age + "\nDesexed: " + isDesexed + ".\n";
    }
}

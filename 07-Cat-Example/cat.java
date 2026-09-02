public class cat {

    private int catId;
    private String name;
    private String breed;
    private String colour;
    private float age;

    // No-argument constructor
    public cat() {
    }

    // Parameterized constructor
    public cat(int catId, String name, String breed, String colour, float age) {
        this.catId = catId;
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.age = age;
    }

    // Another parameterized constructor
    public cat(String name, String breed, String colour, float age, int catId) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.age = age;
        this.catId = catId;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public void walk() {

        String myData = "Hi all, I'm " + name + "\n"
                + "My ID is: " + catId + "\n"
                + "My breed is: " + breed + "\n"
                + "I am " + age + " years old" + "\n"
                + "My colour is: " + colour + "\n"
                + "I am walking in my own style.";

        System.out.println(myData);
    }
}

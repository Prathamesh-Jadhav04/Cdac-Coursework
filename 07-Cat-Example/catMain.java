public class catMain {

    public static void main(String[] args) {

        cat myCat = new cat();

        myCat.setCatId(101);
        myCat.setName("wossy");
        myCat.setBreed("persian");
        myCat.setColour("Brown");
        myCat.setAge(3);

        myCat.walk();

        System.out.println("----------------------------");

        cat yourCat = new cat(102, "Sassy", "Siamese", "White", 3);

        yourCat.walk();

        System.out.println("----------------------------");

        cat ourCat = new cat(103, "Sizzly", "Bengal", "Black", 5);

        ourCat.walk();

        System.out.println("----------------------------");
    }
}

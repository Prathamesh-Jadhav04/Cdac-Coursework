public class CustomObjectsArrayExampleMain {
	
    public static void main(String[] args) {

        Book[] bookStore = new Book[4];

        bookStore[0] = new Book();
        bookStore[1] = new Book("One Piecee", 2432);
        bookStore[2] = new Book("Bleach", 4535);
        bookStore[3] = new Book(5354, "Naruto");

        for (Book currentBook : bookStore) {
            System.out.println(currentBook.getTitle().toUpperCase());
        }
    }
}

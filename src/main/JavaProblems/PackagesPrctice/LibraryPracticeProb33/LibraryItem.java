package PackagesPrctice.LibraryPracticeProb33;

public class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    public void checkOut(){
        System.out.println("Checkout the Book");
    }
    public void returnItem(String title){
        System.out.printf(" Return the book %s ", title);
    }
}

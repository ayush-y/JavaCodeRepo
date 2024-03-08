package PackagesPrctice.LibraryPracticeProb33;

public class TestLibrary {
    public static void main(String[] args) {
        LibraryItem library = new Book();
        library.checkOut();

        Magazine mag = new Magazine();
        mag.returnItem("Horror");
    }
}

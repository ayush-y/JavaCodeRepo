class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static{
        totalBooks = 0;
    }
    {// Object Init
        totalBooks++;
    }
    Book(String isbn, String title, String author){
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }
    Book(String isbn){

        this(isbn, "Unknown", "Unknown");
    }
    static int getTotalBooks(){
        return totalBooks;
    }
    public void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already Borrowed ");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the "+ this.title);
        }
    }
    public void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed the Book ");
        } else{
            System.out.println("Book is already available in library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}

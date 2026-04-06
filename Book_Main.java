public class Book_Main {
  public static void main(String[] args) {

    Book book1 = new Book("Java", "Zainab Kashif");
    Book book2 = new Book("Twinkling watermelon");

    book1.returnBook();
    book1.borrowBook();

    System.out.println("\nBook 1 Details:");
    book1.displayBookInfo();

    System.out.println("\nBook 2 Details:");
    book2.displayBookInfo();
  }
}

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("alexander", "Pushkin", "Sergeevich");
        Author author2 = new Author("Ivan", "Turgenev", "Sergeevich");

        Book book1 = new Book("eugene Onegin", author1);
        Book book2 = new Book("Fathers and Sons", author2);

        Book[] library = {book1, book2};

        printBook(library);
    }


    public static void printBook(Book[] library) {
        for (Book b : library) {
            System.out.println("\"" + capitalize(b.getBookName()) + "\": " +
                    capitalize(b.getAuthor().getFirstName()) + " " + b.getAuthor().getMiddleName() +
                    " " + b.getAuthor().getLastName());
        }
    }

    public static String capitalize(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}




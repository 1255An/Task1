public class Main {
    public static void main(String[] args) {
        Book[] library = {new Book("Eugene Onegin", "Alexander Sergeevich Pushkin"),
                new Book("Fathers and Sons", "Ivan Sergeevich Turgenev"),
                new Book("The Idiot", "Fyedor Michailovich Dostoevsky")};

        System.out.println(convertArrayToString(library, ",\n"));
    }

    public static String convertArrayToString(Book[]library, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for(Book obj:library) {
            sb.append(obj.toString()).append(delimiter);
        } return sb.substring(0,sb.length()-1);
    }
}

class Book {
    private String bookName;
    private String authorName;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public String authorName() {
        return authorName;
    }

    @Override
    public String toString() {
        String result = "\"" + this.bookName + "\":" + this.authorName;
        return result;
    }
}

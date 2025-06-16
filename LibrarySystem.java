class LibraryItem {
    private String title;
    private String author;
    private int id;

    public LibraryItem(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
    }
}

class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, int id, String genre) {
        super(title, author, id);
        this.genre = genre;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Genre: " + genre);
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int id, int issueNumber) {
        super(title, author, id);
        this.issueNumber = issueNumber;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Issue Number: " + issueNumber);
    }
}

class Newspaper extends LibraryItem {
    private String publicationFrequency;

    public Newspaper(String title, String author, int id, String publicationFrequency) {
        super(title, author, id);
        this.publicationFrequency = publicationFrequency;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Publication Frequency: " + publicationFrequency);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] catalog = {
            new Book("AAA", "Donald", 1, "Action"),
            new Magazine("BBB", "Authors", 2, 42),
            new Newspaper("CCC", "EEEE", 3, "Daily")
        };

        for (LibraryItem item : catalog) {
            item.getInfo();
            System.out.println();
        }
    }
}

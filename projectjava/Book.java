package projectjava;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    public void displayInfo() {
        System.out.println("ID     : " + id);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Status : " + (isIssued ? "Issued" : "Available"));
        System.out.println("------------------------------");
    }

    public String toString() {
        return id + "," + title + "," + author + "," + isIssued;
    }
}


public class Book extends Document{
    private String author;
    private int pageNumber;

    public Book(String code, String publishingCompany, int releaseNumber, String author, int pageNumber) {
        super(code, publishingCompany, releaseNumber);
        this.author = author;
        this.pageNumber = pageNumber;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pageNumber=" + pageNumber +
                ", code='" + code + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}

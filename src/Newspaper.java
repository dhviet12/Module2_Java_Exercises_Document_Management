public class Newspaper extends Document{
    public String datePublishing;

    public Newspaper(String code, String publishingCompany, int releaseNumber, String datePublishing) {
        super(code, publishingCompany, releaseNumber);
        this.datePublishing = datePublishing;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "code='" + code + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", releaseNumber=" + releaseNumber +
                ", datePublishing='" + datePublishing + '\'' +
                '}';
    }
}

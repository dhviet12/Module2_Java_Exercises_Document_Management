public class Document {
    String code;
    String publishingCompany;
    int releaseNumber;

    public Document(String code, String publishingCompany, int releaseNumber) {
        this.code = code;
        this.publishingCompany = publishingCompany;
        this.releaseNumber = releaseNumber;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Document{" +
                "code='" + code + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}

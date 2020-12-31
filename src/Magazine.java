public class Magazine extends Document{
    private int numberPublishing;
    private int monthPublishing;

    public Magazine(String code, String publishingCompany, int releaseNumber, int numberPublishing, int monthPublishing) {
        super(code, publishingCompany, releaseNumber);
        this.numberPublishing = numberPublishing;
        this.monthPublishing = monthPublishing;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "code='" + code + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", releaseNumber=" + releaseNumber +
                ", numberPublishing=" + numberPublishing +
                ", monthPublishing=" + monthPublishing +
                '}';
    }
}

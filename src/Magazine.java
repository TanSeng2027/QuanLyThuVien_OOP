
public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String id, String title, int year, int issueNumber) {
        super(id, title, year);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() { return issueNumber; }

    @Override
    public int getLoanDays() {
        return 7;
    }

    @Override
    public double getLateFeePerDay() {
        return 3000.0;
    }
}
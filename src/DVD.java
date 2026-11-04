
public class DVD extends LibraryItem {
    private int durationMinutes;

    public DVD(String id, String title, int year, int durationMinutes) {
        super(id, title, year);
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() { return durationMinutes; }

    @Override
    public int getLoanDays() {
        return 3;
    }

    @Override
    public double getLateFeePerDay() {
        return 10000.0;
    }
}
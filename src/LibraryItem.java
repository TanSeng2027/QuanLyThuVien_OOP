
public abstract class LibraryItem {
    private String id;
    private String title;
    private int year;
    private boolean available;

    // Constructor
    public LibraryItem(String id, String title, int year){
        if (id == null || id.trim().isEmpty()){
            throw new IllegalArgumentException("ID khong duoc de trong");
        }
        if (title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("Title khong duoc de trong");
        }
        if(year < 0){
            throw new IllegalArgumentException("Year khong duoc am");
        }

        this.id = id;
        this.title = title;
        this.year = year;
        this.available = true;
    }
    // Set và get
    public String getID(){return id;}
    public String getTitle(){return title;}
    public int getYear(){return year;}
    public boolean isAvailable(){return available;}

    public void setAvailable (boolean available){this.available = available;}

    // Abstract methods
    public abstract int getLoanDays();
    public abstract double getLateFeePerDay();

    public double calculateLateFee(int daysLate){
        if (daysLate <= 0){return 0;}
        return daysLate * getLoanDays();
    }

}

public class Main {
    public static void main(String[] args) {
        try {
            LibraryItem book = new Book("B01", "Clean Code", 2008, "Robert C. Martin", 464);
            LibraryItem magazine = new Magazine("M01", "Java Magazine", 2026, 15);
            LibraryItem dvd = new DVD("D01", "Spring Boot Basics", 2023, 120);

            System.out.println("--- THÔNG TIN TÀI LIỆU ---");
            System.out.println(book.getTitle() + " - Số ngày mượn: " + book.getLoanDays() + " - Phí trễ 3 ngày: " + book.calculateLateFee(3));
            System.out.println(magazine.getTitle() + " - Số ngày mượn: " + magazine.getLoanDays() + " - Phí trễ 3 ngày: " + magazine.calculateLateFee(3));
            System.out.println(dvd.getTitle() + " - Số ngày mượn: " + dvd.getLoanDays() + " - Phí trễ 3 ngày: " + dvd.calculateLateFee(3));

            // Test Validation
            System.out.println("\n--- TEST NGOẠI LỆ ---");
            LibraryItem errorBook = new Book("", "Lỗi ID", 2020, "Ẩn danh", 100);

        } catch (IllegalArgumentException e) {
            System.out.println("Bắt được lỗi tạo dữ liệu sai: " + e.getMessage());
        }
    }
}
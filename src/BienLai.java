import java.util.Scanner;

public class BienLai extends KhachHang {
    private int oldNumber;
    private int newNumber;

    public BienLai() {
    }

    public BienLai(int oldNumber, int newNumber, double total) {
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
    }

    public BienLai(String name, int houseNumber, int numberElectric, int oldNumber, int newNumber, double total) {
        super(name, houseNumber, numberElectric);
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public void addNewInvoice() {
        Scanner scanner = new Scanner(System.in);
        super.addNewCustomer();
        System.out.println("Nhập số điện cũ: ");
        oldNumber = scanner.nextInt();
        System.out.println("Nhập số điện mới: ");
        newNumber = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() +
                " BienLai {" +
                "oldNumber=" + oldNumber +
                ", newNumber=" + newNumber +
                '}';
    }

}

import java.util.Scanner;

public class KhachHang {
    private String name;
    private int houseNumber;
    private int numberElectric;

    public KhachHang() {
    }

    public KhachHang(String name, int houseNumber, int numberElectric) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.numberElectric = numberElectric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getNumberElectric() {
        return numberElectric;
    }

    public void setNumberElectric(int numberElectric) {
        this.numberElectric = numberElectric;
    }

    public void addNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("----------");
        System.out.println("Nhập tên khách hàng: ");
        name = scanner.nextLine();
        System.out.println("Nhập số nhà: ");
        houseNumber = scanner1.nextInt();
        System.out.println("Nhập mã số công tơ: ");
        numberElectric = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "KhachHang {" +
                "name='" + name + '\'' +
                ", houseNumber=" + houseNumber +
                ", numberElectric=" + numberElectric +
                '}';
    }

}

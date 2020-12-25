import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyChucNang quanLyChucNang = new QuanLyChucNang();
        System.out.println("Quản lý tiền điện");
        int number;
        do {
            infoSwitch();
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    //Nhập thông tin sử dụng điện
                    quanLyChucNang.addNewInvoice();
                    break;
                case 2:
                    //Hiển thị thông tin
                    quanLyChucNang.showInfoInvoice();
                    break;
                case 3:
                    //Tính total
                    quanLyChucNang.totalPrice();
                    break;
            }
        } while (number != 0);

    }

    public static void infoSwitch() {
        System.out.println("1. Nhập thông tin");
        System.out.println("2. Hiển thị thông tin");
        System.out.println("3. Tính tổng tiền điện");
        System.out.print("Choice number: ");
    }

}

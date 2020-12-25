import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyChucNang {
    ArrayList<BienLai> arrbienLai = new ArrayList<>();

    public void addNewInvoice() {
        BienLai bienLai = new BienLai();
        bienLai.addNewInvoice();
        arrbienLai.add(bienLai);
    }

    public void showInfoInvoice() {
        for (int i = 0; i < arrbienLai.size(); i++) {
            System.out.println(arrbienLai.get(i));
        }
    }

    public void totalPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nhà muốn xem tổng tiền: ");
        int houseNumber = scanner.nextInt();
        double total = 0;
        for (int i = 0; i < arrbienLai.size(); i++) {
            if (houseNumber == arrbienLai.get(i).getHouseNumber()) {
                total = (arrbienLai.get(i).getNewNumber() - arrbienLai.get(i).getOldNumber()) * 750;
            }
        }
        System.out.println("Tổng tiền: " + total);
    }
}

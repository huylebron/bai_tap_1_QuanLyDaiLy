import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {

    private ArrayList<DaiLyQuanLy> danhSachDaiLy;

    public QuanLy() {
        danhSachDaiLy = new ArrayList<>();
    }

    public void nhapDanhSachDaiLy() {
        Scanner scanner = new Scanner(System.in);
        String tiepTuc;

        do {
            DaiLyQuanLy daiLy = new DaiLyQuanLy();
            try {
                daiLy.nhapThongTin();
                danhSachDaiLy.add(daiLy);
            } catch (Exception e) {
                System.out.println("Có lỗi xảy ra: " + e.getMessage());
            }

            System.out.print(" muốn nhập thêm ko: ");
            tiepTuc = scanner.nextLine();
        } while (tiepTuc.equalsIgnoreCase("yes"));
    }

    public void hienThiDanhSachDaiLy() {
        if (danhSachDaiLy.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            System.out.println("Danh sách đại lý:");
            for (DaiLyQuanLy daiLy : danhSachDaiLy) {
                daiLy.hienThiThongTin();

            }
        }
    }

    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        quanLy.nhapDanhSachDaiLy();
        quanLy.hienThiDanhSachDaiLy();
    }
}

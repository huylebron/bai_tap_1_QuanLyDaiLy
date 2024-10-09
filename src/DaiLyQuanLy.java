import java.util.Scanner;

public class DaiLyQuanLy extends DaiLy{

    @Override
    public boolean kiemTraMaDaiLy() {
            if (getMaDaiLy() == null) {
                return false;
            }
            if (getMaDaiLy().length() != 6) {
                return false;
            }
            if (!getMaDaiLy().substring(0, 2).equals("DL")) {
                return false;
            }
            String phanSo = getMaDaiLy().substring(2);
            try {
                Integer.parseInt(phanSo);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Nhập mã đại lý  ");
            setMaDaiLy(scanner.nextLine());
        } while (!kiemTraMaDaiLy());
        System.out.print("Nhập tên đại lý: ");
        setTenDaiLy(scanner.nextLine());

        System.out.print("Nhập địa chỉ: ");
        setDiaChi(scanner.nextLine());
    }
}

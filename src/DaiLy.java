import java.util.Scanner;

public class DaiLy {
    private String maDaiLy;
    private String tenDaiLy;
    private String diaChi;

    public DaiLy() {
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Nhập mã đại lý: ");
            maDaiLy = scanner.nextLine();
        } while (!kiemTraMaDaiLy());

        System.out.print("Nhập tên đại lý: ");
        tenDaiLy = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Mã đại lý: " + maDaiLy);
        System.out.println("Tên đại lý: " + tenDaiLy);
        System.out.println("Địa chỉ: " + diaChi);
    }

    public boolean kiemTraMaDaiLy() {
        return maDaiLy != null && maDaiLy.startsWith("DL");
    }

    // Getters and setters
    public String getMaDaiLy() {
        return maDaiLy;
    }

    public void setMaDaiLy(String maDaiLy) {
        this.maDaiLy = maDaiLy;
    }

    public String getTenDaiLy() {
        return tenDaiLy;
    }

    public void setTenDaiLy(String tenDaiLy) {
        this.tenDaiLy = tenDaiLy;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


}

import java.util.Scanner;

public class KhachHang extends Nguoi {
    private int maKhachHang;
    private String soTaiKhoan;

    public KhachHang(){

    }

    public KhachHang(String hoTen, String gioiTinh, String diaChi, String soDienThoai, int maKhachHang, String soTaiKhoan) {
        super(hoTen, gioiTinh, diaChi, soDienThoai);
        this.maKhachHang = maKhachHang;
        this.soTaiKhoan = soTaiKhoan;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    @Override
    public String toString() {
        return "KHACHHANG{" +
                "maKhachHang=" + maKhachHang +
                ", soTaiKhoan='" + soTaiKhoan + '\'' +
                '}';
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã khách hàng (Chỉ nhập số): ");
        maKhachHang =Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số tài khoản ngân hàng (Nếu có): ");
        soTaiKhoan = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%20s|%20s|%n", getMaKhachHang(), getSoTaiKhoan());
    }

}

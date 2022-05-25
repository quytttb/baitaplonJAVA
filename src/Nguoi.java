import java.io.Serializable;
import java.util.Scanner;

public abstract class Nguoi implements IGiaoDien, Serializable {
    private String hoTen, gioiTinh, diaChi, soDienThoai;

    public Nguoi(){

    }

    public Nguoi(String hoTen, String gioiTinh, String diaChi, String soDienThoai) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }

    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen=sc.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh=sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi=sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        soDienThoai=sc.nextLine();
    }

    public void xuat(){
        System.out.printf("%30s|%10s|%30S|%20S|", getHoTen(), getGioiTinh(), getDiaChi(), getSoDienThoai());
    }
}

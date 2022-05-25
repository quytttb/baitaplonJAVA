import java.util.Scanner;

public class NhanVien extends Nguoi {
    private int maNhanVien;
    private String chucVu;
    private float heSoLuong;
    private int soNgayLam;

    public int luong(){
        return (int) (3000*getHeSoLuong()*getSoNgayLam()); //3000 là lương cơ bản
    }

    public NhanVien(){

    }

    public NhanVien(String hoTen, String gioiTinh, String diaChi, String soDienThoai, int maNhanVien, String chucVu, float heSoLuong, int soNgayLam) {
        super(hoTen, gioiTinh, diaChi, soDienThoai);
        this.maNhanVien = maNhanVien;
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
        this.soNgayLam = soNgayLam;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    @Override
    public String toString() {
        return "NHANVIEN{" +
                "maNhanVien=" + maNhanVien +
                ", chucVu='" + chucVu + '\'' +
                ", heSoLuong=" + heSoLuong +
                ", ngayLam=" + soNgayLam +
                '}';
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập chức vụ: ");
        chucVu=sc.nextLine();
        System.out.print("Nhập mã nhân viên (Chỉ nhập số): ");
        maNhanVien =sc.nextInt();
        System.out.print("Nhập hệ số lương : ");
        heSoLuong=sc.nextFloat();
        System.out.print("Nhập số ngày làm: ");
        soNgayLam =sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%20s|%15s|%15.1f|%15s|%15.1f|%n", getMaNhanVien(), getChucVu(), getHeSoLuong(), getSoNgayLam(), luong());
    }

}

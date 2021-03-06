import java.io.*;
import java.util.*;

public class HoaDon implements IGiaoDien, Serializable {
    private int maKhachHang, maVatLieu, maHoaDon, maNhanVien;
    private String ngayLap, hinhThucThanhToan;

    DSNhanVien dsnv = new DSNhanVien();
    DSVatLieu dsvl =new DSVatLieu();
    DSKhachHang dskh =new DSKhachHang();

    public HoaDon() {
    }

    public HoaDon(int maKhachHang, int maVatLieu, int maHoaDon, int maNhanVien, String ngayLap, String hinhThucThanhToan) {
        this.maKhachHang = maKhachHang;
        this.maVatLieu = maVatLieu;
        this.maHoaDon = maHoaDon;
        this.maNhanVien = maNhanVien;
        this.ngayLap = ngayLap;
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getMaVatLieu() {
        return maVatLieu;
    }

    public void setMaVatLieu(int maVatLieu) {
        this.maVatLieu = maVatLieu;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }


    @Override
    public String toString() {
        return "HoaDon{" +
                "maKhachHang=" + maKhachHang +
                ", maVatLieu=" + maVatLieu +
                ", maHoaDon=" + maHoaDon +
                ", maNhanVien=" + maNhanVien +
                ", ngayLap='" + ngayLap + '\'' +
                ", hinhThucThanhToan='" + hinhThucThanhToan + '\'' +
                ", dsnv=" + dsnv +
                ", dsvl=" + dsvl +
                ", dskh=" + dskh +
                '}';
    }

    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nh???p m?? ho?? ????n: ");
        maHoaDon=sc.nextInt();
        System.out.print("Nh???p m?? kh??ch h??ng (trong danh s??ch): ");
        maKhachHang=sc.nextInt();
        System.out.print("Nh???p m?? nh??n vi??n l???p ho?? ????n (trong danh s??ch): ");
        maNhanVien=sc.nextInt();
        System.out.print("Nh???p m?? v???t li???u (trong danh s??ch): ");
        maVatLieu=sc.nextInt();
        sc.nextLine();
        System.out.print("Nh???p ng??y l???p: ");
        ngayLap=sc.nextLine();
        System.out.print("Nh???p h??nh th???c thanh to??n: ");
        hinhThucThanhToan=sc.nextLine();
    }

    //?????i chi???u m?? kh??ch h??ng ??? ho?? ????n
    public void doiChieuKH() {
        dskh.docFile("khachhang.txt");
        for (int i = 0; i < dskh.dsKhachHang.size(); i++) {
            if (dskh.dsKhachHang.get(i).getMaKhachHang() == getMaKhachHang()) {
                System.out.printf("%30s|%20s|%20s|", dskh.dsKhachHang.get(i).getHoTen(), dskh.dsKhachHang.get(i).getSoDienThoai(), dskh.dsKhachHang.get(i).getSoTaiKhoan());
            }
        }
    }
    //?????i chi???u m?? nh??n vi??n ??? ho?? ????n
    public void doiChieuNV() {
        dsnv.docFile("nhanvien.txt");
        for (int i = 0; i < dsnv.dsNhanVien.size(); i++) {
            if (dsnv.dsNhanVien.get(i).getMaNhanVien() == getMaNhanVien()) {
                System.out.printf("%30s|", dsnv.dsNhanVien.get(i).getHoTen());
            }
        }
    }
    //?????i chi???u m?? v???t li???u ??? ho?? ????n
    public void doiChieuVL(){
        dsvl.docFile("vatlieu.txt");
        for(int i = 0; i< dsvl.dsVatLieu.size(); i++){
            if(dsvl.dsVatLieu.get(i).getMaVatLieu()== getMaVatLieu()){
                System.out.printf("%20s|", dsvl.dsVatLieu.get(i).getTenVatLieu());
            }
        }
    }
    public void tongTien() {
        dsvl.docFile("vatlieu.txt");
        float demTien = 0;
        for (int i = 0; i < dsvl.dsVatLieu.size(); i++) {
            if (dsvl.dsVatLieu.get(i).getMaVatLieu() == getMaVatLieu()) {
                demTien += dsvl.dsVatLieu.get(i).thanhTien();
                System.out.printf("%15.1f|", demTien);
            }
        }
    }


    @Override
    public void xuat() {
        System.out.printf("%20s|", getMaHoaDon());
        doiChieuKH();
        doiChieuNV();
        System.out.printf("%25s|", getHinhThucThanhToan());
        doiChieuVL();
        tongTien();
        System.out.printf("%15s|%n", getNgayLap());

    }
}

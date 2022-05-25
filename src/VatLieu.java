import java.io.Serializable;
import java.util.Scanner;

public class VatLieu implements IGiaoDien, Serializable {
    private String tenVatLieu;
    private int maVatLieu;
    private float gia;
    private int soLuong;
    private String hangSanXuat;

    public float thanhTien (){
        return getGia()*getSoLuong();
    }

    public VatLieu(){

    }

    public VatLieu(String tenVatLieu, int maVatLieu, float gia, int soLuong, String hangSanXuat) {
        this.tenVatLieu = tenVatLieu;
        this.maVatLieu = maVatLieu;
        this.gia = gia;
        this.soLuong = soLuong;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenVatLieu() {
        return tenVatLieu;
    }

    public void setTenVatLieu(String tenVatLieu) {
        this.tenVatLieu = tenVatLieu;
    }

    public int getMaVatLieu() {
        return maVatLieu;
    }

    public void setMaVatLieu(int maVatLieu) {
        this.maVatLieu = maVatLieu;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    @Override
    public String toString() {
        return "VATLIEU{" +
                "tenVatLieu='" + tenVatLieu + '\'' +
                ", maVatLieu=" + maVatLieu +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                '}';
    }

    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tên vật liệu: ");
        tenVatLieu =sc.nextLine();
        System.out.print("Nhập mã vật liệu: ");
        maVatLieu =Integer.parseInt(sc.nextLine());
        System.out.print("Nhập hãng sản xuất: ");
        hangSanXuat =sc.nextLine();
        System.out.print("Nhập giá vật liệu: ");
        gia =Float.parseFloat(sc.nextLine());
        System.out.print("Nhập số lượng vật liệu: ");
        soLuong =sc.nextInt();
    }

    @Override
    public void xuat() {
        System.out.printf("%20s|%20s|%15s|%10.1f|%10s|%15.1f|%n", getTenVatLieu(),getMaVatLieu(), getHangSanXuat(), getGia(), getSoLuong(), thanhTien());
    }

}

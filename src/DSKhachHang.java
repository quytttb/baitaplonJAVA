import java.io.*;
import java.util.*;

public class DSKhachHang implements Serializable{


    ArrayList<KhachHang> dsKhachHang = new ArrayList<>();

    public void NhapDSKH() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng khách hàng: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            KhachHang KH = new KhachHang();
            System.out.println("Nhập khách hàng thứ "+(i+1)+":");
            KH.nhap();
            dsKhachHang.add(KH);
        }
    }
    public void xuatDSKH(){
        System.out.printf("%30s|%10s|%30s|%20s|%20s|%20s|%n","Họ tên","Giới tính","Địa chỉ","Số điện thoại","Mã khách hàng","Số tk ngân hàng");
        for (int i = 0; i< dsKhachHang.size(); i++){
            dsKhachHang.get(i).xuat();
        }
    }
    //tìm kiếm khách hàng theo tên
    public void timKiemKH() {
        String tenCanTim;
        System.out.print("Nhập tên khách hàng cần tìm: ");
        Scanner sc = new Scanner(System.in);
        tenCanTim = sc.nextLine();
        System.out.println("Thông tin khách hàng cần tìm: ");
        System.out.printf("%30s|%10s|%30s|%20s|%20s|%20s|%n","Họ tên","Giới tính","Địa chỉ","Số điện thoại","Mã khách hàng","Số tk ngân hàng");
        for(int i = 0; i< dsKhachHang.size(); i++){
            if(dsKhachHang.get(i).getHoTen().equalsIgnoreCase(tenCanTim)){
                dsKhachHang.get(i).xuat();
            }
        }
    }


    //xóa khách hàng theo mã
    public void xoaKH(){
        int maCanXoa;
        System.out.print("Nhập mã khách hàng cần xóa: ");
        Scanner sc=new Scanner(System.in);
        maCanXoa=sc.nextInt();
        System.out.println("Thông tin danh sách sau khi xóa: ");
        for (int i = 0; i< dsKhachHang.size(); i++){
            if(dsKhachHang.get(i).getMaKhachHang()==maCanXoa){
                dsKhachHang.remove(i);
            }
        }
        xuatDSKH();
    }
    //Sắp Xếp khách hàng
    public void sxKH() {
        Collections.sort(dsKhachHang, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        Collections.reverse(dsKhachHang);
        System.out.println("Danh sách sau khi sắp xếp là: ");
        xuatDSKH();
    }
    //Ghi file
    public void ghiFile(String fileName) throws FileNotFoundException {
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream Oout=new ObjectOutputStream(fout);
            Oout.flush();
            Oout.writeObject(dsKhachHang);
            fout.close();
            Oout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Đọc File
    public void docFile(String fileName){
        try {
            FileInputStream fin=new FileInputStream(fileName);
            ObjectInputStream Oin=new ObjectInputStream(fin);
            dsKhachHang =(ArrayList<KhachHang>)Oin.readObject();
            fin.close();
            Oin.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

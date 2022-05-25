import java.io.*;
import java.util.*;

public class DSHoaDon {
    ArrayList<HoaDon> listHD=new ArrayList();
    public void NhapDSHD(){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số lượng hóa đơn: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            HoaDon HD=new HoaDon();
            System.out.println("Nhập hóa đơn thứ "+(i+1));
            HD.nhap();
            listHD.add(HD);
        }
    }
    public void XuatDSHD(){
        System.out.printf("%20s|%30s|%20s|%20s|%30s|%25s|%20s|%15s|%15s|%n" , "Mã hoá đơn", "Tên khách hàng","Số điện thoại","Số tk ngân hàng", "Tên nhân viên lập", "Hình thức thanh toán", "Tên vật liệu", "Giá tiền", "Ngày lập");
        for(int i=0;i<listHD.size();i++){
            listHD.get(i).xuat();
        }
    }
    //tìm kiếm HD theo mã
    public void timKiemHD() {
        int maCanTim;
        System.out.print("Nhập mã hóa đơn cần tìm: ");
        Scanner sc = new Scanner(System.in);
        maCanTim = sc.nextInt();
        System.out.println("Thông tin hóa đơn cần tìm: ");
        System.out.printf("%20s|%30s|%20s|%20s|%30s|%25s|%20s|%15s|%15s|%n" , "Mã hoá đơn", "Tên khách hàng","Số điện thoại","Số tk ngân hàng", "Tên nhân viên lập", "Hình thức thanh toán", "Tên vật liệu", "Giá tiền", "Ngày lập");
        for(int i=0;i<listHD.size();i++){
            if(listHD.get(i).getMaHoaDon()==maCanTim){
                listHD.get(i).xuat();
            }
        }
    }
    //xóa HD theo mã HD
    public void xoaHD(){
        int maCanXoa;
        System.out.print("Nhập mã hóa đơn cần xóa: ");
        Scanner sc=new Scanner(System.in);
        maCanXoa=sc.nextInt();
        System.out.println("Thông tin danh sách sau khi xóa: ");
        for (int i=0;i<listHD.size();i++){
            if(listHD.get(i).getMaHoaDon()==maCanXoa){
                listHD.remove(i);
            }
        }
        XuatDSHD();
    }

    //Ghi file
    public void ghiFile(String fileName) throws FileNotFoundException {
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream Oout=new ObjectOutputStream(fout);
            Oout.flush();
            Oout.writeObject(listHD);
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
            listHD=(ArrayList<HoaDon>)Oin.readObject();
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

import java.io.*;
import java.util.*;

public class DSNhanVien implements Serializable{

    ArrayList<NhanVien> dsNhanVien =new ArrayList();
    public void nhapDSNV(){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            NhanVien nv=new NhanVien();
            System.out.println("Nhập nhân viên thứ "+(i+1)+":");
            nv.nhap();
            dsNhanVien.add(nv);
        }
    }
    public void xuatDSNV(){
        System.out.printf("%30s|%10s|%30S|%20S|%20s|%15s|%15s|%15s|%15s|%n", "Họ tên", "Giới tính", "Địa chỉ", "Số điện thoại", "Mã nhân viên", "Chức Vụ", "Hệ số lương", "Số ngày Làm", "Lương");
        for(int i = 0; i< dsNhanVien.size(); i++){
            dsNhanVien.get(i).xuat();
        }
    }
    //tìm kiếm nhân viên theo tên
    public void timKiemNV() {
        String tenCanTim;
        System.out.print("Nhập tên nhân viên cần tìm: ");
        Scanner sc = new Scanner(System.in);
        tenCanTim = sc.nextLine();
        System.out.println("Thông tin nhân viên cần tìm: ");
        System.out.printf("%30s|%10s|%30s|%20s|%20s|%15s|%15s|%15s|%15s|%n", "Họ tên", "Giới tính", "Địa chỉ", "Số điện thoại", "Mã nhân viên", "Chức Vụ", "Hệ số lương", "Số ngày Làm", "Lương");
        for(int i = 0; i< dsNhanVien.size(); i++){
            if(dsNhanVien.get(i).getHoTen().equalsIgnoreCase(tenCanTim)){
                dsNhanVien.get(i).xuat();
            }
        }
    }

    //xóa nhân viên theo mã
    public void xoaNV(){
        int tenCanXoa;
        System.out.print("Nhập mã nhân viên cần xóa: ");
        Scanner sc=new Scanner(System.in);
        tenCanXoa=sc.nextInt();
        System.out.println("Thông tin danh sách sau khi xóa: ");
        for (int i = 0; i< dsNhanVien.size(); i++){
            if(dsNhanVien.get(i).getMaNhanVien()==tenCanXoa){
                dsNhanVien.remove(i);
            }
        }
        xuatDSNV();
    }
    //Sắp Xếp nhân viên
    public void sapxepNV() {
        Collections.sort(dsNhanVien, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        Collections.reverse(dsNhanVien);
        System.out.println("Danh sách sau khi sắp xếp là: ");
        xuatDSNV();
    }
    //Ghi file
    public void ghiFile(String fileName) throws FileNotFoundException {
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream Oout=new ObjectOutputStream(fout);
            Oout.flush();
            Oout.writeObject(dsNhanVien);
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
            dsNhanVien =(ArrayList<NhanVien>)Oin.readObject();
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
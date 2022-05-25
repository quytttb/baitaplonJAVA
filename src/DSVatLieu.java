import java.io.*;
import java.util.*;

public class DSVatLieu implements Serializable{

    ArrayList<VatLieu> dsVatLieu =new ArrayList();
    public void nhapDSVL(){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số lượng vật liệu: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            VatLieu VL=new VatLieu();
            System.out.println("Nhập vật liệu "+(i+1));
            VL.nhap();
            dsVatLieu.add(VL);
        }
    }
    public void xuatDSVL(){
        System.out.printf("%20s|%20s|%15s|%10s|%10s|%15s|%n" ,"Tên vật liệu", "Mã vật liệu", "Hãng sản xuất","Giá","Số Lượng", "Thành tiền");;
        for(int i = 0; i< dsVatLieu.size(); i++){
            dsVatLieu.get(i).xuat();
        }
    }
    //tìm kiếm vật liệu theo tên
    public void timKiemVL() {
        String tenCanTim;
        System.out.print("Nhập tên vật liệu cần tìm: ");
        Scanner sc = new Scanner(System.in);
        tenCanTim = sc.nextLine();
        System.out.println("Thông tin vật liệu cần tìm là: ");
        System.out.printf("%20s|%20s|%15s|%10s|%10s|%15s|%n" ,"Tên vật liệu", "Mã vật liệu", "Hãng sản xuất","Giá","Số Lượng", "Thành tiền");;
        for(int i = 0; i< dsVatLieu.size(); i++){
            if(dsVatLieu.get(i).getTenVatLieu().equalsIgnoreCase(tenCanTim)){
                dsVatLieu.get(i).xuat();
            }
        }
    }

    //xóa vật liệu theo mã vl
    public void xoaVL(){
        int maCanXoa;
        System.out.print("Nhập mã vật liệu cần xóa: ");
        Scanner sc=new Scanner(System.in);
        maCanXoa=sc.nextInt();
        System.out.println("Thông tin danh sách sau khi xóa: ");
        for (int i = 0; i< dsVatLieu.size(); i++){
            if(dsVatLieu.get(i).getMaVatLieu()==maCanXoa){
                dsVatLieu.remove(i);
            }
        }
        xuatDSVL();
    }
    //Sắp Xếp VL
    public void sapxepVL() {
        Collections.sort(dsVatLieu, new Comparator<VatLieu>() {
            @Override
            public int compare(VatLieu o1, VatLieu o2) {
                return o1.getTenVatLieu().compareTo(o2.getTenVatLieu());
            }
        });
        Collections.reverse(dsVatLieu);
        System.out.print("Danh sách sau khi sắp xếp là: ");
        xuatDSVL();
    }
    //Ghi file
    public void ghiFile(String fileName) throws FileNotFoundException {
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream Oout=new ObjectOutputStream(fout);
            Oout.flush();
            Oout.writeObject(dsVatLieu);
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
            dsVatLieu =(ArrayList<VatLieu>)Oin.readObject();
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

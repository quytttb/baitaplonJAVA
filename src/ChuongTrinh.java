import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChuongTrinh {
    public static void main(String[] args) throws FileNotFoundException {
        DSNhanVien dsNV = new DSNhanVien();
        DSVatLieu dsVL=new DSVatLieu();
        DSHoaDon dsHD=new DSHoaDon();
        DSKhachHang dsKH=new DSKhachHang();
        while (true){
            System.out.print("\n======================================================\n");
            System.out.print("=====CHƯƠNG TRÌNH QUẢN LÝ VẬT LIỆU XÂY DỰNG=====\n");
            System.out.print("1. Quản lý nhân viên                               ||\n");
            System.out.print("2. Quản lý khách hàng                              ||\n");
            System.out.print("3. Quản lý vật liệu                                ||\n");
            System.out.print("4. Quản lý hóa đơn                                 ||\n");
            System.out.print("0. Thoát khỏi chương trình                         ||\n");
            System.out.print("\n======================================================\n");
            System.out.print("Nhập lựa chọn của bạn: ");
            Scanner sc=new Scanner(System.in);
            int chon;
            chon=sc.nextInt();
            switch (chon){
                case 1:
                    while (chon!=-99){
                        System.out.print("\n==============================\n");
                        System.out.print("QUẢN LÝ NHÂN VIÊN\n");
                        System.out.print("1. Thêm danh sách nhân viên\n");
                        System.out.print("2. Xuất danh sách nhân viên\n");
                        System.out.print("3. Tìm kiếm nhân viên theo tên\n");
                        System.out.print("4. Xóa nhân viên theo mã nhân viên\n");
                        System.out.print("5. Sắp xếp nhân viên theo tên từ z-a\n");
                        System.out.print("6. Ghi file vào 'nhanvien.txt'\n");
                        System.out.print("7. Hiện danh sách nhân viên từ file'nhanvien.txt\n");
                        System.out.print("8. Thoát khỏi mục\n");
                        System.out.print("Nhập lựa chọn của bạn: ");
                        int i;
                        i=sc.nextInt();
                        switch (i){
                            case 1:
                                System.out.println("-----------------------------------");
                                dsNV.nhapDSNV();
                                break;
                            case 2:
                                System.out.println("-----------------------------------");
                                System.out.print("\nDanh sách nhân viên:\n");
                                dsNV.xuatDSNV();
                                break;
                            case 3:
                                System.out.println("-----------------------------------");
                                dsNV.timKiemNV();
                                break;
                            case 4:
                                System.out.println("-----------------------------------");
                                dsNV.xoaNV();
                                break;
                            case 5:
                                System.out.println("-----------------------------------");
                                dsNV.sapxepNV();
                                break;
                            case 6:
                                System.out.println("-----------------------------------");
                                dsNV.ghiFile("nhanvien.txt");
                                break;
                            case 7:
                                System.out.println("-----------------------------------");
                                dsNV.docFile("nhanvien.txt");
                                dsNV.xuatDSNV();
                                break;
                            case 8:
                                chon=-99;
                                break;
                            case 9:
                                System.exit(0);
                                break;
                        }
                    }
                    break;
                case 2:
                    while (chon!=-99){
                        System.out.print("\n==============================\n");
                        System.out.print("QUẢN LÝ KHÁCH HÀNG\n");
                        System.out.print("1. Thêm danh sách khách hàng\n");
                        System.out.print("2. Xuất danh sách khách hàng\n");
                        System.out.print("3. Tìm kiếm khách hàng theo tên\n");
                        System.out.print("4. Xóa khách hàng theo mã khách hàng\n");
                        System.out.print("5. Sắp xếp khách hàng theo tên từ z-a\n");
                        System.out.print("6. Ghi file vào 'khachhang.txt'\n");
                        System.out.print("7. Hiện danh sách nhân viên từ file'khachhang.txt\n");
                        System.out.print("8. Thoát khỏi mục\n");
                        System.out.print("Nhập lựa chọn của bạn: ");
                        int i;
                        i=sc.nextInt();
                        switch (i){
                            case 1:
                                System.out.println("-----------------------------------");
                                dsKH.NhapDSKH();
                                break;
                            case 2:
                                System.out.println("-----------------------------------");
                                System.out.print("\nDanh sách nhân viên:\n");
                                dsKH.xuatDSKH();
                                break;
                            case 3:
                                System.out.println("-----------------------------------");
                                dsKH.timKiemKH();
                                break;
                            case 4:
                                System.out.println("-----------------------------------");
                                dsKH.xoaKH();
                                break;
                            case 5:
                                System.out.println("-----------------------------------");
                                dsKH.sxKH();
                                break;
                            case 6:
                                System.out.println("-----------------------------------");
                                dsKH.ghiFile("khachhang.txt");
                                break;
                            case 7:
                                System.out.println("-----------------------------------");
                                dsKH.docFile("khachhang.txt");
                                dsKH.xuatDSKH();
                                break;
                            case 8:
                                chon=-99;
                                break;
                            case 9:
                                System.exit(0);
                                break;
                        }
                    }
                    break;
                case 3:
                    while (chon!=-99){
                        System.out.print("\n==============================\n");
                        System.out.print("QUẢN LÝ VẬT LIỆU\n");
                        System.out.print("1. Thêm danh sách vật liệu\n");
                        System.out.print("2. Xuất danh sách vật liệu\n");
                        System.out.print("3. Tìm kiếm vật liệu theo tên\n");
                        System.out.print("4. Xóa vật liệu theo mã vật liệu\n");
                        System.out.print("5. Sắp xếp vật liệu theo tên từ z-a\n");
                        System.out.print("6. Ghi file vào 'vatlieu.txt'\n");
                        System.out.print("7. Hiện danh sách nhân viên từ file'vatlieu.txt\n");
                        System.out.print("8. Thoát khỏi mục\n");
                        System.out.print("Nhập lựa chọn của bạn: ");
                        int i;
                        i=sc.nextInt();
                        switch (i){
                            case 1:
                                System.out.println("-----------------------------------");
                                dsVL.nhapDSVL();
                                break;
                            case 2:
                                System.out.println("-----------------------------------");
                                System.out.print("\nDanh sách vật liệu là: \n");
                                dsVL.xuatDSVL();
                                break;
                            case 3:
                                System.out.println("-----------------------------------");
                                dsVL.timKiemVL();
                                break;
                            case 4:
                                System.out.println("-----------------------------------");
                                dsVL.xoaVL();
                                break;
                            case 5:
                                System.out.println("-----------------------------------");
                                dsVL.sapxepVL();
                                break;
                            case 6:
                                System.out.println("-----------------------------------");
                                dsVL.ghiFile("vatlieu.txt");
                                break;
                            case 7:
                                System.out.println("-----------------------------------");
                                dsVL.docFile("vatlieu.txt");
                                dsVL.xuatDSVL();
                                break;
                            case 8:
                                chon=-99;
                                break;
                            case 9:
                                System.exit(0);
                                break;
                        }
                    }
                    break;
                case 4:
                    while (chon!=-99){
                        System.out.print("\n==============================\n");
                        System.out.print("QUẢN LÝ HÓA ĐƠN\n");
                        System.out.print("1. Thêm danh sách hóa đơn\n");
                        System.out.print("2. Xuất danh sách hóa đơn\n");
                        System.out.print("3. Tìm kiếm hóa đơn theo mã\n");
                        System.out.print("4. Xóa hóa đơn theo mã hoá đơn\n");
                        System.out.print("5. Ghi file vào 'hoadon.txt'\n");
                        System.out.print("6. Hiện danh sách nhân viên từ file'hoadon.txt\n");
                        System.out.print("7. Thoát khỏi mục\n");
                        System.out.print("Nhập lựa chọn của bạn: ");
                        int i;
                        i=sc.nextInt();
                        switch (i){
                            case 1:
                                System.out.println("-----------------------------------");
                                dsHD.NhapDSHD();
                                break;
                            case 2:
                                System.out.println("-----------------------------------");
                                System.out.print("\nDanh sách hóa đơn:\n");
                                dsHD.XuatDSHD();
                                break;
                            case 3:
                                System.out.println("-----------------------------------");
                                dsHD.timKiemHD();
                                break;
                            case 4:
                                System.out.println("-----------------------------------");
                                dsHD.xoaHD();
                                break;
                            case 5:
                                System.out.println("-----------------------------------");
                                dsHD.ghiFile("hoadon.txt");
                                break;
                            case 6:
                                System.out.println("-----------------------------------");
                                dsHD.docFile("hoadon.txt");
                                dsHD.XuatDSHD();

                                break;
                            case 7:
                                chon=-99;
                                break;
                            case 8:
                                System.exit(0);
                                break;
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}

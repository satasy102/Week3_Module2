import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class QuanLyNhanSu {
    public static final ArrayList<NhanVien> nhanSu = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static final Queue<NhanVien> NU = new PriorityQueue<NhanVien>();
    private static final Queue<NhanVien> NAM = new PriorityQueue<NhanVien>();

    public static void main(String[] args) {
        int size=nhapSoNhanSu();
        for(int i=0;i<size;i++) {
            nhapThongTin();
        }

        while (!NU.isEmpty()) {
            nhanSu.add(NU.remove());
        }

        while (!NAM.isEmpty()) {
            nhanSu.add(NAM.remove());
        }

        System.out.println(nhanSu);

    }

    public static int nhapSoNhanSu() {
        System.out.println("Nhap so luong nhan vien can nhap thong tin");
        int soLuong = 0;
        return soLuong = kiemTraDinhDangSo(soLuong);
    }

    public static void nhapThongTin() {
        System.out.println("Nhap ho ten nhan vien");
        String hoTen = sc.next();
        System.out.println("Nhap gioi tinh");
        String gioiTinhStr=sc.next();
        boolean gioiTinh=layGioiTinh(gioiTinhStr);
        System.out.println("Nhap ngay thang nam sinh");
        Date ngaysinh = null;
        ngaysinh = kiemTraDinhDangNgayThang(ngaysinh);

        NhanVien nhanVien = new NhanVien(hoTen, gioiTinh, ngaysinh);
        phanLoaiGioiTinh(nhanVien);
    }

    private static boolean layGioiTinh(String str){
        str=str.toLowerCase();
        while (!str.equals("nam")&&!str.equals("nu")){
            System.out.println("Sai du lieu. Gioi tinh chi nam hoac nu. Nhap lai:");
            str=sc.next();
            str=str.toLowerCase();
        }
        return str.equals("nam");
    }

    private static Date kiemTraDinhDangNgayThang(Date ngaysinh) {
        String str;
        while (true) {
            try {
                str = sc.next();
                ngaysinh = sdf.parse(str);
                break;
            } catch (ParseException e) {
                System.out.println("Ngay sinh sai dinh dang ngay (dd/MM/yyyy). Nhap lai:");
            }
        }
        return ngaysinh;
    }

    private static int kiemTraDinhDangSo(int num) {
        String str;
        while (true) {
            try {
                str = sc.nextLine();
                num = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.out.println("Sai dinh dang so. Nhap lai:");
            }
        }
        return num;
    }

    public static void phanLoaiGioiTinh(NhanVien nv) {
        if (nv.isGioiTinh()) {
            NAM.add(nv);
        } else NU.add(nv);
    }
}

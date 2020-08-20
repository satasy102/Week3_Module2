import java.util.*;

public class ProductManager {
    static Scanner sc=new Scanner(System.in);
    static int index;
    static ArrayList<Product> products=new ArrayList<>();

    public static void main(String[] args) {
        menu();

        System.out.println("Nhap lua chon:");
        int luaChon=0;
        luaChon=kiemTraDangSo(luaChon);

        while (true){
            switch (luaChon) {
                case 1 -> themSP();
                case 2 -> suaSP();
                case 3 -> xoaSP();
                case 4 -> hienThiDanhSachSP();
                case 5 -> timKiemTheoTenSp();
                case 6 -> sapXepSP();
                case 0 -> {
                    System.out.println("Ung dung dang tat");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Lua chon sai. Moi chon lai:");
                    luaChon = kiemTraDangSo(luaChon);
                }
            }
            System.out.println("Nhap lua chon:");
            luaChon = kiemTraDangSo(luaChon);
        }
    }

    public static void menu(){
        System.out.println("MENU");
        System.out.println("1. THEM SAN PHAM");
        System.out.println("2. SUA SAN PHAM");
        System.out.println("3. XOA SAN PHAM");
        System.out.println("4. DANH SACH SAN PHAM");
        System.out.println("5. TIM SAN PHAM THEO TEN");
        System.out.println("6. SAP XEP SAN PHAM");
        System.out.println("0. THOAT");

    }

    public static void themSP(){
        System.out.println("Nhap ten san pham");
        String tenSP=sc.nextLine();
        System.out.println("Nhap gia san pham");
        int giaSP=0;
        giaSP=kiemTraDangSo(giaSP);

        Product product=new Product(tenSP,giaSP);
        products.add(product);
    }

    public static boolean timSanPhamTheoID(){
        System.out.println("Nhap ID can tim");
        int id=0;
        id=kiemTraDangSo(id);
        for (int i=0;i< products.size();i++) {
            if (id == products.get(i).getId()) {
                index=i;
                return true;
            }
        } return false;
    }

    public static void suaSP() {
        System.out.println("SUA SAN PHAM");
        if (!timSanPhamTheoID()) System.out.println("Khong co sam pham co ID vua nhap");
        else {
            System.out.println("1. Bam 1 de Sua ten");
            System.out.println("2. Bam 2 de Sua gia");
            System.out.println("0. Bam 0 de thoat");
            int luaChon=0;
            luaChon=kiemTraDangSo(luaChon);

            while (luaChon!=0) {
                switch (luaChon) {
                    case 1 -> suaTenSP();
                    case 2 -> suaGiaSP();
                    default -> {
                        System.out.println("Sai lua chon. Nhap lai:");
                        luaChon = kiemTraDangSo(luaChon);
                    }
                }
                System.out.println("1. Bam 1 de Sua ten");
                System.out.println("2. Bam 2 de Sua gia");
                System.out.println("0. Bam 0 de thoat");
                luaChon=kiemTraDangSo(luaChon);
            }
        }
    }

    private static void suaGiaSP() {
        System.out.println("SUA GIA");
        System.out.println("Nhap gia ban muon sua:");
        int giaSP = 0;
        giaSP=kiemTraDangSo(giaSP);
        products.get(index).setGiaSP(giaSP);
    }

    private static void suaTenSP() {
        System.out.println("SUA TEN");
        System.out.println("Nhap ten ban muon sua:");
        String tenSP = sc.nextLine();
        products.get(index).setTenSP(tenSP);
    }

    public static void xoaSP(){
        System.out.println("XOA SAN PHAM");

        if(timSanPhamTheoID()){
            System.out.println("San pham tim thay: ");
            System.out.println(products.get(index).toString());
            System.out.println("Ban co muon xoa san pham nay khong?. Co(C)/Khong(K)");
            String luaChon=sc.nextLine();
            luaChon=luaChon.toLowerCase();
            switch (luaChon) {
                case "k" -> System.out.println("Khong sua gi.");
                case "c" -> {
                    products.remove(index);
                    System.out.println("Xoa thanh cong.");
                }
                default -> System.out.println("Lua chon sai.");
            }

        }
    }

    public static void hienThiDanhSachSP(){
        System.out.println("DACH SAN PHAM");
        System.out.printf("%-3s%-15s%s","ID","TEN SAN PHAM","DON GIA\n");
        for(Product p:products){
            System.out.printf("%-3d%-15s%d\n",p.getId(),p.getTenSP(),p.getGiaSP());
        }
    }

    public static void timKiemTheoTenSp(){
        int stt=0;
        System.out.println("TIM KIEM THEO TEN");
        System.out.println("Nhap ten san pham can tim");
        String tenSP=sc.nextLine();

        System.out.println("DACH SAN PHAM");
        System.out.printf("%-3s%-3s%-15s%s","STT","ID","TEN SAN PHAM","DON GIA\n");
        for(Product p:products){
            if(p.getTenSP().equals(tenSP)){
                System.out.printf("%-3d%-3d%-15s%d\n",stt,p.getId(),p.getTenSP(),p.getGiaSP());
            }
        }
    }

    public static void sapXepSP(){
        System.out.println("1. Sap xep gia tang dan");
        System.out.println("2. Sap xep gia giam dan");
        int luaChon=0;
        luaChon=kiemTraDangSo(luaChon);
        switch (luaChon) {
            case 1 -> {
                Collections.sort(products);
                hienThiDanhSachSP();
            }
            case 2 -> {
                Collections.sort(products);
                Collections.reverse(products);
                hienThiDanhSachSP();
            }
        }
    }

    private static int kiemTraDangSo(int num){
        String str;

        while (true){
            try{
                str=sc.nextLine();
                num=Integer.parseInt(str);
                break;
            }
            catch (Exception e){
                System.out.println("Sai dang so. Nhap lai:");
            }
        }
        return num;
    }

}

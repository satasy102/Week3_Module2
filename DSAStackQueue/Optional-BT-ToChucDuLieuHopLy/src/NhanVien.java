import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien>{
    private String hoTen;
    private boolean gioiTinh;
    private Date ngaySinh;
    private static final SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    public NhanVien() {}

    public NhanVien(String hoTen, boolean gioiTinh, Date ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String ngaySinh(Date ngaysinh){
        return sdf.format(ngaysinh);
    }

    public String layGioiTinh(boolean gioiTinh){
        if(gioiTinh) return "Nam";
        else return "Nu";
    }

    @Override
    public String toString() {
        return "HO VA TEN: " + hoTen +", GIOI TINH: " + layGioiTinh(gioiTinh) + ", NGAY SINH: " + ngaySinh(ngaySinh) +"s\n";

    }


    @Override
    public int compareTo(NhanVien o) {
        return getNgaySinh().compareTo(o.getNgaySinh());
    }
}

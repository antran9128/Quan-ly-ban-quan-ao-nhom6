
package model;


public class ThongKeSanPham {
    private String maSP;
    private String tenSp;
    private int soLuongBan;
    private int soLuongTon;
    private String trangThai;

    public ThongKeSanPham() {
    }

    public ThongKeSanPham(String maSP, String tenSp, int soLuongBan, int soLuongTon, String trangThai) {
        this.maSP = maSP;
        this.tenSp = tenSp;
        this.soLuongBan = soLuongBan;
        this.soLuongTon = soLuongTon;
        this.trangThai = trangThai;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.getMaSP(), this.getTenSp(), this.getSoLuongBan(), this.getSoLuongTon(), this.getTrangThai()};
    }
}


package model;


public class HoaDon {
    private String mahoadon;
    private String ngaytao;
    private String makhachhang;
    private String manhanvien;
    private double tongtien;
    private String trangthai;

    public HoaDon() {
    }

    public HoaDon(String mahoadon, String ngaytao, String makhachhang, String manhanvien, double tongtien, String trangthai) {
        this.mahoadon = mahoadon;
        this.ngaytao = ngaytao;
        this.makhachhang = makhachhang;
        this.manhanvien = manhanvien;
        this.tongtien = tongtien;
        this.trangthai = trangthai;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.getMahoadon(), this.getMakhachhang(), this.getNgaytao(), this.getTongtien(), this.getTrangthai()};
    }
}




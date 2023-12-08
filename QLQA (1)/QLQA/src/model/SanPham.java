
package model;


public class SanPham {
private String maSanPham;
    private String tenSanPham;
    private double soLuongOTN;
    private double giaBan;
    private String trangThai;
    private String mauSac;
    private String tendanhmuc;   

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, double soLuongOTN, double giaBan, String trangThai, String mauSac, String tendanhmuc) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuongOTN = soLuongOTN;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
        this.mauSac = mauSac;
        this.tendanhmuc = tendanhmuc;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getSoLuongOTN() {
        return soLuongOTN;
    }

    public void setSoLuongOTN(double soLuongOTN) {
        this.soLuongOTN = soLuongOTN;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getTendanhmuc() {
        return tendanhmuc;
    }

    public void setTendanhmuc(String tendanhmuc) {
        this.tendanhmuc = tendanhmuc;
    }

    

    @Override
    public String toString() {
        return "SanPham{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", soLuongOTN=" + soLuongOTN + ", giaBan=" + giaBan + ", trangThai=" + trangThai + ", mauSac=" + mauSac + ", tendanhmuc=" + tendanhmuc + '}';
    }

  
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class HoaDonChiTiet {
    private String maHD;
    private String maSP;
    private String tenSp;
    private int soLuong;
    private double donGia;
    private String ngayTao;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String maHD, String maSP, String tenSp, int soLuong, double donGia, String ngayTao) {
        this.maHD = maHD;
        this.maSP = maSP;
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.ngayTao = ngayTao;
    }
    
    

    public HoaDonChiTiet(String maSP, String tenSp, int soLuong, double donGia) {
        this.maSP = maSP;
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }
    
    
    
    public Object[] toDataRow(){
        return new Object[]{this.getMaSP(), this.getTenSp(), this.getSoLuong(), this.getDonGia()};
    }
}

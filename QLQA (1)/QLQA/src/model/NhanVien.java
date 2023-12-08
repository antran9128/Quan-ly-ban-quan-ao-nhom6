/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author NGUYENKHANH
 */
public class NhanVien {
       private String ma;
    private String hoten;
    private String diachi;
    private String namsinh;
    private boolean gioitinh;
    private String sdt;

    public NhanVien() {
    }

    public NhanVien(String ma, String hoten, String diachi, String namsinh, boolean gioitinh, String sdt) {
        this.ma = ma;
        this.hoten = hoten;
        this.diachi = diachi;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
    }


    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ma=" + ma + ", hoten=" + hoten + ", diachi=" + diachi + ", namsinh=" + namsinh + ", gioitinh=" + gioitinh + ", sdt=" + sdt + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dbcontext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import model.NhanVien;

/**
 *
 * @author NGUYENKHANH
 */
public class NhanvienRepository {
DBConnect db;
    public ArrayList<NhanVien> getAll() {
         String sql="select*from nhanvien"; 
         ArrayList<NhanVien> list = new ArrayList<>();
        try(Connection conn = db.getConnection()){
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String ma=rs.getString("manhanvien");
                 String ten=rs.getString("hoten");
                  String diachi=rs.getString("diachi");
                  String namsinh=rs.getString("namsinh");
                  Boolean gioitinh=rs.getBoolean("gioitinh");
                    String sdt=rs.getString("sdt");
                   NhanVien nv=new NhanVien(ma, ten, diachi, namsinh, gioitinh, sdt);
                  list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
  }

   public boolean add(NhanVien nv) {
    String sql = "insert into nhanvien(manhanvien, hoten, diachi, namsinh, gioitinh, sdt) values (?, ?, ?, ?, ?, ?)";
    try (Connection conn = db.getConnection()) {
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, nv.getMa());
        pst.setString(2, nv.getHoten());
        pst.setString(3, nv.getDiachi());
        pst.setString(4, nv.getNamsinh());
        pst.setBoolean(5, nv.isGioitinh());
        pst.setString(6, nv.getSdt());
        int kq = pst.executeUpdate();
        return kq > 0;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
}
    public ArrayList<NhanVien> searchByMa(String ma) {
        String sql = "SELECT * FROM nhanvien WHERE manhanvien LIKE '%" + ma + "%'";
         ArrayList<NhanVien> list = new ArrayList<>();
        try(Connection conn = db.getConnection()){
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String maNV=rs.getString("manhanvien");
                 String ten=rs.getString("hoten");
                  String diachi=rs.getString("diachi");
                  String namsinh=rs.getString("namsinh");
                   Boolean gioitinh=rs.getBoolean("gioitinh");
                    String sdt=rs.getString("sdt");
                   NhanVien nv=new NhanVien(maNV, ten, diachi, namsinh, gioitinh, sdt);
                  list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
  }

public boolean update(NhanVien nv) {
    String sql = "update nhanvien set hoten=?, diachi=?, namsinh=?, gioitinh=?, sdt=? where manhanvien=?";
    try (Connection conn = db.getConnection()) {
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, nv.getHoten());
        pst.setString(2, nv.getDiachi());
        pst.setString(3, nv.getNamsinh());
        pst.setBoolean(4, nv.isGioitinh());
        pst.setString(5, nv.getSdt());
        pst.setString(6, nv.getMa());
        int kq = pst.executeUpdate();
        return kq > 0;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
}
}




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
import model.Khachhang;

/**
 *
 * @author NGUYENKHANH
 */
public class KhachHangRepository {

    DBConnect db;

    public ArrayList<Khachhang> getAll() {
        String sql = "select*from khachhang";
        ArrayList<Khachhang> list = new ArrayList<>();
        try (Connection conn = db.getConnection()) {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String ma = rs.getString("makhachhang");
                String ten = rs.getString("hoten");
                String diachi = rs.getString("diachi");
                String namsinh = rs.getString("namsinh");
                Boolean gioitinh = rs.getBoolean("gioitinh");
                String sdt = rs.getString("sdt");
                Khachhang kh = new Khachhang(ma, ten, diachi, namsinh, gioitinh, sdt);
                list.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean add(Khachhang kh) {
        String sql = "INSERT INTO khachhang(makhachhang, hoten, diachi, namsinh, gioitinh, sdt) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = db.getConnection()) {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, kh.getMa());
            pst.setString(2, kh.getHoten());
            pst.setString(3, kh.getDiachi());
            pst.setString(4, kh.getNamsinh());
            pst.setBoolean(5, kh.isGioitinh());
            pst.setString(6, kh.getSdt());

            int kq = pst.executeUpdate();
            return kq > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(Khachhang kh) {
        String sql = "UPDATE khachhang SET hoten=?, diachi=?, namsinh=?, gioitinh=?, sdt=? WHERE makhachhang=?";
        try (Connection conn = db.getConnection()) {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, kh.getHoten());
            pst.setString(2, kh.getDiachi());
            pst.setString(3, kh.getNamsinh());
            pst.setBoolean(4, kh.isGioitinh());
            pst.setString(5, kh.getSdt());
            pst.setString(6, kh.getMa());

            int kq = pst.executeUpdate();
            return kq > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Khachhang> searchByMa(String ma) {
        String sql = "SELECT * FROM khachhang WHERE makhachhang LIKE ?";
        ArrayList<Khachhang> list = new ArrayList<>();
        try (Connection conn = db.getConnection()) {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + ma + "%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maKH = rs.getString("makhachhang");
                String ten = rs.getString("hoten");
                String diachi = rs.getString("diachi");
                String namsinh = rs.getString("namsinh");
                Boolean gioitinh = rs.getBoolean("gioitinh");
                String sdt = rs.getString("sdt");
                Khachhang kh = new Khachhang(maKH, ten, diachi, namsinh, gioitinh, sdt);
                list.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}

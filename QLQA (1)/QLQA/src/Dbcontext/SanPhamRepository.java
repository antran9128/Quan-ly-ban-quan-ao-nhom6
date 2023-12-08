/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dbcontext;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.DanhMuc;
import model.SanPham;

/**
 *
 * @author NGUYENKHANH
 */
public class SanPhamRepository {

    DBConnect db;

    public ArrayList<SanPham> getAll() {
        String sql = "SELECT masanpham, tensanpham, giaban, soluongotn, tendanhmuc, mausac, trangthai FROM sanpham join danhmuc on sanpham.madanhmuc = danhmuc.madanhmuc;";
        ArrayList<SanPham> list = new ArrayList<>();

        try (java.sql.Connection conn = db.getConnection()) {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String maSanPham = rs.getString("masanpham");
                String tenSanPham = rs.getString("tensanpham");
                Double giaBan = rs.getDouble("giaban");
                Double soLuongTon = rs.getDouble("soluongotn");
                String tendanhmuc = rs.getString("tendanhmuc");
                String mauSac = rs.getString("mausac");
                String trangthai = rs.getString("trangthai");

                SanPham sp = new SanPham(maSanPham, tenSanPham, soLuongTon, giaBan, trangthai, mauSac, tendanhmuc);
                list.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public boolean add(SanPham sp) {
        String sql = "INSERT INTO sanpham (masanpham, tensanpham, giaban,soluongotn, madanhmuc, mausac, trangthai) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (java.sql.Connection conn = db.getConnection()) {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, sp.getMaSanPham());
            pst.setString(2, sp.getTenSanPham());
            pst.setDouble(3, sp.getSoLuongOTN());
            pst.setDouble(4, sp.getGiaBan());
            pst.setString(5, getMaDanhMuc(sp.getTendanhmuc()));
            pst.setString(6, sp.getMauSac());
            pst.setString(7, sp.getTrangThai());

            int kq = pst.executeUpdate();
            return kq > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(SanPham sp) {
        String sql = "UPDATE sanpham SET tensanpham=?, soluongotn=?, giaban=?, madanhmuc=?, mausac=?, trangthai=? WHERE masanpham=?";
        try (java.sql.Connection conn = db.getConnection()) {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, sp.getTenSanPham());
            pst.setDouble(2, sp.getSoLuongOTN());
            pst.setDouble(3, sp.getGiaBan());
            
            pst.setString(4, getMaDanhMuc(sp.getTendanhmuc()));
            pst.setString(5, sp.getMauSac());
            pst.setString(6, sp.getTrangThai());
            pst.setString(7, sp.getMaSanPham());
            int kq = pst.executeUpdate();
            return kq > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<SanPham> searchByMa(String ma) {
        String sql = "SELECT masanpham, tensanpham, giaban, soluongotn, madanhmuc, mausac, trangthai FROM sanpham WHERE masanpham LIKE '%" + ma + "%'";
        ArrayList<SanPham> list = new ArrayList<>();

        try (java.sql.Connection conn = db.getConnection()) {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String maSanPham = rs.getString("masanpham");
                String tenSanPham = rs.getString("tensanpham");
                Double giaBan = rs.getDouble("giaban");
                Double soLuongTon = rs.getDouble("soluongotn");
                String tendanhmuc = getTenDanhMuc(rs.getString("madanhmuc"));
                String mauSac = rs.getString("mausac");
                String trangthai = rs.getString("trangthai");

                SanPham sp = new SanPham(maSanPham, tenSanPham, soLuongTon, giaBan, trangthai, mauSac, tendanhmuc);
                list.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public String getMaDanhMuc(String tenDanhMuc) {

        String sql = "SELECT madanhmuc FROM danhmuc WHERE tendanhmuc = ?";
        try (java.sql.Connection conn = db.getConnection()) {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tenDanhMuc);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return "";
    }
    
    public String getTenDanhMuc(String maDanhMuc) {

        String sql = "SELECT tendanhmuc FROM danhmuc WHERE madanhmuc = ?";
        try (java.sql.Connection conn = db.getConnection()) {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, maDanhMuc);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return "";
    }
}

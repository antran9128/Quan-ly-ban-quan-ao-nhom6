
package service;

import Dbcontext.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.HoaDon;


public class HoaDonService {
    private List<HoaDon> listHD = null;
    private Connection con = null;
    private PreparedStatement ps = null; //thuc thi cau lenh
    private ResultSet rs = null;
    private String sql = null;
    
    public List<HoaDon> getAll() {
        try { // ket noi duoc
            listHD = new ArrayList<>();
            sql = "SELECT mahoadon, ngaytao, makhachhang, manhanvien, tongtien, trangthai FROM hoadon";

            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                //long id, String maSinhVien, String hoTen, double diemTrungBinh, String nganhHoc, int gioiTinh
                HoaDon sv = new HoaDon(rs.getString(1), rs.getString(2), rs.getString(3),
                                        rs.getString(4), rs.getDouble(5), rs.getString(6));
                listHD.add(sv);
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    
    
    public List<HoaDon> searchHD(String ma){
        listHD = new ArrayList<>(); 
        try {
            
            sql = "SELECT mahoadon, ngaytao, makhachhang, manhanvien, tongtien, trangthai FROM hoadon WHERE mahoadon LIKE ?";
            
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + ma + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                //long id, String maSinhVien, String hoTen, double diemTrungBinh, String nganhHoc, int gioiTinh
                HoaDon sv = new HoaDon(rs.getString(1), rs.getString(2), rs.getString(3),
                                        rs.getString(4), rs.getDouble(5), rs.getString(6));
                listHD.add(sv);
            }
            return listHD;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
         
    }
    
    
    public int insertHD(HoaDon hd){
        int kq =0;
        try {
            sql = "insert into hoadon (mahoadon, ngaytao, makhachhang, manhanvien, tongtien, trangthai) values (?, ?, ?, ?, ?, ?)";
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, hd.getMahoadon());
            ps.setString(2, hd.getNgaytao());
            ps.setString(3, hd.getMakhachhang());
            ps.setString(4, hd.getManhanvien());
            ps.setDouble(5, hd.getTongtien());
            ps.setString(6, hd.getTrangthai());

            kq = ps.executeUpdate();
            return kq;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return kq;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        HoaDonService hd = new HoaDonService();
        List<HoaDon> hdList = hd.getAll();
        
        for (HoaDon hoaDon : hdList) {
            System.out.println(hoaDon.getMahoadon());
        }
        
    }
}

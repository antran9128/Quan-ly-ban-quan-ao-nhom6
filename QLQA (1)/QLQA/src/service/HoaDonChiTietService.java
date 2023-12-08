package service;

import Dbcontext.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.HoaDon;
import model.HoaDonChiTiet;

public class HoaDonChiTietService {

    private List<HoaDonChiTiet> listHD = null;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public List<HoaDonChiTiet> getAll(String maHD) {
        try { // ket noi duoc
            listHD = new ArrayList<>();
            sql = """
                  select hoadonchitiet.masanpham, tensanpham, soluong, dongia from hoadonchitiet
                    join sanpham on hoadonchitiet.masanpham = sanpham.masanpham 
                    where hoadonchitiet.mahoadon like ?""";

            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + maHD + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                
                HoaDonChiTiet sp = new HoaDonChiTiet(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));
                listHD.add(sp);
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

     public int insertHDCT(HoaDonChiTiet hdct){
        int kq =0;
        try {
            sql = "insert into hoadonchitiet(masanpham, mahoadon, soluong, dongia, ngaytao) values(?, ?, ?, ?, ?)";
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, hdct.getMaSP());
            ps.setString(2, hdct.getMaHD());
            ps.setInt(3, hdct.getSoLuong());
            ps.setDouble(4, hdct.getDonGia());
            ps.setString(5, hdct.getNgayTao());

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
    
}

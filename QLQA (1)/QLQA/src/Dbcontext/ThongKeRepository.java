package Dbcontext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.DanhMuc;
import model.HoaDon;
import model.ThongKeSanPham;

public class ThongKeRepository {

    private List<DanhMuc> danhMucList = null;
    private List<ThongKeSanPham> tkspList = null;
    private Connection con = null;
    private PreparedStatement ps = null; //thuc thi cau lenh
    private ResultSet rs = null;
    private String sql = null;

    public List<DanhMuc> getAllDanhMuc() {
        try { // ket noi duoc
            danhMucList = new ArrayList<>();
            sql = "SELECT madanhmuc, tendanhmuc FROM danhmuc;";

            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                DanhMuc dm = new DanhMuc(rs.getString(1), rs.getString(2));
                danhMucList.add(dm);
            }
            return danhMucList;
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

    public List<ThongKeSanPham> getAllThongKeSanPham() {
        try { // ket noi duoc
            tkspList = new ArrayList<>();
            sql = """
                  select hoadonchitiet.masanpham, sanpham.tensanpham, SUM(soluong), soluongotn, sanpham.trangthai from hoadon join hoadonchitiet on hoadon.mahoadon = hoadonchitiet.mahoadon
                    join sanpham on sanpham.masanpham = hoadonchitiet.masanpham GROUP BY hoadonchitiet.masanpham, sanpham.tensanpham, soluongotn, sanpham.trangthai""";

            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ThongKeSanPham tksp = new ThongKeSanPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
                tkspList.add(tksp);
            }
            return tkspList;
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

    public double thongKeTheoNgay() {
        LocalDate today = java.time.LocalDate.now();

        try { // ket noi duoc

            sql = "select sum(tongtien) from hoadon where ngaytao=? and trangthai='Completed'";
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, today + "");
            rs = ps.executeQuery();

            while (rs.next()) {
                return rs.getDouble(1);
            }
            return 0;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
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

    public double thongKeTheoThang() {
        LocalDate today = java.time.LocalDate.now();
        int month = today.getMonthValue();
        try { // ket noi duoc

            sql = "select sum(tongtien) from hoadon where MONTH(ngaytao)=? and trangthai='Completed'";
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, month);
            rs = ps.executeQuery();

            while (rs.next()) {
                return rs.getDouble(1);
            }
            return 0;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
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

    public double thongKeTheoNam() {
        LocalDate today = java.time.LocalDate.now();
        int year = today.getYear();
        try { // ket noi duoc

            sql = "select sum(tongtien) from hoadon where YEAR(ngaytao)=? and trangthai='Completed'";
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, year);
            rs = ps.executeQuery();

            while (rs.next()) {
                return rs.getDouble(1);
            }
            return 0;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
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

    public double locDoanhThu(String tuNgay, String denNgay) {
        try { // ket noi duoc

            sql = "select sum(tongtien) from hoadon where ( ngaytao between ? and ? ) and trangthai='Completed' ";
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, tuNgay);
            ps.setString(2, denNgay);
            rs = ps.executeQuery();

            while (rs.next()) {
                return rs.getDouble(1);
            }
            return 0;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
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

    public static void main(String[] args) {
        ThongKeRepository tk = new ThongKeRepository();
        System.out.println(tk.locDoanhThu("2023-10-01", "2023-10-05"));
    }

    public List<ThongKeSanPham> locSanPham(String tuNgay, String denNgay, String danhMuc, String trangThai) {
        try { // ket noi duoc
            tkspList = new ArrayList<>();
            sql = "select hoadonchitiet.masanpham, sanpham.tensanpham, SUM(soluong), soluongotn, sanpham.trangthai \n"
                    + "  from hoadon join hoadonchitiet on hoadon.mahoadon = hoadonchitiet.mahoadon\n"
                    + "              join sanpham on sanpham.masanpham = hoadonchitiet.masanpham \n"
                    + "			  join danhmuc on danhmuc.madanhmuc = sanpham.madanhmuc\n"
                    + "  GROUP BY hoadonchitiet.masanpham, sanpham.tensanpham, soluongotn, sanpham.trangthai, hoadonchitiet.ngaytao, tendanhmuc\n"
                    + "  HAVING hoadonchitiet.ngaytao between ? and ? \n"
                    + "		 and tendanhmuc = ?\n"
                    + "		 and sanpham.trangthai = ?";
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, tuNgay);
            ps.setString(2, denNgay);
            ps.setString(3, danhMuc);
            ps.setString(4, trangThai);
            rs = ps.executeQuery();

            while (rs.next()) {
                ThongKeSanPham tksp = new ThongKeSanPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
                tkspList.add(tksp);
            }
            return tkspList;
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
}

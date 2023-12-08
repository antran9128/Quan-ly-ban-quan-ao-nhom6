
package service;

import Dbcontext.ThongKeRepository;
import java.util.List;
import model.DanhMuc;
import model.ThongKeSanPham;


public class ThongKeService {
    private ThongKeRepository thongKeRepository = new ThongKeRepository();
    public List<DanhMuc> getAllDanhMuc(){
        return thongKeRepository.getAllDanhMuc();
    }
    
    
    public List<ThongKeSanPham> getAllThongKeSanPham(){
        return thongKeRepository.getAllThongKeSanPham();
    }
    
    public double thongKeTheoNgay(){
        return thongKeRepository.thongKeTheoNgay();
    }
    
    public double thongKeTheoThang(){
        return thongKeRepository.thongKeTheoThang();
    }
    
    public double thongKeTheoNam(){
        return thongKeRepository.thongKeTheoNam();
    }
    
    public double locDoanhThu(String tuNgay, String denNgay){
        return thongKeRepository.locDoanhThu(tuNgay, denNgay);
    }
    
    public List<ThongKeSanPham> locSanPham(String tuNgay, String denNgay, String danhMuc, String trangThai){
        return thongKeRepository.locSanPham(tuNgay, denNgay, danhMuc, trangThai);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Dbcontext.SanPhamRepository;
import java.util.ArrayList;
import model.SanPham;

/**
 *
 * @author NGUYENKHANH
 */
public class SanphamService {
     SanPhamRepository spr = new SanPhamRepository();
        public ArrayList<SanPham> getAll(){
        ArrayList<SanPham> list = spr.getAll();
        return list;
    }
    public String add(SanPham sp){
        if(spr.add(sp)){
            return "Them thanh cong";
        }else{
            return "Them that bai";
        }
    }
    
      public String update(SanPham sp){
        if(spr.update(sp)){
            return "update thanh cong";
        }else{
            return "update that bai";
        }
    }
  
    
    public ArrayList<SanPham> searchByMa(String ma){
        ArrayList<SanPham> list = spr.searchByMa(ma);
        return list;
    }
}

    


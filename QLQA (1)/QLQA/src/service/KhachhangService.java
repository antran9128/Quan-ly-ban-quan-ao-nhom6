/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Dbcontext.KhachHangRepository;
import java.util.ArrayList;
import model.Khachhang;

/**
 *
 * @author NGUYENKHANH
 */
public class KhachhangService {
      KhachHangRepository hangRepository = new KhachHangRepository();
    public ArrayList<Khachhang> getAll(){
        ArrayList<Khachhang> list = hangRepository.getAll();
        return list;
    }
    public String add(Khachhang kh){
        if(hangRepository.add(kh)){
            return "Them thanh cong";
        }else{
            return "Them that bai";
        }
    }
    
      public String update(Khachhang kh){
        if(hangRepository.update(kh)){
            return "update thanh cong";
        }else{
            return "update that bai";
        }
    }
  
    
    public ArrayList<Khachhang> searchByMa(String ma){
        ArrayList<Khachhang> list = hangRepository.searchByMa(ma);
        return list;
    }
}

    


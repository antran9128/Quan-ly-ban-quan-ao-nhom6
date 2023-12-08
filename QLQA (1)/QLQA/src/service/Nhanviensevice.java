/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Dbcontext.NhanvienRepository;
import java.util.ArrayList;

import model.NhanVien;

/**
 *
 * @author NGUYENKHANH
 */
public class Nhanviensevice {
    NhanvienRepository nhanvienRepository=new NhanvienRepository();
    public ArrayList<NhanVien> getAll(){
        ArrayList<NhanVien> List = nhanvienRepository.getAll();
        return List;
    }
    public String add(NhanVien nv){
        if(nhanvienRepository.add(nv)){
            return "Them thanh cong";
        }else{
            return "Them that bai";
        }
    }
    
      public String update(NhanVien nv){
        if(nhanvienRepository.update(nv)){
            return "Update thanh cong";
        }else{
            return "Update that bai";
        }
    }
  
    
    public ArrayList<NhanVien> searchByMa(String ma){
        ArrayList<NhanVien> list = nhanvienRepository.searchByMa(ma);
        return list;
    }
}

    


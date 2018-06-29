/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ass1Java;

import java.util.Scanner;

/**
 *
 * @author gamelord
 */
public class SanPhamController implements ISanPham {
    
    SanPham[] danhSachSP;
    
    @Override
    public void nhapSanPham(SanPham sp) {
        if (sp==null){
            sp = new SanPham();
        }
        else{
            System.out.print("Nhap ten san pham: ");
            sp.setTen(new Scanner(System.in).nextLine());
            System.out.print("Nhap gia san pham: ");
            sp.setGia(new Scanner(System.in).nextInt());
        }
        
    }

    @Override
    public void hienThiSanPham(SanPham sp) {
        System.out.println("Ma: "+sp.getMa()+"\t"+"Ten: "+sp.getTen()+"\t"+"Gia: "+sp.getGia());
    }

    @Override
    public void chonSanPham() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

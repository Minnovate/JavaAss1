/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ass1Java;

/**
 *
 * @author gamelord
 */
public class GioHangController implements IGioHang {
    
    SanPham[] danhSachSP;
    
    @Override
    public void hienThiGioHang(SanPham[] danhSach) {
        for (SanPham danhSach1 : danhSach) {
            if (danhSach1.getSoLuong() > 0) {
                System.out.println("Ma: " + danhSach1.getMa() + "\t" + "Ten: " + danhSach1.getTen() + "\t" + "Gia: " + danhSach1.getGia() + "\t" + "So luong mua: " + danhSach1.getSoLuong() + "Thanh tien: " + danhSach1.getThanhTien());
            }
        }
    }

    @Override
    public float tinhTongGia(SanPham[] danhSachSP) {
        float thanhTien=0;
        for (SanPham danhSach1: danhSachSP){
            if(danhSach1.getSoLuong()>0){
                thanhTien+=danhSach1.getThanhTien();
            }
        }
        return thanhTien;
    }

    @Override
    public void capNhapSoLuong(SanPham sp, int soMua) {
        int soCu = sp.getSoLuong();
        sp.setSoLuong(soCu+soMua);
    }
}

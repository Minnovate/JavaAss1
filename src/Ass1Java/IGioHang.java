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
public interface IGioHang {

    void capNhapSoLuong(SanPham sp, int soMua);
    void hienThiGioHang(SanPham[] danhSach);
    float tinhTongGia(SanPham[] danhSachSP);
}

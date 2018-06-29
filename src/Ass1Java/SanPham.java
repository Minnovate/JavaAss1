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
public class SanPham {
    private static int ma=1;
    private String ten;
    private float gia;
    private int soLuong;
    private float thanhTien;

    public static int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = getSoLuong()*getGia();
    }

    public SanPham() {
        this.ma=ma++;
    }

    
    public SanPham(String ten, float gia, int soLuong, float thanhTien) {
        this.ma=ma++;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    
    
    
}

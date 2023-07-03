/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

public class Student {
    private String MHS;
    private String TenHS;
    private double Diem;
    private String HinhAnh;
    private String DiaChi;
    private String GhiChu;

 
    //khởi tạo constructor mặc định
    public Student() {
    }
    
    //khởi tạo constructor có tham số
    public Student(String MHS, String TenHS, double Diem, String HinhAnh, String DiaChi, String GhiChu) {      
        this.MHS = MHS;
        this.TenHS = TenHS;
        this.Diem = Diem;
        this.HinhAnh = HinhAnh;
        this.DiaChi = DiaChi;
        this.GhiChu = GhiChu;
    }
    
    //--------------begin getter and setter--------------------
    public String getMHS() {
        return MHS;
    } 
    public void setMHS(String MHS) {
        this.MHS = MHS;
    }
     
    public String getTenHS() {
        return TenHS;
    } 
    public void setTenHS(String TenHS) {
        this.TenHS = TenHS;
    }
         
    public double getDiem() {
        return Diem;
    } 
    public void setDiem(double Diem) {
        this.Diem = Diem;
    }
    
    public String getHinhAnh() {
        return HinhAnh;
    } 
    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }
    
    public String getDiaChi() {
        return DiaChi;
    } 
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }   
    
    public String getGhiChu() {
        return GhiChu;
    } 
    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }      
    //--------------end getter and setter--------------------
    
}

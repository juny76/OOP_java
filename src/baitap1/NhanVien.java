/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package baitap1;

public class NhanVien {
    
    private String TenNhanVien;
    private double luongcoban;
    private double hesoluong;
    public static final double LuongMax=10000;
    
    public void TaoNhanVien(String TenNhanVien,double luongcoban,double hesoluong){
        this.TenNhanVien=TenNhanVien;
        this.luongcoban=luongcoban;
        this.hesoluong=hesoluong;
    }
    
    public String gettenNhanVien(){
        return TenNhanVien;
    }
    public void settenNhanVien(String TenNhanVien){
        this.TenNhanVien=TenNhanVien;
    }
    
    public double getluongcoban(){
        return luongcoban;
    }
    
    public void setluongcoban(double luongcoban){
        this.luongcoban=luongcoban;
    }
    
    public double gethesoluong(){
        return hesoluong;
    }
    
    public void sethesoluong(double hesoluong){
        this.hesoluong=hesoluong;
    }
    public double tinhLuong(){
        return this.luongcoban * this.hesoluong;
    }
    public boolean tangLuong(double giatritang){
        double LuongMoi=this.luongcoban*(this.hesoluong+giatritang);
        if(LuongMoi>LuongMax){
            System.out.println("Khong duoc tang luong");
            return false;
        }else{
            this.hesoluong+=giatritang;
            return true;
        }
    }
    public void inTTin(){
        System.out.println("Ten nhan vien : "+this.TenNhanVien);
        System.out.println("Luong co ban: "+this.luongcoban);
        System.out.println("He so luong : "+this.hesoluong);
        System.out.println("Luong :" + tinhLuong());
    }
}
    /**
     * @param args the command line arguments
     */
    


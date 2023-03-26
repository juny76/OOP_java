/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package baitap1;

public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        NhanVien acc1=new NhanVien();
        acc1.TaoNhanVien("NguyenHuyTuan",3000,1.5);
        acc1.inTTin();
        acc1.tangLuong(1);
        System.out.println("Hesoluong : "+acc1.gethesoluong());
        
    }
}

package poly.app.core.entities;
// Generated Nov 3, 2018 9:52:40 PM by Hibernate Tools 4.3.1



/**
 * HoaDonChiTiet generated by hbm2java
 */
public class HoaDonChiTiet  implements java.io.Serializable {


     private Integer id;
     private DoAnChiTiet doAnChiTiet;
     private HoaDon hoaDon;
     private int soLuong;
     private int donGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(DoAnChiTiet doAnChiTiet, HoaDon hoaDon, int soLuong, int donGia) {
       this.doAnChiTiet = doAnChiTiet;
       this.hoaDon = hoaDon;
       this.soLuong = soLuong;
       this.donGia = donGia;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public DoAnChiTiet getDoAnChiTiet() {
        return this.doAnChiTiet;
    }
    
    public void setDoAnChiTiet(DoAnChiTiet doAnChiTiet) {
        this.doAnChiTiet = doAnChiTiet;
    }
    public HoaDon getHoaDon() {
        return this.hoaDon;
    }
    
    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }
    public int getSoLuong() {
        return this.soLuong;
    }
    
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public int getDonGia() {
        return this.donGia;
    }
    
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }




}


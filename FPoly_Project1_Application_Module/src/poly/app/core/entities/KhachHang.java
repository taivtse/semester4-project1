package poly.app.core.entities;
// Generated Nov 3, 2018 10:13:24 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * KhachHang generated by hbm2java
 */
public class KhachHang  implements java.io.Serializable {


     private String id;
     private String hoTen;
     private String soCmnd;
     private String matKhau;
     private String soDienThoai;
     private String email;
     private String diaChi;
     private Date ngayDangKy;
     private Date ngaySinh;
     private boolean gioiTinh;
     private Set<VeDat> veDats = new HashSet<VeDat>(0);

    public KhachHang() {
    }

	
    public KhachHang(String id, String hoTen, String soCmnd, String matKhau, Date ngayDangKy, boolean gioiTinh) {
        this.id = id;
        this.hoTen = hoTen;
        this.soCmnd = soCmnd;
        this.matKhau = matKhau;
        this.ngayDangKy = ngayDangKy;
        this.gioiTinh = gioiTinh;
    }
    public KhachHang(String id, String hoTen, String soCmnd, String matKhau, String soDienThoai, String email, String diaChi, Date ngayDangKy, Date ngaySinh, boolean gioiTinh, Set<VeDat> veDats) {
       this.id = id;
       this.hoTen = hoTen;
       this.soCmnd = soCmnd;
       this.matKhau = matKhau;
       this.soDienThoai = soDienThoai;
       this.email = email;
       this.diaChi = diaChi;
       this.ngayDangKy = ngayDangKy;
       this.ngaySinh = ngaySinh;
       this.gioiTinh = gioiTinh;
       this.veDats = veDats;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getSoCmnd() {
        return this.soCmnd;
    }
    
    public void setSoCmnd(String soCmnd) {
        this.soCmnd = soCmnd;
    }
    public String getMatKhau() {
        return this.matKhau;
    }
    
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    public String getSoDienThoai() {
        return this.soDienThoai;
    }
    
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public Date getNgayDangKy() {
        return this.ngayDangKy;
    }
    
    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }
    public Date getNgaySinh() {
        return this.ngaySinh;
    }
    
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public boolean isGioiTinh() {
        return this.gioiTinh;
    }
    
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public Set<VeDat> getVeDats() {
        return this.veDats;
    }
    
    public void setVeDats(Set<VeDat> veDats) {
        this.veDats = veDats;
    }




}



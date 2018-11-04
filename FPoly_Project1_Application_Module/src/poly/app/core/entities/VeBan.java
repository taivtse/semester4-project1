package poly.app.core.entities;
// Generated Nov 3, 2018 9:52:40 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * VeBan generated by hbm2java
 */
public class VeBan  implements java.io.Serializable {


     private String id;
     private GheNgoi gheNgoi;
     private GiaVe giaVe;
     private NguoiDung nguoiDung;
     private SuatChieu suatChieu;
     private Date ngayBan;
     private int tongCong;
     private Set<VeDat> veDats = new HashSet<VeDat>(0);

    public VeBan() {
    }

	
    public VeBan(String id, GheNgoi gheNgoi, GiaVe giaVe, NguoiDung nguoiDung, SuatChieu suatChieu, Date ngayBan, int tongCong) {
        this.id = id;
        this.gheNgoi = gheNgoi;
        this.giaVe = giaVe;
        this.nguoiDung = nguoiDung;
        this.suatChieu = suatChieu;
        this.ngayBan = ngayBan;
        this.tongCong = tongCong;
    }
    public VeBan(String id, GheNgoi gheNgoi, GiaVe giaVe, NguoiDung nguoiDung, SuatChieu suatChieu, Date ngayBan, int tongCong, Set<VeDat> veDats) {
       this.id = id;
       this.gheNgoi = gheNgoi;
       this.giaVe = giaVe;
       this.nguoiDung = nguoiDung;
       this.suatChieu = suatChieu;
       this.ngayBan = ngayBan;
       this.tongCong = tongCong;
       this.veDats = veDats;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public GheNgoi getGheNgoi() {
        return this.gheNgoi;
    }
    
    public void setGheNgoi(GheNgoi gheNgoi) {
        this.gheNgoi = gheNgoi;
    }
    public GiaVe getGiaVe() {
        return this.giaVe;
    }
    
    public void setGiaVe(GiaVe giaVe) {
        this.giaVe = giaVe;
    }
    public NguoiDung getNguoiDung() {
        return this.nguoiDung;
    }
    
    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }
    public SuatChieu getSuatChieu() {
        return this.suatChieu;
    }
    
    public void setSuatChieu(SuatChieu suatChieu) {
        this.suatChieu = suatChieu;
    }
    public Date getNgayBan() {
        return this.ngayBan;
    }
    
    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }
    public int getTongCong() {
        return this.tongCong;
    }
    
    public void setTongCong(int tongCong) {
        this.tongCong = tongCong;
    }
    public Set<VeDat> getVeDats() {
        return this.veDats;
    }
    
    public void setVeDats(Set<VeDat> veDats) {
        this.veDats = veDats;
    }




}


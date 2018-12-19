package poly.app.core.entities;
// Generated Nov 9, 2018 10:03:06 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * VeDat generated by hbm2java
 */
public class VeDat implements java.io.Serializable {

    private String id;
    private KhachHang khachHang;
    private Set<VeBan> veBans = new HashSet<VeBan>(0);

    public VeDat() {
    }

    public VeDat(KhachHang khachHang) {
        this.id = "";
        this.khachHang = khachHang;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KhachHang getKhachHang() {
        return this.khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public Set<VeBan> getVeBans() {
        return veBans;
    }

    public void setVeBans(Set<VeBan> veBans) {
        this.veBans = veBans;
    }

}

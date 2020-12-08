package com.grand.springcloud.entity.tiptop;

import java.io.Serializable;
import java.util.Date;

public class GEE_FILE implements Serializable {
    private String gee01;

    private String gee02;

    private String gee03;

    private String gee04;

    private String gee05;

    private String gee06;

    private String gee07;

    private String gee08;

    private String geeacti;

    private Date geedate;

    private String geegrup;

    private String geemodu;

    private String geeorig;

    private String geeoriu;

    private String geeuser;

    private static final long serialVersionUID = 1L;

    public String getGee01() {
        return gee01;
    }

    public void setGee01(String gee01) {
        this.gee01 = gee01 == null ? null : gee01.trim();
    }

    public String getGee02() {
        return gee02;
    }

    public void setGee02(String gee02) {
        this.gee02 = gee02 == null ? null : gee02.trim();
    }

    public String getGee03() {
        return gee03;
    }

    public void setGee03(String gee03) {
        this.gee03 = gee03 == null ? null : gee03.trim();
    }

    public String getGee04() {
        return gee04;
    }

    public void setGee04(String gee04) {
        this.gee04 = gee04 == null ? null : gee04.trim();
    }

    public String getGee05() {
        return gee05;
    }

    public void setGee05(String gee05) {
        this.gee05 = gee05 == null ? null : gee05.trim();
    }

    public String getGee06() {
        return gee06;
    }

    public void setGee06(String gee06) {
        this.gee06 = gee06 == null ? null : gee06.trim();
    }

    public String getGee07() {
        return gee07;
    }

    public void setGee07(String gee07) {
        this.gee07 = gee07 == null ? null : gee07.trim();
    }

    public String getGee08() {
        return gee08;
    }

    public void setGee08(String gee08) {
        this.gee08 = gee08 == null ? null : gee08.trim();
    }

    public String getGeeacti() {
        return geeacti;
    }

    public void setGeeacti(String geeacti) {
        this.geeacti = geeacti == null ? null : geeacti.trim();
    }

    public Date getGeedate() {
        return geedate;
    }

    public void setGeedate(Date geedate) {
        this.geedate = geedate;
    }

    public String getGeegrup() {
        return geegrup;
    }

    public void setGeegrup(String geegrup) {
        this.geegrup = geegrup == null ? null : geegrup.trim();
    }

    public String getGeemodu() {
        return geemodu;
    }

    public void setGeemodu(String geemodu) {
        this.geemodu = geemodu == null ? null : geemodu.trim();
    }

    public String getGeeorig() {
        return geeorig;
    }

    public void setGeeorig(String geeorig) {
        this.geeorig = geeorig == null ? null : geeorig.trim();
    }

    public String getGeeoriu() {
        return geeoriu;
    }

    public void setGeeoriu(String geeoriu) {
        this.geeoriu = geeoriu == null ? null : geeoriu.trim();
    }

    public String getGeeuser() {
        return geeuser;
    }

    public void setGeeuser(String geeuser) {
        this.geeuser = geeuser == null ? null : geeuser.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gee01=").append(gee01);
        sb.append(", gee02=").append(gee02);
        sb.append(", gee03=").append(gee03);
        sb.append(", gee04=").append(gee04);
        sb.append(", gee05=").append(gee05);
        sb.append(", gee06=").append(gee06);
        sb.append(", gee07=").append(gee07);
        sb.append(", gee08=").append(gee08);
        sb.append(", geeacti=").append(geeacti);
        sb.append(", geedate=").append(geedate);
        sb.append(", geegrup=").append(geegrup);
        sb.append(", geemodu=").append(geemodu);
        sb.append(", geeorig=").append(geeorig);
        sb.append(", geeoriu=").append(geeoriu);
        sb.append(", geeuser=").append(geeuser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
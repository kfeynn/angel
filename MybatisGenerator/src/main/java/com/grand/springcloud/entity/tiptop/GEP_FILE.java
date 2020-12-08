package com.grand.springcloud.entity.tiptop;

import java.io.Serializable;
import java.util.Date;

public class GEP_FILE implements Serializable {
    private String gep01;

    private String gep02;

    private String gep03;

    private Date gep04;

    private String gep05;

    private String gep06;

    private String gep07;

    private String gep08;

    private String gep09;

    private String gep10;

    private String gepacti;

    private String gepuser;

    private String gepgrup;

    private String gepmodu;

    private Date gepdate;

    private String gep11;

    private String geporig;

    private String geporiu;

    private static final long serialVersionUID = 1L;

    public String getGep01() {
        return gep01;
    }

    public void setGep01(String gep01) {
        this.gep01 = gep01 == null ? null : gep01.trim();
    }

    public String getGep02() {
        return gep02;
    }

    public void setGep02(String gep02) {
        this.gep02 = gep02 == null ? null : gep02.trim();
    }

    public String getGep03() {
        return gep03;
    }

    public void setGep03(String gep03) {
        this.gep03 = gep03 == null ? null : gep03.trim();
    }

    public Date getGep04() {
        return gep04;
    }

    public void setGep04(Date gep04) {
        this.gep04 = gep04;
    }

    public String getGep05() {
        return gep05;
    }

    public void setGep05(String gep05) {
        this.gep05 = gep05 == null ? null : gep05.trim();
    }

    public String getGep06() {
        return gep06;
    }

    public void setGep06(String gep06) {
        this.gep06 = gep06 == null ? null : gep06.trim();
    }

    public String getGep07() {
        return gep07;
    }

    public void setGep07(String gep07) {
        this.gep07 = gep07 == null ? null : gep07.trim();
    }

    public String getGep08() {
        return gep08;
    }

    public void setGep08(String gep08) {
        this.gep08 = gep08 == null ? null : gep08.trim();
    }

    public String getGep09() {
        return gep09;
    }

    public void setGep09(String gep09) {
        this.gep09 = gep09 == null ? null : gep09.trim();
    }

    public String getGep10() {
        return gep10;
    }

    public void setGep10(String gep10) {
        this.gep10 = gep10 == null ? null : gep10.trim();
    }

    public String getGepacti() {
        return gepacti;
    }

    public void setGepacti(String gepacti) {
        this.gepacti = gepacti == null ? null : gepacti.trim();
    }

    public String getGepuser() {
        return gepuser;
    }

    public void setGepuser(String gepuser) {
        this.gepuser = gepuser == null ? null : gepuser.trim();
    }

    public String getGepgrup() {
        return gepgrup;
    }

    public void setGepgrup(String gepgrup) {
        this.gepgrup = gepgrup == null ? null : gepgrup.trim();
    }

    public String getGepmodu() {
        return gepmodu;
    }

    public void setGepmodu(String gepmodu) {
        this.gepmodu = gepmodu == null ? null : gepmodu.trim();
    }

    public Date getGepdate() {
        return gepdate;
    }

    public void setGepdate(Date gepdate) {
        this.gepdate = gepdate;
    }

    public String getGep11() {
        return gep11;
    }

    public void setGep11(String gep11) {
        this.gep11 = gep11 == null ? null : gep11.trim();
    }

    public String getGeporig() {
        return geporig;
    }

    public void setGeporig(String geporig) {
        this.geporig = geporig == null ? null : geporig.trim();
    }

    public String getGeporiu() {
        return geporiu;
    }

    public void setGeporiu(String geporiu) {
        this.geporiu = geporiu == null ? null : geporiu.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gep01=").append(gep01);
        sb.append(", gep02=").append(gep02);
        sb.append(", gep03=").append(gep03);
        sb.append(", gep04=").append(gep04);
        sb.append(", gep05=").append(gep05);
        sb.append(", gep06=").append(gep06);
        sb.append(", gep07=").append(gep07);
        sb.append(", gep08=").append(gep08);
        sb.append(", gep09=").append(gep09);
        sb.append(", gep10=").append(gep10);
        sb.append(", gepacti=").append(gepacti);
        sb.append(", gepuser=").append(gepuser);
        sb.append(", gepgrup=").append(gepgrup);
        sb.append(", gepmodu=").append(gepmodu);
        sb.append(", gepdate=").append(gepdate);
        sb.append(", gep11=").append(gep11);
        sb.append(", geporig=").append(geporig);
        sb.append(", geporiu=").append(geporiu);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.grand.springcloud.entity.tiptop;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TC_BRE_FILE_Z implements Serializable {
    private String tcBre01;

    private String tcBre02;

    private String tcBre03;

    private String tcBre04;

    private String tcBre05;

    private String tcBreuser;

    private String tcBregrup;

    private String tcBremodu;

    private Date tcBredate;

    private String tcBreud01;

    private String tcBreud02;

    private BigDecimal tcBreud03;

    private BigDecimal tcBreud04;

    private Date tcBreud05;

    private Date tcBreud06;

    private String tcBreplant;

    private String tcBrelegal;

    private List<TC_BRF_FILE> data;

    private static final long serialVersionUID = 1L;

    public String getTcBre01() {
        return tcBre01;
    }

    public void setTcBre01(String tcBre01) {
        this.tcBre01 = tcBre01 == null ? null : tcBre01.trim();
    }

    public String getTcBre02() {
        return tcBre02;
    }

    public void setTcBre02(String tcBre02) {
        this.tcBre02 = tcBre02 == null ? null : tcBre02.trim();
    }

    public String getTcBre03() {
        return tcBre03;
    }

    public void setTcBre03(String tcBre03) {
        this.tcBre03 = tcBre03 == null ? null : tcBre03.trim();
    }

    public String getTcBre04() {
        return tcBre04;
    }

    public void setTcBre04(String tcBre04) {
        this.tcBre04 = tcBre04 == null ? null : tcBre04.trim();
    }

    public String getTcBre05() {
        return tcBre05;
    }

    public void setTcBre05(String tcBre05) {
        this.tcBre05 = tcBre05 == null ? null : tcBre05.trim();
    }

    public String getTcBreuser() {
        return tcBreuser;
    }

    public void setTcBreuser(String tcBreuser) {
        this.tcBreuser = tcBreuser == null ? null : tcBreuser.trim();
    }

    public String getTcBregrup() {
        return tcBregrup;
    }

    public void setTcBregrup(String tcBregrup) {
        this.tcBregrup = tcBregrup == null ? null : tcBregrup.trim();
    }

    public String getTcBremodu() {
        return tcBremodu;
    }

    public void setTcBremodu(String tcBremodu) {
        this.tcBremodu = tcBremodu == null ? null : tcBremodu.trim();
    }

    public Date getTcBredate() {
        return tcBredate;
    }

    public void setTcBredate(Date tcBredate) {
        this.tcBredate = tcBredate;
    }

    public String getTcBreud01() {
        return tcBreud01;
    }

    public void setTcBreud01(String tcBreud01) {
        this.tcBreud01 = tcBreud01 == null ? null : tcBreud01.trim();
    }

    public String getTcBreud02() {
        return tcBreud02;
    }

    public void setTcBreud02(String tcBreud02) {
        this.tcBreud02 = tcBreud02 == null ? null : tcBreud02.trim();
    }

    public BigDecimal getTcBreud03() {
        return tcBreud03;
    }

    public void setTcBreud03(BigDecimal tcBreud03) {
        this.tcBreud03 = tcBreud03;
    }

    public BigDecimal getTcBreud04() {
        return tcBreud04;
    }

    public void setTcBreud04(BigDecimal tcBreud04) {
        this.tcBreud04 = tcBreud04;
    }

    public Date getTcBreud05() {
        return tcBreud05;
    }

    public void setTcBreud05(Date tcBreud05) {
        this.tcBreud05 = tcBreud05;
    }

    public Date getTcBreud06() {
        return tcBreud06;
    }

    public void setTcBreud06(Date tcBreud06) {
        this.tcBreud06 = tcBreud06;
    }

    public String getTcBreplant() {
        return tcBreplant;
    }

    public void setTcBreplant(String tcBreplant) {
        this.tcBreplant = tcBreplant == null ? null : tcBreplant.trim();
    }

    public String getTcBrelegal() {
        return tcBrelegal;
    }

    public void setTcBrelegal(String tcBrelegal) {
        this.tcBrelegal = tcBrelegal == null ? null : tcBrelegal.trim();
    }

    public List<TC_BRF_FILE> getData()
    {
        return data;
    }

    public void setData(List<TC_BRF_FILE> data)
    {
        this.data = data;
    }
    @Override
    public String toString()
    {
        return "TC_BRE_FILE_Z{" +
                "tcBre01='" + tcBre01 + '\'' +
                ", tcBre02='" + tcBre02 + '\'' +
                ", tcBre03='" + tcBre03 + '\'' +
                ", tcBre04='" + tcBre04 + '\'' +
                ", tcBre05='" + tcBre05 + '\'' +
                ", tcBreuser='" + tcBreuser + '\'' +
                ", tcBregrup='" + tcBregrup + '\'' +
                ", tcBremodu='" + tcBremodu + '\'' +
                ", tcBredate=" + tcBredate +
                ", tcBreud01='" + tcBreud01 + '\'' +
                ", tcBreud02='" + tcBreud02 + '\'' +
                ", tcBreud03=" + tcBreud03 +
                ", tcBreud04=" + tcBreud04 +
                ", tcBreud05=" + tcBreud05 +
                ", tcBreud06=" + tcBreud06 +
                ", tcBreplant='" + tcBreplant + '\'' +
                ", tcBrelegal='" + tcBrelegal + '\'' +
                ", Data=" + data +
                '}';
    }

    //    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(getClass().getSimpleName());
//        sb.append(" [");
//        sb.append("Hash = ").append(hashCode());
//        sb.append(", tcBre01=").append(tcBre01);
//        sb.append(", tcBre02=").append(tcBre02);
//        sb.append(", tcBre03=").append(tcBre03);
//        sb.append(", tcBre04=").append(tcBre04);
//        sb.append(", tcBre05=").append(tcBre05);
//        sb.append(", tcBreuser=").append(tcBreuser);
//        sb.append(", tcBregrup=").append(tcBregrup);
//        sb.append(", tcBremodu=").append(tcBremodu);
//        sb.append(", tcBredate=").append(tcBredate);
//        sb.append(", tcBreud01=").append(tcBreud01);
//        sb.append(", tcBreud02=").append(tcBreud02);
//        sb.append(", tcBreud03=").append(tcBreud03);
//        sb.append(", tcBreud04=").append(tcBreud04);
//        sb.append(", tcBreud05=").append(tcBreud05);
//        sb.append(", tcBreud06=").append(tcBreud06);
//        sb.append(", tcBreplant=").append(tcBreplant);
//        sb.append(", tcBrelegal=").append(tcBrelegal);
//        sb.append(", serialVersionUID=").append(serialVersionUID);
//        sb.append("]");
//        return sb.toString();
//    }
}
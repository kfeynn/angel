package com.grand.springcloud.entity.tiptop;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RVBS_FILE implements Serializable {
    private String rvbs00;

    private String rvbs01;

    private Integer rvbs02;

    private Integer rvbs022;

    private Integer rvbs09;

    private Integer rvbs13;

    private String rvbs03;

    private String rvbs04;

    private Date rvbs05;

    private BigDecimal rvbs06;

    private String rvbs07;

    private String rvbs08;

    private String rvbs021;

    private BigDecimal rvbs10;

    private BigDecimal rvbs11;

    private BigDecimal rvbs12;

    private String rvbsplant;

    private String rvbslegal;

    private static final long serialVersionUID = 1L;

    public String getRvbs00() {
        return rvbs00;
    }

    public void setRvbs00(String rvbs00) {
        this.rvbs00 = rvbs00 == null ? null : rvbs00.trim();
    }

    public String getRvbs01() {
        return rvbs01;
    }

    public void setRvbs01(String rvbs01) {
        this.rvbs01 = rvbs01 == null ? null : rvbs01.trim();
    }

    public Integer getRvbs02() {
        return rvbs02;
    }

    public void setRvbs02(Integer rvbs02) {
        this.rvbs02 = rvbs02;
    }

    public Integer getRvbs022() {
        return rvbs022;
    }

    public void setRvbs022(Integer rvbs022) {
        this.rvbs022 = rvbs022;
    }

    public Integer getRvbs09() {
        return rvbs09;
    }

    public void setRvbs09(Integer rvbs09) {
        this.rvbs09 = rvbs09;
    }

    public Integer getRvbs13() {
        return rvbs13;
    }

    public void setRvbs13(Integer rvbs13) {
        this.rvbs13 = rvbs13;
    }

    public String getRvbs03() {
        return rvbs03;
    }

    public void setRvbs03(String rvbs03) {
        this.rvbs03 = rvbs03 == null ? null : rvbs03.trim();
    }

    public String getRvbs04() {
        return rvbs04;
    }

    public void setRvbs04(String rvbs04) {
        this.rvbs04 = rvbs04 == null ? null : rvbs04.trim();
    }

    public Date getRvbs05() {
        return rvbs05;
    }

    public void setRvbs05(Date rvbs05) {
        this.rvbs05 = rvbs05;
    }

    public BigDecimal getRvbs06() {
        return rvbs06;
    }

    public void setRvbs06(BigDecimal rvbs06) {
        this.rvbs06 = rvbs06;
    }

    public String getRvbs07() {
        return rvbs07;
    }

    public void setRvbs07(String rvbs07) {
        this.rvbs07 = rvbs07 == null ? null : rvbs07.trim();
    }

    public String getRvbs08() {
        return rvbs08;
    }

    public void setRvbs08(String rvbs08) {
        this.rvbs08 = rvbs08 == null ? null : rvbs08.trim();
    }

    public String getRvbs021() {
        return rvbs021;
    }

    public void setRvbs021(String rvbs021) {
        this.rvbs021 = rvbs021 == null ? null : rvbs021.trim();
    }

    public BigDecimal getRvbs10() {
        return rvbs10;
    }

    public void setRvbs10(BigDecimal rvbs10) {
        this.rvbs10 = rvbs10;
    }

    public BigDecimal getRvbs11() {
        return rvbs11;
    }

    public void setRvbs11(BigDecimal rvbs11) {
        this.rvbs11 = rvbs11;
    }

    public BigDecimal getRvbs12() {
        return rvbs12;
    }

    public void setRvbs12(BigDecimal rvbs12) {
        this.rvbs12 = rvbs12;
    }

    public String getRvbsplant() {
        return rvbsplant;
    }

    public void setRvbsplant(String rvbsplant) {
        this.rvbsplant = rvbsplant == null ? null : rvbsplant.trim();
    }

    public String getRvbslegal() {
        return rvbslegal;
    }

    public void setRvbslegal(String rvbslegal) {
        this.rvbslegal = rvbslegal == null ? null : rvbslegal.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rvbs00=").append(rvbs00);
        sb.append(", rvbs01=").append(rvbs01);
        sb.append(", rvbs02=").append(rvbs02);
        sb.append(", rvbs022=").append(rvbs022);
        sb.append(", rvbs09=").append(rvbs09);
        sb.append(", rvbs13=").append(rvbs13);
        sb.append(", rvbs03=").append(rvbs03);
        sb.append(", rvbs04=").append(rvbs04);
        sb.append(", rvbs05=").append(rvbs05);
        sb.append(", rvbs06=").append(rvbs06);
        sb.append(", rvbs07=").append(rvbs07);
        sb.append(", rvbs08=").append(rvbs08);
        sb.append(", rvbs021=").append(rvbs021);
        sb.append(", rvbs10=").append(rvbs10);
        sb.append(", rvbs11=").append(rvbs11);
        sb.append(", rvbs12=").append(rvbs12);
        sb.append(", rvbsplant=").append(rvbsplant);
        sb.append(", rvbslegal=").append(rvbslegal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
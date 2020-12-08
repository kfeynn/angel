package com.grand.springcloud.entity.tiptop;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TC_BRF_FILE implements Serializable {
    private String tcBrf01;

    private String tcBrf02;

    private String tcBrf03;

    private String tcBrf04;

    private String tcBrf05;

    private BigDecimal tcBrf06;

    private String tcBrfud01;

    private String tcBrfud02;

    private BigDecimal tcBrfud03;

    private BigDecimal tcBrfud04;

    private Date tcBrfud05;

    private Date tcBrfud06;

    private String tcBrfplant;

    private String tcBrflegal;

    private String tcBrf07;

    private String tcBrf08;

    private BigDecimal tcBrf09;

    private BigDecimal tcBrf10;

    private static final long serialVersionUID = 1L;

    public String getTcBrf01() {
        return tcBrf01;
    }

    public void setTcBrf01(String tcBrf01) {
        this.tcBrf01 = tcBrf01 == null ? null : tcBrf01.trim();
    }

    public String getTcBrf02() {
        return tcBrf02;
    }

    public void setTcBrf02(String tcBrf02) {
        this.tcBrf02 = tcBrf02 == null ? null : tcBrf02.trim();
    }

    public String getTcBrf03() {
        return tcBrf03;
    }

    public void setTcBrf03(String tcBrf03) {
        this.tcBrf03 = tcBrf03 == null ? null : tcBrf03.trim();
    }

    public String getTcBrf04() {
        return tcBrf04;
    }

    public void setTcBrf04(String tcBrf04) {
        this.tcBrf04 = tcBrf04 == null ? null : tcBrf04.trim();
    }

    public String getTcBrf05() {
        return tcBrf05;
    }

    public void setTcBrf05(String tcBrf05) {
        this.tcBrf05 = tcBrf05 == null ? null : tcBrf05.trim();
    }

    public BigDecimal getTcBrf06() {
        return tcBrf06;
    }

    public void setTcBrf06(BigDecimal tcBrf06) {
        this.tcBrf06 = tcBrf06;
    }

    public String getTcBrfud01() {
        return tcBrfud01;
    }

    public void setTcBrfud01(String tcBrfud01) {
        this.tcBrfud01 = tcBrfud01 == null ? null : tcBrfud01.trim();
    }

    public String getTcBrfud02() {
        return tcBrfud02;
    }

    public void setTcBrfud02(String tcBrfud02) {
        this.tcBrfud02 = tcBrfud02 == null ? null : tcBrfud02.trim();
    }

    public BigDecimal getTcBrfud03() {
        return tcBrfud03;
    }

    public void setTcBrfud03(BigDecimal tcBrfud03) {
        this.tcBrfud03 = tcBrfud03;
    }

    public BigDecimal getTcBrfud04() {
        return tcBrfud04;
    }

    public void setTcBrfud04(BigDecimal tcBrfud04) {
        this.tcBrfud04 = tcBrfud04;
    }

    public Date getTcBrfud05() {
        return tcBrfud05;
    }

    public void setTcBrfud05(Date tcBrfud05) {
        this.tcBrfud05 = tcBrfud05;
    }

    public Date getTcBrfud06() {
        return tcBrfud06;
    }

    public void setTcBrfud06(Date tcBrfud06) {
        this.tcBrfud06 = tcBrfud06;
    }

    public String getTcBrfplant() {
        return tcBrfplant;
    }

    public void setTcBrfplant(String tcBrfplant) {
        this.tcBrfplant = tcBrfplant == null ? null : tcBrfplant.trim();
    }

    public String getTcBrflegal() {
        return tcBrflegal;
    }

    public void setTcBrflegal(String tcBrflegal) {
        this.tcBrflegal = tcBrflegal == null ? null : tcBrflegal.trim();
    }

    public String getTcBrf07() {
        return tcBrf07;
    }

    public void setTcBrf07(String tcBrf07) {
        this.tcBrf07 = tcBrf07 == null ? null : tcBrf07.trim();
    }

    public String getTcBrf08() {
        return tcBrf08;
    }

    public void setTcBrf08(String tcBrf08) {
        this.tcBrf08 = tcBrf08 == null ? null : tcBrf08.trim();
    }

    public BigDecimal getTcBrf09() {
        return tcBrf09;
    }

    public void setTcBrf09(BigDecimal tcBrf09) {
        this.tcBrf09 = tcBrf09;
    }

    public BigDecimal getTcBrf10() {
        return tcBrf10;
    }

    public void setTcBrf10(BigDecimal tcBrf10) {
        this.tcBrf10 = tcBrf10;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tcBrf01=").append(tcBrf01);
        sb.append(", tcBrf02=").append(tcBrf02);
        sb.append(", tcBrf03=").append(tcBrf03);
        sb.append(", tcBrf04=").append(tcBrf04);
        sb.append(", tcBrf05=").append(tcBrf05);
        sb.append(", tcBrf06=").append(tcBrf06);
        sb.append(", tcBrfud01=").append(tcBrfud01);
        sb.append(", tcBrfud02=").append(tcBrfud02);
        sb.append(", tcBrfud03=").append(tcBrfud03);
        sb.append(", tcBrfud04=").append(tcBrfud04);
        sb.append(", tcBrfud05=").append(tcBrfud05);
        sb.append(", tcBrfud06=").append(tcBrfud06);
        sb.append(", tcBrfplant=").append(tcBrfplant);
        sb.append(", tcBrflegal=").append(tcBrflegal);
        sb.append(", tcBrf07=").append(tcBrf07);
        sb.append(", tcBrf08=").append(tcBrf08);
        sb.append(", tcBrf09=").append(tcBrf09);
        sb.append(", tcBrf10=").append(tcBrf10);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
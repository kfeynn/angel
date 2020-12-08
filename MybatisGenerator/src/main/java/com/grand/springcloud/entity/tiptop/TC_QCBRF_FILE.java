package com.grand.springcloud.entity.tiptop;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TC_QCBRF_FILE implements Serializable {
    private String tcQcbrf01;

    private String tcQcbrf02;

    private String tcQcbrf03;

    private String tcQcbrf04;

    private String tcQcbrf05;

    private BigDecimal tcQcbrf06;

    private String tcQcbrfud01;

    private String tcQcbrfud02;

    private BigDecimal tcQcbrfud03;

    private BigDecimal tcQcbrfud04;

    private Date tcQcbrfud05;

    private Date tcQcbrfud06;

    private String tcQcbrfplant;

    private String tcQcbrflegal;

    private static final long serialVersionUID = 1L;

    public String getTcQcbrf01() {
        return tcQcbrf01;
    }

    public void setTcQcbrf01(String tcQcbrf01) {
        this.tcQcbrf01 = tcQcbrf01 == null ? null : tcQcbrf01.trim();
    }

    public String getTcQcbrf02() {
        return tcQcbrf02;
    }

    public void setTcQcbrf02(String tcQcbrf02) {
        this.tcQcbrf02 = tcQcbrf02 == null ? null : tcQcbrf02.trim();
    }

    public String getTcQcbrf03() {
        return tcQcbrf03;
    }

    public void setTcQcbrf03(String tcQcbrf03) {
        this.tcQcbrf03 = tcQcbrf03 == null ? null : tcQcbrf03.trim();
    }

    public String getTcQcbrf04() {
        return tcQcbrf04;
    }

    public void setTcQcbrf04(String tcQcbrf04) {
        this.tcQcbrf04 = tcQcbrf04 == null ? null : tcQcbrf04.trim();
    }

    public String getTcQcbrf05() {
        return tcQcbrf05;
    }

    public void setTcQcbrf05(String tcQcbrf05) {
        this.tcQcbrf05 = tcQcbrf05 == null ? null : tcQcbrf05.trim();
    }

    public BigDecimal getTcQcbrf06() {
        return tcQcbrf06;
    }

    public void setTcQcbrf06(BigDecimal tcQcbrf06) {
        this.tcQcbrf06 = tcQcbrf06;
    }

    public String getTcQcbrfud01() {
        return tcQcbrfud01;
    }

    public void setTcQcbrfud01(String tcQcbrfud01) {
        this.tcQcbrfud01 = tcQcbrfud01 == null ? null : tcQcbrfud01.trim();
    }

    public String getTcQcbrfud02() {
        return tcQcbrfud02;
    }

    public void setTcQcbrfud02(String tcQcbrfud02) {
        this.tcQcbrfud02 = tcQcbrfud02 == null ? null : tcQcbrfud02.trim();
    }

    public BigDecimal getTcQcbrfud03() {
        return tcQcbrfud03;
    }

    public void setTcQcbrfud03(BigDecimal tcQcbrfud03) {
        this.tcQcbrfud03 = tcQcbrfud03;
    }

    public BigDecimal getTcQcbrfud04() {
        return tcQcbrfud04;
    }

    public void setTcQcbrfud04(BigDecimal tcQcbrfud04) {
        this.tcQcbrfud04 = tcQcbrfud04;
    }

    public Date getTcQcbrfud05() {
        return tcQcbrfud05;
    }

    public void setTcQcbrfud05(Date tcQcbrfud05) {
        this.tcQcbrfud05 = tcQcbrfud05;
    }

    public Date getTcQcbrfud06() {
        return tcQcbrfud06;
    }

    public void setTcQcbrfud06(Date tcQcbrfud06) {
        this.tcQcbrfud06 = tcQcbrfud06;
    }

    public String getTcQcbrfplant() {
        return tcQcbrfplant;
    }

    public void setTcQcbrfplant(String tcQcbrfplant) {
        this.tcQcbrfplant = tcQcbrfplant == null ? null : tcQcbrfplant.trim();
    }

    public String getTcQcbrflegal() {
        return tcQcbrflegal;
    }

    public void setTcQcbrflegal(String tcQcbrflegal) {
        this.tcQcbrflegal = tcQcbrflegal == null ? null : tcQcbrflegal.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tcQcbrf01=").append(tcQcbrf01);
        sb.append(", tcQcbrf02=").append(tcQcbrf02);
        sb.append(", tcQcbrf03=").append(tcQcbrf03);
        sb.append(", tcQcbrf04=").append(tcQcbrf04);
        sb.append(", tcQcbrf05=").append(tcQcbrf05);
        sb.append(", tcQcbrf06=").append(tcQcbrf06);
        sb.append(", tcQcbrfud01=").append(tcQcbrfud01);
        sb.append(", tcQcbrfud02=").append(tcQcbrfud02);
        sb.append(", tcQcbrfud03=").append(tcQcbrfud03);
        sb.append(", tcQcbrfud04=").append(tcQcbrfud04);
        sb.append(", tcQcbrfud05=").append(tcQcbrfud05);
        sb.append(", tcQcbrfud06=").append(tcQcbrfud06);
        sb.append(", tcQcbrfplant=").append(tcQcbrfplant);
        sb.append(", tcQcbrflegal=").append(tcQcbrflegal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.grand.springcloud.entity.tiptop;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class IMGS_FILE implements Serializable {
    private String imgs01;

    private String imgs02;

    private String imgs03;

    private String imgs04;

    private String imgs05;

    private String imgs06;

    private String imgs11;

    private String imgs07;

    private BigDecimal imgs08;

    private Date imgs09;

    private String imgs10;

    private String imgsplant;

    private String imgslegal;

    private static final long serialVersionUID = 1L;

    public String getImgs01() {
        return imgs01;
    }

    public void setImgs01(String imgs01) {
        this.imgs01 = imgs01 == null ? null : imgs01.trim();
    }

    public String getImgs02() {
        return imgs02;
    }

    public void setImgs02(String imgs02) {
        this.imgs02 = imgs02 == null ? null : imgs02.trim();
    }

    public String getImgs03() {
        return imgs03;
    }

    public void setImgs03(String imgs03) {
        this.imgs03 = imgs03 == null ? null : imgs03.trim();
    }

    public String getImgs04() {
        return imgs04;
    }

    public void setImgs04(String imgs04) {
        this.imgs04 = imgs04 == null ? null : imgs04.trim();
    }

    public String getImgs05() {
        return imgs05;
    }

    public void setImgs05(String imgs05) {
        this.imgs05 = imgs05 == null ? null : imgs05.trim();
    }

    public String getImgs06() {
        return imgs06;
    }

    public void setImgs06(String imgs06) {
        this.imgs06 = imgs06 == null ? null : imgs06.trim();
    }

    public String getImgs11() {
        return imgs11;
    }

    public void setImgs11(String imgs11) {
        this.imgs11 = imgs11 == null ? null : imgs11.trim();
    }

    public String getImgs07() {
        return imgs07;
    }

    public void setImgs07(String imgs07) {
        this.imgs07 = imgs07 == null ? null : imgs07.trim();
    }

    public BigDecimal getImgs08() {
        return imgs08;
    }

    public void setImgs08(BigDecimal imgs08) {
        this.imgs08 = imgs08;
    }

    public Date getImgs09() {
        return imgs09;
    }

    public void setImgs09(Date imgs09) {
        this.imgs09 = imgs09;
    }

    public String getImgs10() {
        return imgs10;
    }

    public void setImgs10(String imgs10) {
        this.imgs10 = imgs10 == null ? null : imgs10.trim();
    }

    public String getImgsplant() {
        return imgsplant;
    }

    public void setImgsplant(String imgsplant) {
        this.imgsplant = imgsplant == null ? null : imgsplant.trim();
    }

    public String getImgslegal() {
        return imgslegal;
    }

    public void setImgslegal(String imgslegal) {
        this.imgslegal = imgslegal == null ? null : imgslegal.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", imgs01=").append(imgs01);
        sb.append(", imgs02=").append(imgs02);
        sb.append(", imgs03=").append(imgs03);
        sb.append(", imgs04=").append(imgs04);
        sb.append(", imgs05=").append(imgs05);
        sb.append(", imgs06=").append(imgs06);
        sb.append(", imgs11=").append(imgs11);
        sb.append(", imgs07=").append(imgs07);
        sb.append(", imgs08=").append(imgs08);
        sb.append(", imgs09=").append(imgs09);
        sb.append(", imgs10=").append(imgs10);
        sb.append(", imgsplant=").append(imgsplant);
        sb.append(", imgslegal=").append(imgslegal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
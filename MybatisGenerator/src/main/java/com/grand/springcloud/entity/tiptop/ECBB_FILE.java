package com.grand.springcloud.entity.tiptop;

import java.io.Serializable;

public class ECBB_FILE implements Serializable {
    private String ecbb01;

    private String ecbb02;

    private Integer ecbb03;

    private Integer ecbb09;

    private String ecbb012;

    private String ecbb10;

    private static final long serialVersionUID = 1L;

    public String getEcbb01() {
        return ecbb01;
    }

    public void setEcbb01(String ecbb01) {
        this.ecbb01 = ecbb01 == null ? null : ecbb01.trim();
    }

    public String getEcbb02() {
        return ecbb02;
    }

    public void setEcbb02(String ecbb02) {
        this.ecbb02 = ecbb02 == null ? null : ecbb02.trim();
    }

    public Integer getEcbb03() {
        return ecbb03;
    }

    public void setEcbb03(Integer ecbb03) {
        this.ecbb03 = ecbb03;
    }

    public Integer getEcbb09() {
        return ecbb09;
    }

    public void setEcbb09(Integer ecbb09) {
        this.ecbb09 = ecbb09;
    }

    public String getEcbb012() {
        return ecbb012;
    }

    public void setEcbb012(String ecbb012) {
        this.ecbb012 = ecbb012 == null ? null : ecbb012.trim();
    }

    public String getEcbb10() {
        return ecbb10;
    }

    public void setEcbb10(String ecbb10) {
        this.ecbb10 = ecbb10 == null ? null : ecbb10.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ecbb01=").append(ecbb01);
        sb.append(", ecbb02=").append(ecbb02);
        sb.append(", ecbb03=").append(ecbb03);
        sb.append(", ecbb09=").append(ecbb09);
        sb.append(", ecbb012=").append(ecbb012);
        sb.append(", ecbb10=").append(ecbb10);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
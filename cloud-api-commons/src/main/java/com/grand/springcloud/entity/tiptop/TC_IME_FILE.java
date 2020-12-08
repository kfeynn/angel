package com.grand.springcloud.entity.tiptop;

import java.io.Serializable;

public class TC_IME_FILE implements Serializable {
    private String tcIme01;

    private String tcIme02;

    private String tcIme03;

    private static final long serialVersionUID = 1L;

    public String getTcIme01() {
        return tcIme01;
    }

    public void setTcIme01(String tcIme01) {
        this.tcIme01 = tcIme01 == null ? null : tcIme01.trim();
    }

    public String getTcIme02() {
        return tcIme02;
    }

    public void setTcIme02(String tcIme02) {
        this.tcIme02 = tcIme02 == null ? null : tcIme02.trim();
    }

    public String getTcIme03() {
        return tcIme03;
    }

    public void setTcIme03(String tcIme03) {
        this.tcIme03 = tcIme03 == null ? null : tcIme03.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tcIme01=").append(tcIme01);
        sb.append(", tcIme02=").append(tcIme02);
        sb.append(", tcIme03=").append(tcIme03);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.grand.springcloud.entity.supplier;

import java.io.Serializable;

public class PNSub implements Serializable {
    private Long id;

    private String pmm01;

    private Long pmn02;

    private String pmn04;

    private String pmn041;

    private String ima021;

    private String pmn07;

    private Double pmn20;

    private String pmn86;

    private Double pmn87;

    private Long status;

    private String sdnnum;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPmm01() {
        return pmm01;
    }

    public void setPmm01(String pmm01) {
        this.pmm01 = pmm01 == null ? null : pmm01.trim();
    }

    public Long getPmn02() {
        return pmn02;
    }

    public void setPmn02(Long pmn02) {
        this.pmn02 = pmn02;
    }

    public String getPmn04() {
        return pmn04;
    }

    public void setPmn04(String pmn04) {
        this.pmn04 = pmn04 == null ? null : pmn04.trim();
    }

    public String getPmn041() {
        return pmn041;
    }

    public void setPmn041(String pmn041) {
        this.pmn041 = pmn041 == null ? null : pmn041.trim();
    }

    public String getIma021() {
        return ima021;
    }

    public void setIma021(String ima021) {
        this.ima021 = ima021 == null ? null : ima021.trim();
    }

    public String getPmn07() {
        return pmn07;
    }

    public void setPmn07(String pmn07) {
        this.pmn07 = pmn07 == null ? null : pmn07.trim();
    }

    public Double getPmn20() {
        return pmn20;
    }

    public void setPmn20(Double pmn20) {
        this.pmn20 = pmn20;
    }

    public String getPmn86() {
        return pmn86;
    }

    public void setPmn86(String pmn86) {
        this.pmn86 = pmn86 == null ? null : pmn86.trim();
    }

    public Double getPmn87() {
        return pmn87;
    }

    public void setPmn87(Double pmn87) {
        this.pmn87 = pmn87;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getSdnnum() {
        return sdnnum;
    }

    public void setSdnnum(String sdnnum) {
        this.sdnnum = sdnnum == null ? null : sdnnum.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pmm01=").append(pmm01);
        sb.append(", pmn02=").append(pmn02);
        sb.append(", pmn04=").append(pmn04);
        sb.append(", pmn041=").append(pmn041);
        sb.append(", ima021=").append(ima021);
        sb.append(", pmn07=").append(pmn07);
        sb.append(", pmn20=").append(pmn20);
        sb.append(", pmn86=").append(pmn86);
        sb.append(", pmn87=").append(pmn87);
        sb.append(", status=").append(status);
        sb.append(", sdnnum=").append(sdnnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
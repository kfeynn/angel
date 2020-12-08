package com.grand.springcloud.entity.tiptop;

import java.io.Serializable;
import java.util.Date;

public class GEN_FILE implements Serializable {
    private String gen01;

    private String gen02;

    private String gen03;

    private String gen04;

    private String gen05;

    private String gen06;

    private String genacti;

    private String genuser;

    private String gengrup;

    private String genmodu;

    private Date gendate;

    private String genorig;

    private String genoriu;

    private String genpos;

    private String gen07;

    private String gen08;

    private Date taGendate;

    private String taGencomfire;

    private static final long serialVersionUID = 1L;

    public String getGen01() {
        return gen01;
    }

    public void setGen01(String gen01) {
        this.gen01 = gen01 == null ? null : gen01.trim();
    }

    public String getGen02() {
        return gen02;
    }

    public void setGen02(String gen02) {
        this.gen02 = gen02 == null ? null : gen02.trim();
    }

    public String getGen03() {
        return gen03;
    }

    public void setGen03(String gen03) {
        this.gen03 = gen03 == null ? null : gen03.trim();
    }

    public String getGen04() {
        return gen04;
    }

    public void setGen04(String gen04) {
        this.gen04 = gen04 == null ? null : gen04.trim();
    }

    public String getGen05() {
        return gen05;
    }

    public void setGen05(String gen05) {
        this.gen05 = gen05 == null ? null : gen05.trim();
    }

    public String getGen06() {
        return gen06;
    }

    public void setGen06(String gen06) {
        this.gen06 = gen06 == null ? null : gen06.trim();
    }

    public String getGenacti() {
        return genacti;
    }

    public void setGenacti(String genacti) {
        this.genacti = genacti == null ? null : genacti.trim();
    }

    public String getGenuser() {
        return genuser;
    }

    public void setGenuser(String genuser) {
        this.genuser = genuser == null ? null : genuser.trim();
    }

    public String getGengrup() {
        return gengrup;
    }

    public void setGengrup(String gengrup) {
        this.gengrup = gengrup == null ? null : gengrup.trim();
    }

    public String getGenmodu() {
        return genmodu;
    }

    public void setGenmodu(String genmodu) {
        this.genmodu = genmodu == null ? null : genmodu.trim();
    }

    public Date getGendate() {
        return gendate;
    }

    public void setGendate(Date gendate) {
        this.gendate = gendate;
    }

    public String getGenorig() {
        return genorig;
    }

    public void setGenorig(String genorig) {
        this.genorig = genorig == null ? null : genorig.trim();
    }

    public String getGenoriu() {
        return genoriu;
    }

    public void setGenoriu(String genoriu) {
        this.genoriu = genoriu == null ? null : genoriu.trim();
    }

    public String getGenpos() {
        return genpos;
    }

    public void setGenpos(String genpos) {
        this.genpos = genpos == null ? null : genpos.trim();
    }

    public String getGen07() {
        return gen07;
    }

    public void setGen07(String gen07) {
        this.gen07 = gen07 == null ? null : gen07.trim();
    }

    public String getGen08() {
        return gen08;
    }

    public void setGen08(String gen08) {
        this.gen08 = gen08 == null ? null : gen08.trim();
    }

    public Date getTaGendate() {
        return taGendate;
    }

    public void setTaGendate(Date taGendate) {
        this.taGendate = taGendate;
    }

    public String getTaGencomfire() {
        return taGencomfire;
    }

    public void setTaGencomfire(String taGencomfire) {
        this.taGencomfire = taGencomfire == null ? null : taGencomfire.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gen01=").append(gen01);
        sb.append(", gen02=").append(gen02);
        sb.append(", gen03=").append(gen03);
        sb.append(", gen04=").append(gen04);
        sb.append(", gen05=").append(gen05);
        sb.append(", gen06=").append(gen06);
        sb.append(", genacti=").append(genacti);
        sb.append(", genuser=").append(genuser);
        sb.append(", gengrup=").append(gengrup);
        sb.append(", genmodu=").append(genmodu);
        sb.append(", gendate=").append(gendate);
        sb.append(", genorig=").append(genorig);
        sb.append(", genoriu=").append(genoriu);
        sb.append(", genpos=").append(genpos);
        sb.append(", gen07=").append(gen07);
        sb.append(", gen08=").append(gen08);
        sb.append(", taGendate=").append(taGendate);
        sb.append(", taGencomfire=").append(taGencomfire);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.grand.springcloud.entity.sqlserver;

import java.io.Serializable;
import java.util.Date;

public class XpGridUser implements Serializable {
    private Integer userid;

    private String username;

    private String usercname;

    private String password;

    private Integer deleted;

    private Integer online;

    private Integer lastonlinetime;

    private Integer allonlinetime;

    private Integer logintimes;

    private Date currentlogindatetime;

    private Date lastoprtndatetime;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsercname() {
        return usercname;
    }

    public void setUsercname(String usercname) {
        this.usercname = usercname == null ? null : usercname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public Integer getLastonlinetime() {
        return lastonlinetime;
    }

    public void setLastonlinetime(Integer lastonlinetime) {
        this.lastonlinetime = lastonlinetime;
    }

    public Integer getAllonlinetime() {
        return allonlinetime;
    }

    public void setAllonlinetime(Integer allonlinetime) {
        this.allonlinetime = allonlinetime;
    }

    public Integer getLogintimes() {
        return logintimes;
    }

    public void setLogintimes(Integer logintimes) {
        this.logintimes = logintimes;
    }

    public Date getCurrentlogindatetime() {
        return currentlogindatetime;
    }

    public void setCurrentlogindatetime(Date currentlogindatetime) {
        this.currentlogindatetime = currentlogindatetime;
    }

    public Date getLastoprtndatetime() {
        return lastoprtndatetime;
    }

    public void setLastoprtndatetime(Date lastoprtndatetime) {
        this.lastoprtndatetime = lastoprtndatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", usercname=").append(usercname);
        sb.append(", password=").append(password);
        sb.append(", deleted=").append(deleted);
        sb.append(", online=").append(online);
        sb.append(", lastonlinetime=").append(lastonlinetime);
        sb.append(", allonlinetime=").append(allonlinetime);
        sb.append(", logintimes=").append(logintimes);
        sb.append(", currentlogindatetime=").append(currentlogindatetime);
        sb.append(", lastoprtndatetime=").append(lastoprtndatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
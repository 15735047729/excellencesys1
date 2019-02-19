package com.example.excellencesys.pojo;


import java.util.Date;

public class Find {

  private Integer fid;
  private String ftitle;
  private String fcontent;
  private Date ftime;
  private Integer findcid;

  public Integer getFid() {
    return fid;
  }

  public void setFid(Integer fid) {
    this.fid = fid;
  }

  public String getFtitle() {
    return ftitle;
  }

  public void setFtitle(String ftitle) {
    this.ftitle = ftitle;
  }

  public String getFcontent() {
    return fcontent;
  }

  public void setFcontent(String fcontent) {
    this.fcontent = fcontent;
  }

  public Date getFtime() {
    return ftime;
  }

  public void setFtime(Date ftime) {
    this.ftime = ftime;
  }

  public Integer getFindcid() {
    return findcid;
  }

  public void setFindcid(Integer findcid) {
    this.findcid = findcid;
  }
}

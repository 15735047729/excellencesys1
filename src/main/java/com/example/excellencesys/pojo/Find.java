package com.example.excellencesys.pojo;


public class Find {

  private long fid;
  private String ftitle;
  private String fcontent;
  private java.sql.Date ftime;
  private long findcid;


  public long getFid() {
    return fid;
  }

  public void setFid(long fid) {
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


  public java.sql.Date getFtime() {
    return ftime;
  }

  public void setFtime(java.sql.Date ftime) {
    this.ftime = ftime;
  }


  public long getFindcid() {
    return findcid;
  }

  public void setFindcid(long findcid) {
    this.findcid = findcid;
  }

}

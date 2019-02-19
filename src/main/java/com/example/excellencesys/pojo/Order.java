package com.example.excellencesys.pojo;


import java.util.Date;

public class Order {

  private Integer oid;
  private String oname;
  private Integer uid;
  private Integer orid;
  private Date ogtime;
  private Date octime;

  public Integer getOid() {
    return oid;
  }

  public void setOid(Integer oid) {
    this.oid = oid;
  }

  public String getOname() {
    return oname;
  }

  public void setOname(String oname) {
    this.oname = oname;
  }

  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public Integer getOrid() {
    return orid;
  }

  public void setOrid(Integer orid) {
    this.orid = orid;
  }

  public Date getOgtime() {
    return ogtime;
  }

  public void setOgtime(Date ogtime) {
    this.ogtime = ogtime;
  }

  public Date getOctime() {
    return octime;
  }

  public void setOctime(Date octime) {
    this.octime = octime;
  }
}

package com.example.excellencesys.pojo;


public class Order {

  private long oid;
  private String oname;
  private long uid;
  private long orid;
  private java.sql.Date ogtime;
  private java.sql.Date octime;


  public long getOid() {
    return oid;
  }

  public void setOid(long oid) {
    this.oid = oid;
  }


  public String getOname() {
    return oname;
  }

  public void setOname(String oname) {
    this.oname = oname;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public long getOrid() {
    return orid;
  }

  public void setOrid(long orid) {
    this.orid = orid;
  }


  public java.sql.Date getOgtime() {
    return ogtime;
  }

  public void setOgtime(java.sql.Date ogtime) {
    this.ogtime = ogtime;
  }


  public java.sql.Date getOctime() {
    return octime;
  }

  public void setOctime(java.sql.Date octime) {
    this.octime = octime;
  }

}

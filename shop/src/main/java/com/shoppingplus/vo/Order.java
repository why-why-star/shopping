package com.shoppingplus.vo;

public class Order {

    String Uname;
    String Gname;
    String time;
    String status1;//是否购买
    String status2;//是否有货

    public Order() {
    }

    public Order(String uname, String gname, String time, String status1, String status2) {
        Uname = uname;
        Gname = gname;
        this.time = time;
        this.status1 = status1;
        this.status2 = status2;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public String getGname() {
        return Gname;
    }

    public void setGname(String gname) {
        Gname = gname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }
}

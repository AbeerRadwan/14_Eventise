package com.example.abeer.eventise2;

public class Event {

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    private String txt;

    public String getTxt() {
        return txt;
    }

    public int getPic() {
        return pic;
    }

    private  int pic;
    Event(int pic , String Link){
        this.pic=pic;
        txt=Link;

    }

}

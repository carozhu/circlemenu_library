package com.carozhu.circlemenu;

/**
 * Created by wanghao on 2015/11/25.
 */
public class CircleMenuItem {
    public int imageOnId;
    public int imageOffId;
    public String title;
    private int flag=0;//0--normal,off,1表示work on

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }


    public CircleMenuItem(int imageOnId,int imageOffId, int flag,String title) {
        this.imageOnId = imageOnId;
        this.imageOffId = imageOffId;
        this.flag = flag;
        this.title = title;
    }
}

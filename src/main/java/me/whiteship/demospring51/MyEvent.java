package me.whiteship.demospring51;

public class MyEvent{

    private int date;
    private Object source;

    public MyEvent(Object source,int date) {
       this.source = source;
        this.date = date;
    }

    public int getDate() {
        return date;
    }
}
// Spring FramWork 가 원하는 비침투성
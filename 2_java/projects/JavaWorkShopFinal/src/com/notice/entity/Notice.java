package com.notice.entity;

public class Notice {
    private int no;
    private String title;
    private String content;
    private String name;
    private String writeDay;

    public Notice() {
    }

    public Notice(int no, String title, String content, String name, String writeDay) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.name = name;
        this.writeDay = writeDay;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriteDay() {
        return writeDay;
    }

    public void setWriteDay(String writeDay) {
        this.writeDay = writeDay;
    }

    @Override
    public String toString() {
        return no + "\t\t" + title + "\t\t" + name + "\t\t" + writeDay;
    }
}

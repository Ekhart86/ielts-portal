package ru.ekhart86.views.rules;

public class RuleItem {
    private String title;
    private String subTitle;
    private int id;

    public RuleItem(String title, String subTitle, int id) {
        this.title = title;
        this.subTitle = subTitle;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

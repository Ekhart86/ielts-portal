package ru.ekhart86.views.vocabulary;

public class PrepositionItem {
    String englishName;
    String russianName;
    String group;
    String example;

    public PrepositionItem(String englishName, String russianName, String group, String example) {
        this.englishName = englishName;
        this.russianName = russianName;
        this.group = group;
        this.example = example;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getRussianName() {
        return russianName;
    }

    public void setRussianName(String russianName) {
        this.russianName = russianName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}

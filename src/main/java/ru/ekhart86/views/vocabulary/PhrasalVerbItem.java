package ru.ekhart86.views.vocabulary;

public class PhrasalVerbItem {
    String englishName;
    String russianName;
    String example;

    public PhrasalVerbItem(String englishName, String russianName, String example) {
        this.englishName = englishName;
        this.russianName = russianName;
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

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}

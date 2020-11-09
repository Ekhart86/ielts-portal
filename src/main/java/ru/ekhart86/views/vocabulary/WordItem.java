package ru.ekhart86.views.vocabulary;

public class WordItem {
    String englishName;
    String russianName;
    String transcription;

    public WordItem(String englishName, String russianName, String transcription) {
        this.englishName = englishName;
        this.russianName = russianName;
        this.transcription = transcription;
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

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }
}

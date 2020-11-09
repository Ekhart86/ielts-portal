package ru.ekhart86.views.vocabulary;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

import java.util.ArrayList;
import java.util.List;

@Route("start-word-for-ielts")
public class StartWordForIELTS extends Div implements ComponentFactory {

    public StartWordForIELTS() {
        add(createHeaderContentBackToThemes("vocabulary"));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header("Вступительные слова для IELTS"));
        List<WordItem> wordsList = new ArrayList<>();
        wordsList.add(new WordItem("one", "two", "three"));
        wordsList.add(new WordItem("one1", "two1", "three1"));
        wordsList.add(new WordItem("one2", "two2", "three2"));
        wordsList.add(new WordItem("one3", "two3", "three3"));
        verticalLayout.addAndExpand(createWordTable(wordsList));
        add(verticalLayout);
    }
}

package ru.ekhart86.views.ieltswords;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;
import ru.ekhart86.views.vocabulary.PhraseItem;

import java.util.ArrayList;
import java.util.List;
@Route("word-constructions")
public class WordConstructions extends Div implements ComponentFactory {
    public WordConstructions() {
        add(createHeaderContentBackToThemes("vocabulary", "Конструкции слов для IELTS"));
        VerticalLayout verticalLayout = new VerticalLayout();
        List<PhraseItem> wordsList = new ArrayList<>();
        wordsList.add(new PhraseItem("for the future", "value"));
        verticalLayout.addAndExpand(createPhraseTable(wordsList));
        add(verticalLayout);
    }
}

package ru.ekhart86.views.vocabulary;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

import java.util.ArrayList;
import java.util.List;
@Route("phrasal-verbs")
public class PhrasalVerbs extends Div implements ComponentFactory {

    public PhrasalVerbs() {
        add(createHeaderContentBackToThemes("vocabulary"));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header("Фразовые глаголы"));
        List<PhrasalVerbItem> wordsList = new ArrayList<>();
        wordsList.add(new PhrasalVerbItem("act on", "влиять, действовать на", "He acts on my nerves"));
        wordsList.add(new PhrasalVerbItem("act out", "притворяться, изображать", "There were acting out the story of their acquaintance"));
        wordsList.add(new PhrasalVerbItem("add up", "иметь смысл", "All this doesn't add up"));
        wordsList.add(new PhrasalVerbItem("add up to", "составлять", "The total expenses added up to $500"));
        wordsList.add(new PhrasalVerbItem("allow for", "учитывать", "You have to allow for your mistakes"));
        wordsList.add(new PhrasalVerbItem("allow of", "допускать", "The matter allows of no delay"));
        wordsList.add(new PhrasalVerbItem("answer back", "отвечать, дерзить в ответ", "If you answer back like that he will be mad at you"));
        wordsList.add(new PhrasalVerbItem("answer for", "нести ответственность за", "You have to answer for the consequences"));
        wordsList.add(new PhrasalVerbItem("answer to", "соответствовать", "This item doesn't answer to its description"));
        wordsList.add(new PhrasalVerbItem("ask after", "справляться о ком-либо, о чём-либо", "They asked after his health"));
        wordsList.add(new PhrasalVerbItem("ask for", "просить, требовать", "They asked for more pay"));
        wordsList.add(new PhrasalVerbItem("attend on", "ухаживать за кем-либо", "He attends on his sick father"));
        wordsList.add(new PhrasalVerbItem("attend to", "уделять внимание", "Have you attended to the customers?"));
        verticalLayout.addAndExpand(createPhrasalVerbsTable(wordsList));
        add(verticalLayout);
    }
}

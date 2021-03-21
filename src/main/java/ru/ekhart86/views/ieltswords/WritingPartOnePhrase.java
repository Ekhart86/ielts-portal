package ru.ekhart86.views.ieltswords;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;
import ru.ekhart86.views.vocabulary.PhraseItem;

import java.util.ArrayList;
import java.util.List;
@Route("writing-part-one-phrase")
public class WritingPartOnePhrase extends Div implements ComponentFactory {

    public WritingPartOnePhrase() {
        add(createHeaderContentBackToThemes("pattern-for-ielts", "Фразы для Writing Part 1 - Письмо"));
        VerticalLayout verticalLayout = new VerticalLayout();
        List<PhraseItem> wordsList = new ArrayList<>();
        wordsList.add(new PhraseItem("Furthermore", "Кроме того"));
        wordsList.add(new PhraseItem("Moreover", "Более того"));
        wordsList.add(new PhraseItem("In addition", "В дополнение"));
        wordsList.add(new PhraseItem("Such as", "Такие как"));
        wordsList.add(new PhraseItem("I believe that", "Я верю что"));
        wordsList.add(new PhraseItem("I tend to think that", "Я склонен думать, что"));
        wordsList.add(new PhraseItem("I agree that", "Я согласен, что"));
        wordsList.add(new PhraseItem("I hold the view that", "Я придерживаюсь мнения, что"));
        wordsList.add(new PhraseItem("In my view", "На мой взгляд"));
        wordsList.add(new PhraseItem("However", "Однако"));
        wordsList.add(new PhraseItem("In contrast to", "В отличие от"));
        wordsList.add(new PhraseItem("While", "Пока"));
        wordsList.add(new PhraseItem("Whereas", "В то время как"));
        wordsList.add(new PhraseItem("On the one hand", "С одной стороны"));
        wordsList.add(new PhraseItem("On the other hand", "С другой стороны"));
        wordsList.add(new PhraseItem("As a result", "В результате"));
        wordsList.add(new PhraseItem("Therefore", "следовательно, вследствие этого"));
        wordsList.add(new PhraseItem("Consequently", "вследствие, поэтому"));
        wordsList.add(new PhraseItem("In conclusion", "В заключение"));
        wordsList.add(new PhraseItem("To sum up", "подытожить, подводить итог"));
        wordsList.add(new PhraseItem("I am writing to inform you that", "Я пишу, чтобы сообщить вам, что"));
        wordsList.add(new PhraseItem("I am writing to ask you", "Я пишу, чтобы спросить вас"));
        wordsList.add(new PhraseItem("I am writing to inquire you", "Я пишу, чтобы спросить вас"));
        wordsList.add(new PhraseItem("I am writing with regard to", "Я пишу по поводу"));
        wordsList.add(new PhraseItem("Regard to", "относительно"));
        wordsList.add(new PhraseItem("I  am writing in connection with", "Я пишу в связи с"));
        wordsList.add(new PhraseItem("I am writing with reference to", "Пишу со ссылкой на"));
        wordsList.add(new PhraseItem("I would like to express my concern about", "Я хотел бы выразить свою озабоченность по поводу"));
        wordsList.add(new PhraseItem("To express", "Выражать"));
        wordsList.add(new PhraseItem("Concern", "Беспокойство"));
        wordsList.add(new PhraseItem("I’m just writing to let you know that", "Я просто пишу, чтобы вы знали, что"));
        wordsList.add(new PhraseItem("It’s been a long time since we saw each other", "Мы давно не виделись"));
        wordsList.add(new PhraseItem("Apologies for not writing for so long, but I’ve been really busy", "Прошу прощения за то, что так долго не писал, но я был очень занят"));
        wordsList.add(new PhraseItem("Apologies for", "Приношу свои извинения за"));
        wordsList.add(new PhraseItem("I would be grateful if you could", "Я был бы вам очень признателен, если бы вы могли"));
        wordsList.add(new PhraseItem("Grateful", "Благодарный"));
        wordsList.add(new PhraseItem("I would be grateful if you could inform me", "Я был бы признателен, если бы вы могли сообщить мне"));
        wordsList.add(new PhraseItem("Could you please tell me if", "Не могли бы вы сказать мне, если"));
        wordsList.add(new PhraseItem("I wonder if you could tell me", "Не могли бы вы сказать"));
        wordsList.add(new PhraseItem("Wonder", "Интересоваться, желать знать"));
        wordsList.add(new PhraseItem("I would like you to", "Я хочу, чтобы ты"));
        wordsList.add(new PhraseItem("I need to ask your advice about", "Мне нужно спросить вашего совета о"));
        wordsList.add(new PhraseItem("I’m writing to express my dissatisfaction about", "Я пишу, чтобы выразить свое недовольство по поводу"));
        wordsList.add(new PhraseItem("I’m grateful for", "Я благодарен за"));
        wordsList.add(new PhraseItem("Thank you for your attention", "Спасибо за внимание"));
        wordsList.add(new PhraseItem("I hope the situation will be resolved soon", "Надеюсь, что ситуация скоро разрешится"));
        wordsList.add(new PhraseItem("I look forward to hearing from you", "С нетерпением жду Вашего ответа"));
        wordsList.add(new PhraseItem("If you require any further information", "Если вам нужна дополнительная информация"));
        wordsList.add(new PhraseItem("Please do not hesitate to contact me", "Пожалуйста, не стесняйтесь обращаться ко мне"));
        wordsList.add(new PhraseItem("Keep in touch", "Поддерживать связь"));
        wordsList.add(new PhraseItem("If you need to know anything else", "Если вам нужно что-то еще узнать"));
        wordsList.add(new PhraseItem("Just get in touch with me as soon as you can", "Просто свяжитесь со мной, как только сможете"));
        wordsList.add(new PhraseItem("Curriculum vitae", "Биография, резюме"));
        verticalLayout.addAndExpand(createPhraseTable(wordsList));
        add(verticalLayout);
    }
}
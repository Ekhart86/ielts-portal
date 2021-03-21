package ru.ekhart86.views.ieltswords;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;
import ru.ekhart86.views.vocabulary.WordItem;

import java.util.ArrayList;
import java.util.List;

@Route("start-word-for-ielts")
public class StartWordForIELTS extends Div implements ComponentFactory {

    public StartWordForIELTS() {
        add(createHeaderContentBackToThemes("pattern-for-ielts", "Вступительные слова для IELTS"));
        VerticalLayout verticalLayout = new VerticalLayout();
        List<WordItem> wordsList = new ArrayList<>();
        wordsList.add(new WordItem("To begin with", "Начать с", "[tuː bɪˈgɪn wɪð]"));
        wordsList.add(new WordItem("First of all", "В первую очередь", "[fɜːst ɒv ɔːl]"));
        wordsList.add(new WordItem("I’d like to start with", "Я хотел бы начать с", "[aɪd laɪk tuː stɑːt wɪð]"));
        wordsList.add(new WordItem("I gonna tell you about", "Я расскажу вам о", "[aɪ ˈɡɒnə tel ju əˈbaʊt]"));
        wordsList.add(new WordItem("The point I gonna talk about ", "То, о чем я собираюсь поговорить", "[ðə pɔɪnt aɪ ˈɡɒnə tɔːk əˈbaʊt]"));
        wordsList.add(new WordItem("Let me see", "Дайте подумать", "[let mɪ siː]"));
        wordsList.add(new WordItem("Let me think how I can put this",
                "Дайте подумать, как я могу это выразить это", "[let mɪ θɪŋk haʊ aɪ kən pʊt ðɪs]"));
        wordsList.add(new WordItem("That is a complex issue", "Это сложный вопрос", "[ðæt ɪz e ˈkɒmpleks ˈɪʃuː]"));
        wordsList.add(new WordItem("In my opinion", "По моему мнению", "[ɪn maɪ əˈpɪnjən]"));
        wordsList.add(new WordItem("Perhaps", "Возможно", "[pəˈhæps]"));
        wordsList.add(new WordItem("Probably", "Возможно", "[ˈprɒbəblɪ]"));
        wordsList.add(new WordItem("Possibly", "Возможно", "[ˈpɒsəblɪ]"));
        wordsList.add(new WordItem("Certainly", "Конечно", "[ˈsɜːtnlɪ]"));
        wordsList.add(new WordItem("The way I see it is that", "Я вижу это так", "[ðə weɪ aɪ siː ɪt ɪz ðæt]"));
        wordsList.add(new WordItem("When it comes to me, I believe that",
                "Что касается меня, я считаю, что", "[wen ɪt kʌmz tuː mɪ aɪ bɪˈliːv ðæt]"));
        wordsList.add(new WordItem("As a matter of fact", "Фактически", "[əz e ˈmætə əv fækt]"));
        wordsList.add(new WordItem("The key point is that", "Ключевым моментом является то, что", "[ðə kiː pɔɪnt ɪz ðæt]"));
        wordsList.add(new WordItem("I suppose that", "Я полагаю, что", "[aɪ səˈpəʊz ðæt]"));
        wordsList.add(new WordItem("I am sure that ", "Я уверен, что", "[aɪ æm ʃʊə ðæt]"));
        wordsList.add(new WordItem("I can only guess that", "Я могу только догадываться, что", "[aɪ kən ˈəʊnlɪ ges ðæt]"));
        wordsList.add(new WordItem("I tend to think that ", "Я склонен думать, что", "[aɪ tend tuː θɪŋk ðæt]"));
        wordsList.add(new WordItem("In fact", "B действительности", "[ɪn fæk]"));
        wordsList.add(new WordItem("If put it in another way", "Если выразиться по-другому", "[ɪf pʊt it in əˈnʌðə weɪ]"));
        wordsList.add(new WordItem("It’s on the tip of my tongue", "Это вертится на языке", "[its ɒn ðiː tɪp əv maɪ tʌŋ]"));
        wordsList.add(new WordItem("I am absolutely convinced that", "Я абсолютно убежден, что", "[aɪ æm ˈæbsəluːtlɪ kənˈvɪnst ðæt]"));
        verticalLayout.addAndExpand(createWordTable(wordsList));
        add(verticalLayout);
    }
}

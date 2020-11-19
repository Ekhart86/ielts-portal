package ru.ekhart86.views.vocabulary;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

import java.util.ArrayList;
import java.util.List;

@Route("art")
public class Art extends Div implements ComponentFactory {
    public Art() {
        add(createHeaderContentBackToThemes("vocabulary"));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header("Искусство"));
        List<WordItem> wordsList = new ArrayList<>();
        wordsList.add(new WordItem("To merit an entry fee", "Имеет плату за вход", "[tuː ˈmerɪt æn ˈentrɪ fiː]"));
        wordsList.add(new WordItem("fee", "взнос, платёж", "[fiː]"));
        wordsList.add(new WordItem("To marvel at modern masterworks", "Любоваться на современные шедевры", "[tuː ˈmɑːvəl æt mɒdn ˈmɑːstəwɜːk]"));
        wordsList.add(new WordItem("Adult admission fee", "Входной билет для взрослых", "[ˈædʌlt ədˈmɪʃ(ə)n fiː]"));
        wordsList.add(new WordItem("Admission", "Доступ, вход", "[ədˈmɪʃ(ə)n]"));
        wordsList.add(new WordItem("Museums focused on revenue", "Музеи ориентированные на прибыль", "[mjuːˈzɪəmz ˈfəʊkəst ɒn ˈrevənjuː]"));
        wordsList.add(new WordItem("Revenue", "Доход, выручка", "[ˈrevənjuː]"));
        wordsList.add(new WordItem("Still-life painting", "Натюрморт", "[stɪl-laɪf ˈpeɪntɪŋ]"));
        wordsList.add(new WordItem("Do not charge general admission", "не брать плату за вход", "[duː nɒt tʃɑːdʒ ˈdʒen(ə)r(ə)l ədˈmɪʃ(ə)n]"));
        wordsList.add(new WordItem("Private donations", "Частные взносы", "[ˈpraɪvət dəʊˈneɪʃənz]"));
        wordsList.add(new WordItem("Art connoisseur", "Знаток искусства", "[ɑːt ˌkɒnəˈsɜː]"));
        wordsList.add(new WordItem("Film composer", "Композитор фильма", "[fɪlm kəmˈpəʊzə]"));
        wordsList.add(new WordItem("Plenty of symphonic orchestras", "Большой симфонический ркестр", "[ˈplentɪ ɒv sɪmˈfɒnɪk ˈɔːkɪstrə]"));
        wordsList.add(new WordItem("Plenty", "Множество", "[ˈplentɪ]"));
        wordsList.add(new WordItem("Still recognizable to most people", "до сих пор узнаваемы для большинства людей", "[stɪl rekəɡˈnaɪzəbl tuː məʊst ˈpiːp(ə)l]"));
        wordsList.add(new WordItem("To expand musical horizons", "Расширять музыкальные горизонты", ""));
        wordsList.add(new WordItem("Live in harmony with the global patterns of life", "Жить в гармонии с общими правилами жизни", ""));
        wordsList.add(new WordItem("The importance of artistic freedom", "Важность свободы творчества", ""));
        wordsList.add(new WordItem("Freedom of expression", "Свобода самовыражения", ""));
        wordsList.add(new WordItem("Art mirrors the culture", "Искусство отражает культуру", ""));
        wordsList.add(new WordItem("Art can be troubling", "Искусство может быть проблемой", ""));
        wordsList.add(new WordItem("A matter of taste", "Дело вкуса", ""));
        wordsList.add(new WordItem("Censor exhibitions", "Цензорские выставки", ""));
        wordsList.add(new WordItem("State funding creates dependency", "Государственное финансирование создает зависимость", ""));
        wordsList.add(new WordItem("Suppression of artistic expression", "Подавление художественного самовыражения", ""));
        verticalLayout.addAndExpand(createWordTable(wordsList));
        add(verticalLayout);
    }
}





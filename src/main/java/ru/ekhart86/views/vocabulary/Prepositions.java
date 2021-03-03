package ru.ekhart86.views.vocabulary;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

import java.util.ArrayList;
import java.util.List;
@Route("prepositions")
public class Prepositions extends Div implements ComponentFactory {

    public Prepositions() {
        add(createHeaderContentBackToThemes("vocabulary", "Предлоги"));
        VerticalLayout verticalLayout = new VerticalLayout();
        List<PrepositionItem> wordsList = new ArrayList<>();
        wordsList.add(new PrepositionItem("Above", "над, выше", "Предлоги места","He lives above me"));
        wordsList.add(new PrepositionItem("Below", "под, ниже", "Предлоги места","There is a house below the bridge"));
        wordsList.add(new PrepositionItem("Before", "перед, у", "Предлоги места","He walked before me"));
        wordsList.add(new PrepositionItem("In front of", "перед, напротив", "Предлоги места","He parked in front of the building"));
        wordsList.add(new PrepositionItem("Behind", "за, позади", "Предлоги места","She stood behind me"));
        wordsList.add(new PrepositionItem("Under", "под", "Предлоги места","He hid under the table"));
        wordsList.add(new PrepositionItem("Over", "над (не прикасаясь к другому предмету)", "Предлоги места","A lamp hung over the table"));
        wordsList.add(new PrepositionItem("Between", "между", "Предлоги места","There is a bicycle between the two cars"));
        wordsList.add(new PrepositionItem("Among", "среди", "Предлоги места","There were two foreign women among the guests"));
        wordsList.add(new PrepositionItem("By", "у, рядом, около, возле (очень близко)", "Предлоги места","I saw him standing by the window"));
        wordsList.add(new PrepositionItem("Beside", "рядом (или сбоку от чего-либо)", "Предлоги места","The girl sat beside me"));
        wordsList.add(new PrepositionItem("Next to", "рядом, около, возле (между вами ничего нет)", "Предлоги места","They stood next to their car"));
        wordsList.add(new PrepositionItem("Outside", "снаружи", "Предлоги места","We waited outside"));
        wordsList.add(new PrepositionItem("At", "в (с определенной целью)", "Предлоги места","They are at the hospital"));
        wordsList.add(new PrepositionItem("In", "в (отвечает на вопрос - где?)", "Предлоги места","We put the books in a box"));
        wordsList.add(new PrepositionItem("On", "на (отвечает на вопрос - где?)", "Предлоги места","There is a book on the table"));
        wordsList.add(new PrepositionItem("Across", "через", "Предлоги направления","He was swimming across the river"));
        wordsList.add(new PrepositionItem("Along", "вдоль, по", "Предлоги направления","Go straight along this street"));
        wordsList.add(new PrepositionItem("Down", "вниз", "Предлоги направления","We skied down the slope"));
        wordsList.add(new PrepositionItem("Up", "вверх", "Предлоги направления","We are walking up the stairs"));
        wordsList.add(new PrepositionItem("Round/around", "вокруг", "Предлоги направления","They danced around a fir-tree"));
        wordsList.add(new PrepositionItem("Into", "в (отвечает на вопрос - куда?)", "Предлоги направления","She came into the building"));
        wordsList.add(new PrepositionItem("Within", "внутрь, внутри", "Предлоги направления","We could hear sounds coming from within his apartment"));
        wordsList.add(new PrepositionItem("Onto", "на (отвечает на вопрос - куда?)", "Предлоги направления","I put a box of matches onto the counter"));
        wordsList.add(new PrepositionItem("Out of", "из", "Предлоги направления","He went out of a restaurant"));
        wordsList.add(new PrepositionItem("Through", "сквозь, через", "Предлоги направления","We will walk through the forest"));
        wordsList.add(new PrepositionItem("To", "к (по направлению к чему-либо)", "Предлоги направления","They are going to the cinema"));
        wordsList.add(new PrepositionItem("For", "в течение (как долго продолжается действие)", "Предлоги времени","She was baking the cake for an hour"));
        wordsList.add(new PrepositionItem("During", "в течение, на протяжении (от начала до конца)", "Предлоги времени","They were studying during the night"));
        wordsList.add(new PrepositionItem("Since", "с тех пор", "Предлоги времени","He has known her since childhood"));
        wordsList.add(new PrepositionItem("By", "к (действие произойдет к определенному моменту)", "Предлоги времени","You have to send me the documents by Friday"));
        wordsList.add(new PrepositionItem("Until/till", "до (определенного времени, потом прекращается)", "Предлоги времени","Let's wait until Sunday"));
        wordsList.add(new PrepositionItem("From…to", "с…до… (от одного периода времени до другого)", "Предлоги времени","We work from nine to five"));
        wordsList.add(new PrepositionItem("Before", "до (раньше определенного действия)", "Предлоги времени","Read instructions before use"));
        wordsList.add(new PrepositionItem("After", "после", "Предлоги времени","You should rest after the exercise"));
        wordsList.add(new PrepositionItem("Over", "за, в течение (заниматься чем-то в течение времени)", "Предлоги времени","I am going to study English over my holidays"));
        wordsList.add(new PrepositionItem("Within", "в течение, в пределах, в рамках", "Предлоги времени","I will answer within three days"));
        wordsList.add(new PrepositionItem("Up to", "до (происходит до определенного периода)", "Предлоги времени","He has kept the secret up to now"));
        wordsList.add(new PrepositionItem("In", "в (месяц, время суток, год, время года)", "Предлоги времени","We met in 2001"));
        wordsList.add(new PrepositionItem("At", "в (час, определенный момент дня, выходной, праздник)", "Предлоги времени","She will come at 6 o’clock"));
        wordsList.add(new PrepositionItem("On", "в (даты, дни недели, специальные даты)", "Предлоги времени","He was born on October 9"));
        wordsList.add(new PrepositionItem("Because of", "Потому что, из-за", "Предлоги причины и цели","He was absent because of illness"));
        wordsList.add(new PrepositionItem("In accordance with", "В соответствии с, согласно", "Предлоги причины и цели","In accordance with the law I have prepared a contract"));
        wordsList.add(new PrepositionItem("On account of", "Вследствие, из-за", "Предлоги причины и цели","The bus was delayed on account of a snowfall"));
        wordsList.add(new PrepositionItem("Thanks to", "Благодаря", "Предлоги причины и цели","I found this apartment thanks to my friend"));
        wordsList.add(new PrepositionItem("Due to", "из-за, по причине (часто с негативным оттенком)", "Предлоги причины и цели","The plane was delayed due to a technical problem"));
        wordsList.add(new PrepositionItem("Through", "Благодаря, из-за", "Предлоги причины и цели","He failed his exams through not studying enough"));
        wordsList.add(new PrepositionItem("From", "По, из", "Предлоги причины и цели","I guessed from her accent that she is French"));
        wordsList.add(new PrepositionItem("Of", "От, из-за, по (Показывает причину, по которой произошло что-то)", "Предлоги причины и цели","He died of a heart attack"));
        wordsList.add(new PrepositionItem("For", "Для, за, из-за (делаем что-то для определенной цели)", "Предлоги причины и цели","I have bought him a cake for his birthday"));
        verticalLayout.addAndExpand(createPrepositionTable(wordsList));
        add(verticalLayout);
    }
}



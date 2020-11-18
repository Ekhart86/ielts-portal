package ru.ekhart86.views.vocabulary;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

import java.util.ArrayList;
import java.util.List;

@Route("idioms")
public class Idioms extends Div implements ComponentFactory {

    public Idioms() {
        add(createHeaderContentBackToThemes("vocabulary"));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header("Идиомы"));
        List<WordItem> wordsList = new ArrayList<>();
        wordsList.add(new WordItem("in the long run", "В долгосрочной перспективе", "[ɪn ðiː lɒŋ rʌn]"));
        wordsList.add(new WordItem("have mixed feelings about", "Испытываю смешанные чувства по поводу", "[hæv mɪkst ˈfiːlɪŋz əˈbaʊt]"));
        wordsList.add(new WordItem("a piece of cake", "пустяковое дело", "[eɪ piːs ɒv keɪk]"));
        wordsList.add(new WordItem("from scratch", "С нуля", "[frɒm skræʧ]"));
        wordsList.add(new WordItem("gut feeling", "Интуиция, инстинктивное чувство", "[gʌt ˈfiːlɪŋ]"));
        wordsList.add(new WordItem("all ears", "внимательно слушать", "[ɔːl ˈɪəz]"));
        wordsList.add(new WordItem("walls have ears", "у стен есть уши", "[wɔːlz hæv ɪəz]"));
        wordsList.add(new WordItem("every now and then", "время от времени", "[ˈevrɪ naʊ ənd ðen]"));
        wordsList.add(new WordItem("behind the times", "отставать от времени", "[bɪˈhaɪnd ðiː taɪmz]"));
        wordsList.add(new WordItem("out of the blue", "неожиданно", "[aʊt ɒv ðiː bluː]"));
        wordsList.add(new WordItem("it drives me up the wall", "это приводит меня в бешенство", "[ɪt draɪvz mɪ ʌp ðiː wɔːl]"));
        wordsList.add(new WordItem("hold water", "выдерживать критику, быть обоснованным", "[həʊld ˈwɔːtə]"));
        wordsList.add(new WordItem("pull the plug", "прекратить поддержку, отказаться", "[pʊl ðiː plʌg]"));
        wordsList.add(new WordItem("that's a fact of life", "что-то неприятное, чего нельзя избежать", "[ðæts e fækt ɒv laɪf]"));
        wordsList.add(new WordItem("high and low", "везде, повсюду", "[haɪ ænd ləʊ]"));
        wordsList.add(new WordItem("to die for", "что-либо превосходное, желанное", "[tuː daɪ fɔː]"));
        wordsList.add(new WordItem("like a bear with a sore head", "очень сердитый", "[laɪk e beə wɪð e sɔː hed]"));
        wordsList.add(new WordItem("pass the buck", "переложить ответственность", "[pɑːs ðiː bʌk]"));
        wordsList.add(new WordItem("to be at sea", "не знать что делать, быть в растерянности", "[tuː biː æt siː]"));
        wordsList.add(new WordItem("a backseat driver", "кто-либо, кто дает непрошенные советы", "[e ˈbækˈsit ˈdraɪvə]"));
        wordsList.add(new WordItem("in the driver's seat", "иметь контроль над ситуацией", "[ɪn ðiː draɪvz siːt]"));
        wordsList.add(new WordItem("miss the boat", "упустить шанс", "[mɪs ðiː bəʊt]"));
        wordsList.add(new WordItem("miss the bus", "упустить возможность", "[mɪs ðiː bʌs]"));
        wordsList.add(new WordItem("run a mile", "избежать чего-либо любой ценой", "[rʌn e maɪl]"));
        wordsList.add(new WordItem("once in a blue moon", "очень редко, почти никогда", "[wʌns ɪn e bluː muːn]"));
        wordsList.add(new WordItem("plain sailing", "очень легко, как по маслу", "[pleɪn ˈseɪlɪŋ]"));
        wordsList.add(new WordItem("to have green fingers", "быть хорошим садоводом", "[tuː hæv griːn ˈfɪŋɡəz]"));
        wordsList.add(new WordItem("as good as gold", "быть на вес золота", "[æz gʊd æz gəʊld]"));
        wordsList.add(new WordItem("have a heart of gold", "иметь золотой характер", "[hæv e hɑːt ɒv gəʊld]"));
        wordsList.add(new WordItem("twist arm", "выкручивать руки", "[twɪst ɑːm]"));
        wordsList.add(new WordItem("lose face", "потерять лицо", "[luːz feɪs]"));
        wordsList.add(new WordItem("bread and butter", "основной доход, заработок", "[bred ænd ˈbʌtə]"));
        wordsList.add(new WordItem("the icing on the cake", "последний штрих, вишенка на торте", "[ðiː ˈaɪsɪŋ ɒn ðiː keɪk]"));
        wordsList.add(new WordItem("grin like a cheshire cat", "ухмыляться, улыбаться во весь рот ", "[grɪn laɪk e ˈʧeʃə kæt]"));
        wordsList.add(new WordItem("like a fish out of water", "не в своей тарелке", "[laɪk e fɪʃ aʊt ɒv ˈwɔːtə]"));
        wordsList.add(new WordItem("on top of the world", "быть очень счастливым", "[ɒn tɒp ɒv ðiː wɜːld]"));
        wordsList.add(new WordItem("follow in foot steps", "пойти по стопам", "[ˈfɒləʊ ɪn fʊt steps]"));
        verticalLayout.addAndExpand(createWordTable(wordsList));
        add(verticalLayout);
    }
}

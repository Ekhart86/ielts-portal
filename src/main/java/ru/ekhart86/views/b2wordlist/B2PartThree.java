package ru.ekhart86.views.b2wordlist;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;
import ru.ekhart86.views.vocabulary.WordItem;

import java.util.ArrayList;
import java.util.List;
@Route("b2-part-3")
public class B2PartThree extends Div implements ComponentFactory {

    public B2PartThree() {
        add(createHeaderContentBackToThemes("b2-vocabulary", "B2 Часть 3"));
        VerticalLayout verticalLayout = new VerticalLayout();
        List<WordItem> wordsList = new ArrayList<>();
        wordsList.add(new WordItem("approve of", "одобрять", "[əˈpruːvɒv]"));
        wordsList.add(new WordItem("at first", "сначала", "[ætfɜːst]"));
        wordsList.add(new WordItem("occasion", "случай, событие", "[əˈkeɪʒən]"));
        wordsList.add(new WordItem("occasional", "случайный", "[əˈkeɪʒənl]"));
        wordsList.add(new WordItem("describe", "описать", "[dɪsˈkraɪb]"));
        wordsList.add(new WordItem("descriptive", "описательный", "[dɪsˈkrɪptɪv]"));
        wordsList.add(new WordItem("description", "описание", "[dɪsˈkrɪpʃən]"));
        wordsList.add(new WordItem("rope", "верёвка", "[rəʊp]"));
        wordsList.add(new WordItem("feature", "особенность, свойство, черта", "[ˈfiːʧə]"));
        wordsList.add(new WordItem("featured", "напоминающий, похожий", "[ˈfiːʧəd]"));
        wordsList.add(new WordItem("by far", "безусловно", "[baɪfɑː]"));
        wordsList.add(new WordItem("drum", "барабан, барабанить", "[drʌm]"));
        wordsList.add(new WordItem("drummer", "барабанщик", "[ˈdrʌmə]"));
        wordsList.add(new WordItem("emit", "испускать, издавать, излучать", "[ɪˈmɪt]"));
        wordsList.add(new WordItem("emission", "излучение", "[ɪˈmɪʃən]"));
        wordsList.add(new WordItem("indeed", "действительно, в самом деле", "[ɪnˈdiːd]"));
        wordsList.add(new WordItem("table", "таблица", "[ˈteɪbl]"));
        wordsList.add(new WordItem("hostile", "враждебный, неприязненный", "[ˈhɒstaɪl]"));
        wordsList.add(new WordItem("hostility", "враждебность", "[hɒsˈtɪlɪti]"));
        wordsList.add(new WordItem("option", "выбор, вариант", "[ˈɒpʃən]"));
        wordsList.add(new WordItem("optional", "необязательный", "[ˈɒpʃənl]"));
        wordsList.add(new WordItem("significant", "значительный", "[sɪgˈnɪfɪkənt]"));
        wordsList.add(new WordItem("significance", "значение", "[sɪgˈnɪfɪkəns]"));
        wordsList.add(new WordItem("insignificant", "незначительный", "[ˌɪnsɪgˈnɪfɪkənt]"));
        wordsList.add(new WordItem("make fun of", "смеятья над, высмеивать", "[meɪkfʌnəf]"));
        wordsList.add(new WordItem("chop", "рубить", "[ʧɒp]"));
        wordsList.add(new WordItem("general", "общий", "[ˈʤɛnərəl]"));
        wordsList.add(new WordItem("generalise", "обобщать", "[ˈʤɛnərəlaɪz]"));
        wordsList.add(new WordItem("generalisation", "обобщение", "[ˌʤɛnərəlaɪˈzeɪʃən]"));
        wordsList.add(new WordItem("awake", "проснуться, бодрствующий", "[əˈweɪk]"));
        wordsList.add(new WordItem("mere", "всего лишь", "[mɪə]"));
        wordsList.add(new WordItem("perform", "выполнить, исполнить", "[pəˈfɔːm]"));
        wordsList.add(new WordItem("performance", "представление, исполнение", "[pəˈfɔːməns]"));
        wordsList.add(new WordItem("lawn", "газон", "[lɔːn]"));
        wordsList.add(new WordItem("lawn-mower", "газонокосилка", "[ˈlɔːnˌməʊə]"));
        wordsList.add(new WordItem("gentle", "нежный, мягкий, ласковый", "[ˈʤɛntl]"));
        wordsList.add(new WordItem("beyond", "за, вне", "[вне, свыше]"));
        wordsList.add(new WordItem("hide", "прятать", "[haɪd]"));
        wordsList.add(new WordItem("hide away", "спрятать(ся)", "[haɪdəˈweɪ]"));
        wordsList.add(new WordItem("hide out", "скрываться", "[haɪd aʊt]"));
        wordsList.add(new WordItem("postpone", "откладывать,  отсрочить", "[pəʊstˈpəʊn]"));
        wordsList.add(new WordItem("postponement", "отсрочка, откладывание", "[pəʊstˈpəʊnmənt]"));
        wordsList.add(new WordItem("highlight", "выделить, подсветить", "[ˈhaɪˌlaɪt]"));
        wordsList.add(new WordItem("straight", "прямой, прямо", "[streɪt]"));
        wordsList.add(new WordItem("straighten", "выпрямлять", "[ˈstreɪtn]"));
        wordsList.add(new WordItem("deal", "сделка", "[diːl]"));
        wordsList.add(new WordItem("dealer", "торговец", "[ˈdiːlə]"));
        wordsList.add(new WordItem("delay", "задерживать(ся)", "[dɪˈleɪ]"));
        wordsList.add(new WordItem("nerd", "ботаник, зануда ", "[nɜːd]"));
        wordsList.add(new WordItem("fan", "вентилятор", "[fæn]"));
        wordsList.add(new WordItem("debt", "долг", "[dɛt]"));
        wordsList.add(new WordItem("debtor", "должник", "[ˈdɛtə]"));
        wordsList.add(new WordItem("submit", "представить, подавать информацию", "[səbˈmɪt]"));
        wordsList.add(new WordItem("raise", "растить (детей), поднимать", "[reɪz]"));
        wordsList.add(new WordItem("start up", "стартовать, начинать", "[stɑːtʌp]"));
        wordsList.add(new WordItem("below", "ниже, под", "[bɪˈləʊ]"));
        wordsList.add(new WordItem("climb", "взбираться", "[klaɪm]"));
        wordsList.add(new WordItem("crash", "горохот, крушение, разбивать", "[kræʃ]"));
        wordsList.add(new WordItem("consist of", "состоять (из)", "[kənˈsɪstɒv]"));
        wordsList.add(new WordItem("touch", "связь, контакт, касаться", "[tʌʧ]"));
        wordsList.add(new WordItem("in touch", "на связи ", "[ɪntʌʧ]"));
        wordsList.add(new WordItem("gene", "ген", "[ʤiːn]"));
        wordsList.add(new WordItem("neighbour", "сосед", "[ˈneɪbə]"));
        wordsList.add(new WordItem("neighborhood", "окрестности, район", "[ˈneɪbəhʊd]"));
        wordsList.add(new WordItem("neighbouring", "близлежащий, соседний", "[ˈneɪbərɪŋ]"));
        wordsList.add(new WordItem("tender", "нежный, ласковый", "[ˈtɛndə]"));
        wordsList.add(new WordItem("tenderness", "нежность", "[ˈtɛndənɪs]"));
        wordsList.add(new WordItem("tell apart", "различать", "[tɛləˈpɑːt]"));
        wordsList.add(new WordItem("follow", "следовать, следить", "[ˈfɒləʊ]"));
        wordsList.add(new WordItem("following", "следующий", "[ˈfɒləʊɪŋ]"));
        wordsList.add(new WordItem("as follows", "следующим образом", "[æzˈfɒləʊz]"));
        wordsList.add(new WordItem("follower", "последователь", "[ˈfɒləʊə]"));
        wordsList.add(new WordItem("grocery", "продуктовый", "[ˈgrəʊsəri]"));
        wordsList.add(new WordItem("consult", "советоваться", "[kənˈsʌlt]"));
        wordsList.add(new WordItem("vague", "смутный", "[veɪg]"));
        wordsList.add(new WordItem("vagueness", "неопределенность", "[ˈveɪgnəs]"));
        wordsList.add(new WordItem("jury", "жюри или присяжные", "[ˈʤʊəri]"));
        wordsList.add(new WordItem("juror", "присяжный", "[ˈʤʊərə]"));
        wordsList.add(new WordItem("announce", "объявлять", "[əˈnaʊns]"));
        wordsList.add(new WordItem("announcement", "объявление", "[əˈnaʊnsmənt]"));
        wordsList.add(new WordItem("bring back", "вернуть", "[brɪŋbæk]"));
        wordsList.add(new WordItem("give back", "отдать", "[gɪvbæk]"));
        wordsList.add(new WordItem("take back", "забрать", "[teɪkbæk]"));
        wordsList.add(new WordItem("stick", "палка, втыкать", "[stɪk]"));
        wordsList.add(new WordItem("as though ", "как будто", "[æzðəʊ]"));
        wordsList.add(new WordItem("court", "суд", "[kɔːt]"));
        wordsList.add(new WordItem("courtroom", "зал суда", "[ˈkɔːtrʊm]"));
        wordsList.add(new WordItem("courthouse", "здание суда", "[ˈkɔːtˈhaʊs]"));
        wordsList.add(new WordItem("tear", "рвать", "[teə]"));
        wordsList.add(new WordItem("tear apart", "раздирать", "[teərəˈpɑːt]"));
        wordsList.add(new WordItem("watch", "часы (наручные) ", "[wɒʧ]"));
        wordsList.add(new WordItem("seek", "искать, стремиться", "[siːk]"));
        wordsList.add(new WordItem("naked", "голый", "[ˈneɪkɪd]"));
        wordsList.add(new WordItem("nakedness", "нагота", "[ˈneɪkɪdnəs]"));
        wordsList.add(new WordItem("strain", "напрягать, напряжение", "[streɪn]"));
        wordsList.add(new WordItem("wear", "надевать, носить", "[weə]"));
        wordsList.add(new WordItem("blast", "порыв ветра, взрыв, взрывать", "[blɑːst]"));
        wordsList.add(new WordItem("grain", "зерно, крупица", "[greɪn]"));
        wordsList.add(new WordItem("drop out of", "бросить (учёбу), выпадать из", "[drɒpaʊtɒv]"));
        wordsList.add(new WordItem("dropout", "выбывший, исключённый, недоучка", "[ˈdrɒpaʊt]"));
        wordsList.add(new WordItem("fireplace", "камин", "[ˈfaɪəˌpleɪs]"));
        wordsList.add(new WordItem("quantity", "количество", "[ˈkwɒntɪti]"));
        wordsList.add(new WordItem("quantitative", "количественный", "[ˈkwɒntɪtətɪv]"));
        wordsList.add(new WordItem("crawl", "ползать", "[krɔːl]"));
        wordsList.add(new WordItem("bag", "сумка, мешок", "[bæg]"));
        wordsList.add(new WordItem("handbag", "лёгкий чемодан, дамская сумочка", "[ˈhændbæg]"));
        wordsList.add(new WordItem("baggy", "мешковатый", "[ˈbægi]"));
        wordsList.add(new WordItem("grave", "могила", "[greɪv]"));
        wordsList.add(new WordItem("graveyard", "кладбище (у церкви)", "[ˈgreɪvjɑːd]"));
        wordsList.add(new WordItem("make up", "выдумать", "[meɪkʌp]"));
        wordsList.add(new WordItem("think up", "придумать", "[θɪŋkʌp]"));
        wordsList.add(new WordItem("dream up", "выдумывать", "[driːmʌp]"));
        wordsList.add(new WordItem("practice", "практика, практиковать", "[ˈpræktɪs]"));
        wordsList.add(new WordItem("entitle", "давать название", "[ɪnˈtaɪtl]"));
        wordsList.add(new WordItem("pile", "куча, стопка", "[paɪl]"));
        wordsList.add(new WordItem("stockpile", "запас", "[ˈstɒkpaɪl]"));
        wordsList.add(new WordItem("surface", "поверхность", "[ˈsɜːfɪs]"));
        wordsList.add(new WordItem("duckling", "утёнок", "[ˈdʌklɪŋ]"));
        wordsList.add(new WordItem("conduct", "вести, сопровождать", "[ˈkɒndʌkt]"));
        wordsList.add(new WordItem("conductor", "проводник, кондуктор", "[kənˈdʌktə]"));
        wordsList.add(new WordItem("misconduct", "проступок", "[mɪsˈkɒndʌkt]"));
        wordsList.add(new WordItem("lawsuit", "судебный процесс", "[ˈlɔːsjuːt]"));
        wordsList.add(new WordItem("seize", "схватить", "[siːz]"));
        wordsList.add(new WordItem("seizure", "захват", "[ˈsiːʒə]"));
        wordsList.add(new WordItem("innocent", "невинный, невиновный", "[ˈɪnəsənt]"));
        wordsList.add(new WordItem("innocence", "невинность", "[ˈɪnəsəns]"));
        wordsList.add(new WordItem("curious", "любопытный, курьёзный", "[]"));
        wordsList.add(new WordItem("curiosity", "любопытство", "[ˌkjʊərɪˈɒsɪti]"));
        wordsList.add(new WordItem("well", "колодец", "[wɛl]"));
        wordsList.add(new WordItem("environment", "среда, окружение", "[ɪnˈvaɪərənmənt]"));
        wordsList.add(new WordItem("environmental", "экологическая", "[ɪnˌvaɪərənˈmɛntl]"));
        wordsList.add(new WordItem("clear", "ясный, чистый", "[klɪə]"));
        wordsList.add(new WordItem("clearer", "очиститель", "[ˈklɪərə]"));
        wordsList.add(new WordItem("unclear", "неясный", "[ʌnˈklɪə]"));
        wordsList.add(new WordItem("clearance", "зазор", "[ˈklɪərəns]"));
        wordsList.add(new WordItem("envelope", "конверт", "[ˈɛnvələʊp]"));
        wordsList.add(new WordItem("fill in", "заполнить", "[fɪlɪn]"));
        wordsList.add(new WordItem("fill out", "заполнять", "[fɪlaʊt]"));
        wordsList.add(new WordItem("see off", "провожать (в путь)", "[siːɒf]"));
        wordsList.add(new WordItem("see out", "проводить (до выхода)", "[siːaʊt]"));
        wordsList.add(new WordItem("credible", "заслуживающий доверия", "[ˈkrɛdəbl]"));
        wordsList.add(new WordItem("credibility", "доверие, авторитет", "[ˌkrədɪˈbɪlɪti]"));
        wordsList.add(new WordItem("respond", "отвечать", "[rɪsˈpɒnd]"));
        wordsList.add(new WordItem("respondent", "тот, кто отвечает", "[rɪsˈpɒndənt]"));
        wordsList.add(new WordItem("gain", "получать, выигрывать", "[geɪn]"));
        wordsList.add(new WordItem("anymore", "больше (не)", "[ˌɛniˈmɔː]"));
        wordsList.add(new WordItem("urgent", "срочный", "[ˈɜːʤənt]"));
        wordsList.add(new WordItem("urgency", "острая необходимость", "[ˈɜːʤənsi]"));
        wordsList.add(new WordItem("honey", "мёд", "[ˈhʌni]"));
        wordsList.add(new WordItem("match", "соответствие", "[mæʧ]"));
        wordsList.add(new WordItem("mismatch", "несоответствие", "[ˌmɪsˈmæʧ]"));
        wordsList.add(new WordItem("equip", "оснащать, снаряжать", "[ɪˈkwɪp]"));
        wordsList.add(new WordItem("equipment", "оборудование, снаряжение", "[ɪˈkwɪpmənt]"));
        wordsList.add(new WordItem("bump", "шишка, выпуклость ", "[bʌmp]"));
        wordsList.add(new WordItem("island", "остров", "[ˈaɪlənd]"));
        wordsList.add(new WordItem("hand over", "передать", "[hændˈəʊvə]"));
        wordsList.add(new WordItem("proper", "правильный, надлежащий", "[ˈprɒpə]"));
        wordsList.add(new WordItem("properly", "должным образом", "[ˈprɒpəli]"));
        wordsList.add(new WordItem("improper", "неподходящий", "[ɪmˈprɒpə]"));
        wordsList.add(new WordItem("enhance", "повысить, усилить, расширить", "[ɪnˈhɑːns]"));
        wordsList.add(new WordItem("enhancement", "усиление", "[ɪnˈhɑːnsmənt]"));
        wordsList.add(new WordItem("nuclear", "ядерный", "[ˈnjuːklɪə]"));
        wordsList.add(new WordItem("tournament", "турнир", "[ˈtʊənəmənt]"));
        wordsList.add(new WordItem("stem", "стебель", "[stɛm]"));
        wordsList.add(new WordItem("inner", "внутренний", "[ˈɪnə]"));
        wordsList.add(new WordItem("outer", "внешний", "[ˈaʊtə]"));
        wordsList.add(new WordItem("inspire", "вдохновить, внушить", "[ɪnˈspaɪə]"));
        wordsList.add(new WordItem("inspiration", "вдохновение", "[ˌɪnspəˈreɪʃən]"));
        wordsList.add(new WordItem("inspirational", "вдохновляющий", "[ˌɪnspəˈreɪʃən(ə)l]"));
        wordsList.add(new WordItem("spare", "жалеть, щадить, запасной", "[speə]"));
        wordsList.add(new WordItem("capable", "способный к чему-либо", "[ˈkeɪpəbl]"));
        wordsList.add(new WordItem("incapable", "неспособный", "[ɪnˈkeɪpəbl]"));
        wordsList.add(new WordItem("capability", "возможность", "[ˌkeɪpəˈbɪlɪti]"));
        wordsList.add(new WordItem("dry up", "пересохнуть, иссякнуть", "[draɪʌp]"));
        wordsList.add(new WordItem("brick", "кирпич", "[brɪk]"));
        wordsList.add(new WordItem("bricklayer", "каменщик", "[ˈbrɪkˌleɪə]"));
        wordsList.add(new WordItem("brickwork", "кирпичная кладка", "[ˈbrɪkwɜːk]"));
        wordsList.add(new WordItem("move", "переезжать", "[muːv]"));
        wordsList.add(new WordItem("garlic", "чеснок", "[ˈgɑːlɪk]"));
        wordsList.add(new WordItem("christmas", "рождество", "[ˈkrɪsməs]"));
        wordsList.add(new WordItem("trial", "испытание, пробный", "[ˈtraɪəl]"));
        wordsList.add(new WordItem("nightmare", "кошмар", "[ˈnaɪtmeə]"));
        wordsList.add(new WordItem("plant", "растение, сажать", "[plɑːnt]"));
        wordsList.add(new WordItem("planting", "посадка", "[ˈplɑːntɪŋ]"));
        wordsList.add(new WordItem("plantation", "насаждения, плантация", "[plænˈteɪʃən]"));
        wordsList.add(new WordItem("resolute", "решительный, твёрдый", "[ˈrɛzəluːt]"));
        wordsList.add(new WordItem("resolution", "решение, решимость", "[ˌrɛzəˈluːʃən]"));
        wordsList.add(new WordItem("victim", "жертва", "[ˈvɪktɪm]"));
        wordsList.add(new WordItem("victimize", "делать своей жертвой", "[ˈvɪktɪmaɪz]"));
        wordsList.add(new WordItem("appeal", "обращаться с призывом, взывать ", "[əˈpiːl]"));
        wordsList.add(new WordItem("appealing", "привлекательный, трогательный", "[əˈpiːlɪŋ]"));
        wordsList.add(new WordItem("barely", "едва, еле-еле", "[ˈbeəli]"));
        wordsList.add(new WordItem("issue", "издать, выпустить, проблема", "[ˈɪʃuː]"));
        wordsList.add(new WordItem("per", "(кол-во) на (единицу)", "[pɜː]"));
        wordsList.add(new WordItem("alter", "изменять", "[ˈɔːltə]"));
        verticalLayout.addAndExpand(createWordTable(wordsList));
        add(verticalLayout);
    }
}

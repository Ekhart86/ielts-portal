package ru.ekhart86.views.b2wordlist;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;
import ru.ekhart86.views.vocabulary.WordItem;

import java.util.ArrayList;
import java.util.List;
@Route("b2-part-1")
public class B2PartOne  extends Div implements ComponentFactory {

    public B2PartOne() {
        add(createHeaderContentBackToThemes("b2-vocabulary", "B2 Часть 1"));
        VerticalLayout verticalLayout = new VerticalLayout();
        List<WordItem> wordsList = new ArrayList<>();
        wordsList.add(new WordItem("arouse", "вызывать, пробуждать", "[əˈraʊz]"));
        wordsList.add(new WordItem("pretty", "довольно-таки", "[ˈprɪti]"));
        wordsList.add(new WordItem("grand", "большой, великий", "[grænd]"));
        wordsList.add(new WordItem("volume", "громкость", "[ˈvɒljʊm]"));
        wordsList.add(new WordItem("draw", "тянуть, рисовать", "[drɔː]"));
        wordsList.add(new WordItem("coach", "автобус, вагон, телега", "[kəʊʧ]"));
        wordsList.add(new WordItem("provide", "обеспечивать, снабжать", "[prəˈvaɪd]"));
        wordsList.add(new WordItem("provider", "поставщик", "[prəˈvaɪdə]"));
        wordsList.add(new WordItem("provision", "обеспечение", "[prəˈvɪʒən]"));
        wordsList.add(new WordItem("cope with", "совладать, справиться", "[kəʊpwɪð]"));
        wordsList.add(new WordItem("condition", "состояние", "[kənˈdɪʃən]"));
        wordsList.add(new WordItem("land", "приземляться, высаживаться", "[lænd]"));
        wordsList.add(new WordItem("scope", "пределы, район", "[skəʊp]"));
        wordsList.add(new WordItem("pack", "пачка, связка, колода", "[pæk]"));
        wordsList.add(new WordItem("package", "пакет", "[ˈpækɪʤ]"));
        wordsList.add(new WordItem("craft", "ремесло, мастерство", "[krɑːft]"));
        wordsList.add(new WordItem("craftsman", "ремесленник", "[ˈkrɑːftsmən]"));
        wordsList.add(new WordItem("crafty", "ловкий, хитрый", "[ˈkrɑːfti]"));
        wordsList.add(new WordItem("worth", "стоимость, стоящий", "[wɜːθ]"));
        wordsList.add(new WordItem("worthy", "достойный", "[ˈwɜːði]"));
        wordsList.add(new WordItem("urban", "городской", "[ˈɜːbən]"));
        wordsList.add(new WordItem("urbanization", "урбанизация", "[ˌɜːb(ə)naɪˈzeɪʃ(ə)n]"));
        wordsList.add(new WordItem("pond", "пруд", "[pɒnd]"));
        wordsList.add(new WordItem("familiar", "знакомый", "[fəˈmɪliə]"));
        wordsList.add(new WordItem("familiarity", "знакомство", "[fəˌmɪlɪˈærɪti]"));
        wordsList.add(new WordItem("unfamiliar", "незнакомый", "[ˌʌnfəˈmɪliə]"));
        wordsList.add(new WordItem("familiarize", "ознакомиться", "[fəˈmɪliəraɪz]"));
        wordsList.add(new WordItem("tap", "стучать, нажимать", "[tæp]"));
        wordsList.add(new WordItem("column", "столб, колонна", "[ˈkɒləm]"));
        wordsList.add(new WordItem("guilt", "вина", "[gɪlt]"));
        wordsList.add(new WordItem("guilty", "виновный", "[ˈgɪlti]"));
        wordsList.add(new WordItem("arm", "рука", "[ɑːm]"));
        wordsList.add(new WordItem("forearm", "предплечье", "[ˈfɔːrɑːm]"));
        wordsList.add(new WordItem("chamber", "кабинет, зал, палата, камера", "[ˈʧeɪmbə]"));
        wordsList.add(new WordItem("owe", "задолжать", "[əʊ]"));
        wordsList.add(new WordItem("owing", "обязанный, должный", "[ˈəʊɪŋ]"));
        wordsList.add(new WordItem("include", "включать, содержать в себе", "[ɪnˈkluːd]"));
        wordsList.add(new WordItem("inclusion", "включение", "[ɪnˈkluːʒən]"));
        wordsList.add(new WordItem("inclusive", "включающий в себя", "[ɪnˈkluːsɪv]"));
        wordsList.add(new WordItem("inclusively", "включительно", "[ɪnˈkluːsɪvli]"));
        wordsList.add(new WordItem("appoint", "назначать, утверждать", "[əˈpɔɪnt]"));
        wordsList.add(new WordItem("appointment", "назначение на должность, деловая встреча", "[əˈpɔɪntmənt]"));
        wordsList.add(new WordItem("celebrate", "праздновать", "[ˈsɛlɪbreɪt]"));
        wordsList.add(new WordItem("celebration", "праздник", "[ˌsɛlɪˈbreɪʃən]"));
        wordsList.add(new WordItem("celebratory", "праздничный", "[celebratory]"));
        wordsList.add(new WordItem("abuse", "оскорблять, бранить, брань", "[əˈbjuːs]"));
        wordsList.add(new WordItem("abusive", "оскорбительный", "[əˈbjuːsɪv]"));
        wordsList.add(new WordItem("dig", "копать", "[dɪg]"));
        wordsList.add(new WordItem("behavior", "поведение", "[bɪˈheɪvjə]"));
        wordsList.add(new WordItem("cable", "канат, кабель, трос", "[ˈkeɪbl]"));
        wordsList.add(new WordItem("intelligent", "умный", "[ɪnˈtɛlɪʤənt]"));
        wordsList.add(new WordItem("intelligence", "интеллект", "[ɪnˈtɛlɪʤəns]"));
        wordsList.add(new WordItem("admit", "признавать, допускать", "[ədˈmɪt]"));
        wordsList.add(new WordItem("admission", "допущение, допуск", "[ədˈmɪʃ(ə)n]"));
        wordsList.add(new WordItem("admittedly", "по общему признанию", "[ədˈmɪtɪdli]"));
        wordsList.add(new WordItem("cream", "крем, сливки", "[kriːm]"));
        wordsList.add(new WordItem("creamy", "сливочный", "[ˈkriːmi]"));
        wordsList.add(new WordItem("ice cream", "мороженое", "[aɪskriːm]"));
        wordsList.add(new WordItem("appropriate", "присвоить", "[əˈprəʊprɪɪt]"));
        wordsList.add(new WordItem("appropriation", "присвоение", "[əˌprəʊprɪˈeɪʃ(ə)n]"));
        wordsList.add(new WordItem("root", "корень", "[ruːt]"));
        wordsList.add(new WordItem("compare", "сравнивать", "[kəmˈpeə]"));
        wordsList.add(new WordItem("comparable", "сравнимый", "[ˈkɒmpərəbl]"));
        wordsList.add(new WordItem("comparative", "сравнительный", "[kəmˈpærətɪv]"));
        wordsList.add(new WordItem("comparatively", "в сравнении", "[kəmˈpærətɪvli]"));
        wordsList.add(new WordItem("human", "человек, человеческий", "[ˈhjuːmən]"));
        wordsList.add(new WordItem("inhuman", "бесчеловечный", "[ɪnˈhjuːmən]"));
        wordsList.add(new WordItem("humanity", "человечество", "[hju(ː)ˈmænɪti]"));
        wordsList.add(new WordItem("slay", "убивать", "[sleɪ]"));
        wordsList.add(new WordItem("persist", "сохраняться", "[pəˈsɪst]"));
        wordsList.add(new WordItem("persistent", "стойкий, устойчивый", "[pəˈsɪstənt]"));
        wordsList.add(new WordItem("persistence", "упорство", "[pəˈsɪstəns]"));
        wordsList.add(new WordItem("wide", "широкий, просторный", "[waɪd]"));
        wordsList.add(new WordItem("widen", "расширять", "[ˈwaɪdn]"));
        wordsList.add(new WordItem("width", "ширина", "[wɪdθ]"));
        wordsList.add(new WordItem("quarter", "четверть", "[ˈkwɔːtə]"));
        wordsList.add(new WordItem("vanish", "исчезнуть", "[ˈvænɪʃ]"));
        wordsList.add(new WordItem("stir", "шевелить, двигать", "[stɜː]"));
        wordsList.add(new WordItem("opening", "отверстие", "[ˈəʊpnɪŋ]"));
        wordsList.add(new WordItem("library", "библиотека", "[ˈlaɪbrəri]"));
        wordsList.add(new WordItem("librarian", "библиотекарь", "[laɪˈbreərɪən]"));
        wordsList.add(new WordItem("link", "связь, звено, ссылка", "[lɪŋk]"));
        wordsList.add(new WordItem("linkage", "связывание", "[ˈlɪŋkɪʤ]"));
        wordsList.add(new WordItem("expose", "выставлять, обнажать", "[ɪksˈpəʊz]"));
        wordsList.add(new WordItem("exposition", "выставка, выставление", "[ˌɛkspəʊˈzɪʃən]"));
        wordsList.add(new WordItem("dig up", "откопать", "[dɪgʌp]"));
        wordsList.add(new WordItem("narrate", "повествовать, рассказывать", "[nəˈreɪt]"));
        wordsList.add(new WordItem("narrative", "рассказ, повествовательный", "[ˈnærətɪv]"));
        wordsList.add(new WordItem("narration", "пересказ", "[nəˈreɪʃən]"));
        wordsList.add(new WordItem("enable", "давать возможность", "[ɪˈneɪbl]"));
        wordsList.add(new WordItem("laugh", "смеяться", "[lɑːf]"));
        wordsList.add(new WordItem("example", "пример", "[ɪgˈzɑːmpl]"));
        wordsList.add(new WordItem("for example", "например", "[fɔːrɪgˈzɑːmpl]"));
        wordsList.add(new WordItem("stake", "стойка, кол, столб", "[steɪk]"));
        wordsList.add(new WordItem("decent", "приличный, достойный", "[ˈdiːsnt]"));
        wordsList.add(new WordItem("indecent", "неприличный", "[ɪnˈdiːsnt]"));
        wordsList.add(new WordItem("decency", "порядочность", "[ˈdiːsnsi]"));
        wordsList.add(new WordItem("indecency", "непорядочность, непристойность", "[ɪnˈdiːsnsi]"));
        wordsList.add(new WordItem("glove", "перчатка", "[glʌv]"));
        wordsList.add(new WordItem("cure", "лечить", "[kjʊə]"));
        wordsList.add(new WordItem("curable", "излечимый", "[ˈkjʊərəbl]"));
        wordsList.add(new WordItem("incurable", "неизлечимый", "[ɪnˈkjʊərəbl]"));
        wordsList.add(new WordItem("curative", "лечебный", "[ˈkjʊərətɪv]"));
        wordsList.add(new WordItem("avoid", "избегать", "[əˈvɔɪd]"));
        wordsList.add(new WordItem("avoidance", "уклонение", "[əˈvɔɪdəns]"));
        wordsList.add(new WordItem("think over", "обдумать", "[θɪŋkˈəʊvə]"));
        wordsList.add(new WordItem("think through", "взвесить", "[θɪŋkθruː]"));
        wordsList.add(new WordItem("emerge", "появляться", "[ɪˈmɜːʤ]"));
        wordsList.add(new WordItem("emergent", "возникающий", "[ɪˈmɜːʤənt]"));
        wordsList.add(new WordItem("emergence", "появление", "[ɪˈmɜːʤəns]"));
        wordsList.add(new WordItem("emergency", "чрезвычайная ситуация", "[ɪˈmɜːʤənsɪ]"));
        wordsList.add(new WordItem("take", "воспринимать", "[teɪk]"));
        wordsList.add(new WordItem("fisherman", "рыбак", "[ˈfɪʃəmən]"));
        wordsList.add(new WordItem("fishery", "рыболовство", "[ˈfɪʃəri]"));
        wordsList.add(new WordItem("conscious", "сознательный, сознающий", "[ˈkɒnʃəs]"));
        wordsList.add(new WordItem("unconscious", "без сознания", "[ʌnˈkɒnʃəs]"));
        wordsList.add(new WordItem("consciousness", "сознание", "[ˈkɒnʃəsnɪs]"));
        wordsList.add(new WordItem("subconscious", "подсознательный", "[ˌsʌbˈkɒnʃəs]"));
        wordsList.add(new WordItem("subconsciousness", "подсознание", "[ˌsʌbˈkɒnʃəsnəs]"));
        wordsList.add(new WordItem("detect", "обнаружить, выявить", "[dɪˈtɛkt]"));
        wordsList.add(new WordItem("anywhere", "где угодно, куда угодно", "[ˈɛnɪweə]"));
        wordsList.add(new WordItem("anyhow", "как угодно", "[ˈɛnɪhaʊ]"));
        wordsList.add(new WordItem("dare", "осмелиться", "[deə]"));
        wordsList.add(new WordItem("anger", "гнев", "[ˈæŋgə]"));
        wordsList.add(new WordItem("stuff", "вещь", "[stʌf]"));
        wordsList.add(new WordItem("fortunate", "удачный", "[ˈfɔːʧnɪt]"));
        wordsList.add(new WordItem("fortunately", "к счастью", "[ˈfɔːʧnɪtli]"));
        wordsList.add(new WordItem("unfortunately", "к сожалению", "[ʌnˈfɔːʧnɪtli]"));
        wordsList.add(new WordItem("unfortunate", "несчастный", "[ʌnˈfɔːʧnɪt]"));
        wordsList.add(new WordItem("wilderness", "глушь, дикая местность", "[ˈwɪldənɪs]"));
        wordsList.add(new WordItem("shut out", "не впускать", "[ʃʌtaʊt]"));
        wordsList.add(new WordItem("shut in", "не выпускать", "[ʃʌtɪn]"));
        wordsList.add(new WordItem("noise", "шум", "[nɔɪz]"));
        wordsList.add(new WordItem("noisy", "шумный", "[ˈnɔɪzi]"));
        wordsList.add(new WordItem("noiseless", "бесшумный", "[ˈnɔɪzlɪs]"));
        wordsList.add(new WordItem("fat", "жир, жирный", "[fæt]"));
        wordsList.add(new WordItem("fatness", "упитанность", "[ˈfætnəs]"));
        wordsList.add(new WordItem("fatten", "откармливать", "[ˈfætn]"));
        wordsList.add(new WordItem("fail", "потерпеть неудачу", "[feɪl]"));
        wordsList.add(new WordItem("steady", "устойчивый", "[ˈstɛdi]"));
        wordsList.add(new WordItem("steadiness", "устойчивость", "[ˈstɛdɪnəs]"));
        wordsList.add(new WordItem("unsteady", "неустойчивый", "[ʌnˈstɛdi]"));
        wordsList.add(new WordItem("loss", "потеря", "[lɒs]"));
        wordsList.add(new WordItem("path", "путь", "[pɑːθ]"));
        wordsList.add(new WordItem("pathway", "путь", "[ˈpɑːθweɪ]"));
        wordsList.add(new WordItem("upside down", "вверх ногами", "[ˈʌpsaɪddaʊn]"));
        wordsList.add(new WordItem("cozy", "уютный", "[ˈkəʊzi]"));
        wordsList.add(new WordItem("depict", "изображать, описывать", "[dɪˈpɪkt]"));
        wordsList.add(new WordItem("depiction", "описание", "[dɪˈpɪkʃ(ə)n]"));
        wordsList.add(new WordItem("room", "комната, место, пространство", "[ruːm]"));
        wordsList.add(new WordItem("roomy", "вместительный", "[ˈruːmi]"));
        wordsList.add(new WordItem("lens", "линза, объектив", "[lɛnz]"));
        wordsList.add(new WordItem("tail", "хвост", "[teɪl]"));
        wordsList.add(new WordItem("tails", "обрезки, отходы", "[teɪlz]"));
        wordsList.add(new WordItem("tailed", "хвостатый", "[teɪld]"));
        wordsList.add(new WordItem("can", "жестяная банка", "[kæn]"));
        wordsList.add(new WordItem("canned", "консервированный", "[kænd]"));
        wordsList.add(new WordItem("flour", "мука", "[ˈflaʊə]"));
        wordsList.add(new WordItem("magazine", "журнал", "[ˌmægəˈziːn]"));
        wordsList.add(new WordItem("tense", "напряжённый, напрягать", "[tɛns]"));
        wordsList.add(new WordItem("tension", "напряженность", "[ˈtɛnʃən]"));
        wordsList.add(new WordItem("way", "путь, способ", "[weɪ]"));
        wordsList.add(new WordItem("split", "раскалывать, распадаться", "[splɪt]"));
        wordsList.add(new WordItem("ring", "звонить, звонок", "[rɪŋ]"));
        wordsList.add(new WordItem("thumb", "большой палец", "[θʌm]"));
        wordsList.add(new WordItem("boundary", "граница, черта", "[ˈbaʊndəri]"));
        wordsList.add(new WordItem("wage", "заработок, оплата", "[weɪʤ]"));
        wordsList.add(new WordItem("point", "смысл, суть", "[pɔɪnt]"));
        wordsList.add(new WordItem("pointless", "бессмысленный", "[ˈpɒntlɪs]"));
        wordsList.add(new WordItem("favor", "благоприятствовать", "[ˈfeɪvə]"));
        wordsList.add(new WordItem("favourite", "любимый", "[ˈfeɪvərɪt]"));
        wordsList.add(new WordItem("favorable", "благоприятный", "[ˈfeɪvərəbl]"));
        wordsList.add(new WordItem("unfavorable", "неблагоприятный", "[ʌnˈfeɪvərəbl]"));
        wordsList.add(new WordItem("chef", "шеф-повар", "[ʃɛf]"));
        wordsList.add(new WordItem("considerable", "крупный, значительный", "[kənˈsɪdərəbl]"));
        wordsList.add(new WordItem("inconsiderable", "незначительный", "[ˌɪnkənˈsɪdərəbl]"));
        wordsList.add(new WordItem("multiple", "множественный", "[ˈmʌltɪpl]"));
        wordsList.add(new WordItem("lessen", "уменьшать", "[ˈlɛsn]"));
        wordsList.add(new WordItem("landmark", "ориентир", "[ˈlændmɑːk]"));
        wordsList.add(new WordItem("solid", "сплошной", "[ˈsɒlɪd]"));
        wordsList.add(new WordItem("herb", "трава", "[hɜːb]"));
        wordsList.add(new WordItem("herbal", "травяной", "[ˈhɜːbəl]"));
        wordsList.add(new WordItem("topic", "тема, предмет обсуждения", "[ˈtɒpɪk]"));
        wordsList.add(new WordItem("topical", "актуальный, тематический", "[ˈtɒpɪkəl]"));
        wordsList.add(new WordItem("hurt", "причинять боль или болеть", "[hɜːt]"));
        wordsList.add(new WordItem("affiliate", "филиал, отделение, мл. партнёр", "[əˈfɪlɪeɪt]"));
        wordsList.add(new WordItem("affiliated", "аффилированный", "[əˈfɪlɪeɪtɪd]"));
        wordsList.add(new WordItem("affiliation", "присоединение", "[əˌfɪlɪˈeɪʃ(ə)n]"));
        wordsList.add(new WordItem("anxiety", "беспокойство, тревога", "[æŋˈzaɪəti]"));
        wordsList.add(new WordItem("wave", "волна", "[weɪv]"));
        wordsList.add(new WordItem("long ago", "давно", "[lɒŋəˈgəʊ]"));
        wordsList.add(new WordItem("space", "пространство", "[speɪs]"));
        wordsList.add(new WordItem("spacious", "просторный", "[ˈspeɪʃəs]"));
        wordsList.add(new WordItem("spatial", "пространственный", "[ˈspeɪʃəl]"));
        verticalLayout.addAndExpand(createWordTable(wordsList));
        add(verticalLayout);
    }
}
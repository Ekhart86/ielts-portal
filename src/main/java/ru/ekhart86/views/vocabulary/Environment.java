package ru.ekhart86.views.vocabulary;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

import java.util.ArrayList;
import java.util.List;

@Route("environment")
public class Environment extends Div implements ComponentFactory {
    public Environment() {
        add(createHeaderContentBackToThemes("vocabulary", "Окружающая среда"));
        VerticalLayout verticalLayout = new VerticalLayout();
        List<PhraseItem> wordsList = new ArrayList<>();
        wordsList.add(new PhraseItem("to reduce carbon dioxide emissions", "снизить выбросы углекислого газа"));
        wordsList.add(new PhraseItem("to cut greenhouse-gas emissions", "сократить выбросы парниковых газов"));
        wordsList.add(new PhraseItem("the greenhouse effect", "парниковый эффект"));
        wordsList.add(new PhraseItem("heat-trapping gases", "газы, удерживающие тепло"));
        wordsList.add(new PhraseItem("to combat climate change", "побороть климатические изменения"));
        wordsList.add(new PhraseItem("irreversible climate change", "необратимые климатические изменения"));
        wordsList.add(new PhraseItem("natural disasters", "природные катастрофы"));
        wordsList.add(new PhraseItem("changing weather patterns", "меняющиеся погодные условия"));
        wordsList.add(new PhraseItem("environmental catastrophe", "экологическая катастрофа"));
        wordsList.add(new PhraseItem("impact on water supplies", "влияние на запасы воды"));
        wordsList.add(new PhraseItem("supplies", "запасы"));
        wordsList.add(new PhraseItem("low-lying coastal areas", "низко расположенные береговые зоны"));
        wordsList.add(new PhraseItem("vulnerable to rising sea levels", "подверженные влиянию увеличения уровня мирового океана"));
        wordsList.add(new PhraseItem("coastal surges", "резкий рост уровня моря"));
        wordsList.add(new PhraseItem("global warming dries out farmland", "глобальное потепление высушивает сельскохозяйственные поля"));
        wordsList.add(new PhraseItem("causes both floods and droughts", "причиняет как наводнения, так и засухи"));
        wordsList.add(new PhraseItem("melting glaciers", "тающие ледники"));
        wordsList.add(new PhraseItem("to spread malaria", "распространять малярию"));
        wordsList.add(new PhraseItem("searing heat", "экстремальная жара"));
        wordsList.add(new PhraseItem("widespread flooding", "наводнения широких территорий"));
        wordsList.add(new PhraseItem("climate change", "климатические изменения"));
        wordsList.add(new PhraseItem("is undermining the gains from intensive farming", "нивелируют выгоду от интенсивного земледелия"));
        wordsList.add(new PhraseItem("climate-change mitigation", "уменьшение климатических изменений"));
        wordsList.add(new PhraseItem("rich countries are responsible", "богатые страны ответственны"));
        wordsList.add(new PhraseItem("for twothirds of the carbon put into the atmosphere", "за две трети выбросов углерода в атмосферу"));
        wordsList.add(new PhraseItem("carbon capture and storage plants", "заводы по захвату и хранению углерода"));
        wordsList.add(new PhraseItem("to limit the amount of carbon dioxide", "ограничить количество углекислого газа"));
        wordsList.add(new PhraseItem("to prevent illegal logging", "предотвратить незаконную вырубку леса"));
        wordsList.add(new PhraseItem("to slow deforestation", "замедлить уничтожение лесов"));
        wordsList.add(new PhraseItem("to halt deforestation", "остановить уничтожение лесов"));
        wordsList.add(new PhraseItem("to fund sustainable farming", "финансировать экологичное сельское хозяйство"));
        wordsList.add(new PhraseItem("agriculture drives", "сельское хозяйство"));
        wordsList.add(new PhraseItem("around 80 percent of the planet's deforestation", "служит причиной 80% уничтожения лесов"));
        wordsList.add(new PhraseItem("adverse environmental effects", "неблагоприятное влияние на окружающую среду"));
        wordsList.add(new PhraseItem("tourism can cause the loss of biodiversity", "туризм может выступить причиной потери разнообразия видов"));
        wordsList.add(new PhraseItem("land and resources are strained by excessive use", "земля и ресурсы истощены от чрезмерного использования"));
        wordsList.add(new PhraseItem("impacts on vegetation, wildlife, mountain, marine and coastal environments", "влияние на растительность, диких животных, горы, моря и берега"));
        wordsList.add(new PhraseItem("tourists can bring in new species", "туристы могут привезти новые виды"));
        wordsList.add(new PhraseItem("can cause enormous disruption", "могут причинить огромные разрушения"));
        wordsList.add(new PhraseItem("destruction of ecosystems", "разрушения экосистем"));
        wordsList.add(new PhraseItem("emissions from jet aircraft", "выбросы от реактивных самолётов"));
        wordsList.add(new PhraseItem("air travel causes the destruction of ozone layer", "авиапутешествия причиняют разрушение озонового слоя"));
        wordsList.add(new PhraseItem("tourism is a significant contributor", "туризм вносит существенный вклад"));
        wordsList.add(new PhraseItem("to the increasing concentrations of greenhouse gases", "в увеличение концентраций парниковых газов"));
        wordsList.add(new PhraseItem("revenue from park-entrance fees", "прибыль от входных билетов в парки"));
        wordsList.add(new PhraseItem("to reduce carbon footprint", "снизить выбросы углекислого газа"));
        wordsList.add(new PhraseItem("to introduce green taxes", "ввести налоги, направленные на защиту окружающей среды"));
        wordsList.add(new PhraseItem("eco-friendly design in architecture", "экологичные дизайны в архитектуре"));
        wordsList.add(new PhraseItem("schemes to offset carbon emissions", "планы, как сбалансировать выбросы углерода"));
        wordsList.add(new PhraseItem("to buy hybrid cars", "покупать автомобили с гибридным двигателем"));
        wordsList.add(new PhraseItem("to develop alternative energy sources", "развивать альтернативные источники энергии"));
        wordsList.add(new PhraseItem("offshore wind farms", "морские ветряные электростанции"));
        wordsList.add(new PhraseItem("solar heating", "солнечное отопление"));
        wordsList.add(new PhraseItem("to dump waste", "сливать отходы"));
        wordsList.add(new PhraseItem("disposal of household waste", "уничтожение домашних отходов"));
        verticalLayout.addAndExpand(createPhraseTable(wordsList));
        add(verticalLayout);
    }
}


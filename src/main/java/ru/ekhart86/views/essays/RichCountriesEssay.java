package ru.ekhart86.views.essays;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("rich")
public class RichCountriesEssay extends Div implements ComponentFactory {
    String topicName = "In rich countries, economic development does not make the citizens happier. \n" +
            "Do you agree or disagree?";
    String bodyHeader = "Nowadays there are numerous countries in the world with different level of the economic development. Some countries are exceedingly affluent while other are extremely poor. \n" +
            "However, people who live in the poorest countries often have  happier life than ones from prosperous countries. I agree that the successful economic development does not always make citizens more delighted.";
    String bodyOne = "In my opinion, richness is not mainly thing in the life, moreover, sometimes money makes human dejected. If country increases the pace of economic development, it necessarily influences on life common person. \n" +
            "For example, humans from large European cities such as Paris or London must work really much for maintaining their high extent of life. According to this, they almost do not have spare time for communication with family. As the result they are provided of money, but lose relation with the closest relatives.";
    String bodyTwo = "Another example, due to the fact that modern rhythm of life is too intensive,  young people do not have sufficient time for creating own family. It is believed that a number of lonely human in urban significantly higher than rural one. This is not just a trend anymore, it is a fact of life.\n" +
            "In contrast, in poor countries people usually have a lot of  free time because of the rhythm of life is more calm, so they have opportunity to spend more time with family. Their happiness does not depend on richness unlike the society from economically developed countries whose life built only around money.";
    String bodyThree = "In conclusion, it should be noted that the economic development of country undoubtedly essential for citizens. Obviously, that without satisfaction basic Identity needs like meals or clothes, he cannot be cheerful. In addition it is vital to remember that people are beeng depended on communication with other ones. There are various social events which assist to resolve daily problems and remain contented.";

    public RichCountriesEssay() {
        add(createHeaderContentBackToThemes("essays", topicName));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createBody(bodyHeader));
        verticalLayout.addAndExpand(createBody(bodyOne));
        verticalLayout.addAndExpand(createBody(bodyTwo));
        verticalLayout.addAndExpand(createBody(bodyThree));
        Div div = createEssayDiv();
        div.add(verticalLayout);
        add(div);
    }
}
package ru.ekhart86.views.themes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("apple-complaint")
public class LetterOfComplaint extends Div implements ComponentFactory {
    String imagePath = "images/lost-luggage.jpg";
    String imageAlt = "Фото мебели";
    String topicName = "Letter about a lost suitcase";
    String bodyHeader = "Dear Sir or Madam,";
    String bodyOne = "I am writing in connection with a luggage which I lost three days ago when I was flying on plane of your company from Toronto to Moscow.";
    String bodyTwo = "That was black suitcase on wheels with telescopic handle system which I bought last month with a price of USD 250.00. There were really valuable for me things When I was boarding on plane In Toronto I gave my suitcase to the airline staff as required by the rules.";
    String bodyThree = "However, after plane landing In Moscow, when I tried to get my baggage an airport employee said me that they cannot find my suitcase. He asked me to wait in the airport waiting room while they looking for my suitcase. I was waiting my luggage more than two hours but I don't received it. After that senior airport manager promised me that they definitely will find it and call me. It have been three days ago but nobody call me and I am starting to worry about my suitcase.";
    String bodyEnd = "Therefore, I request you to properly investigate  and I hope that your company will be able to find my suitcase. In the case if my luggage won’t find I'll be forced to demand from your company compensation in the amount of $ 3,000.";
    String buyWords = "Yours faithfully, Roman Morozov";

    public LetterOfComplaint() {
        add(createHeaderContentBackToThemes("themes", topicName));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH3Header(topicName));
        verticalLayout.addAndExpand(createImage(imagePath, imageAlt));
        verticalLayout.addAndExpand(createBody(bodyHeader));
        verticalLayout.addAndExpand(createBody(bodyOne));
        verticalLayout.addAndExpand(createBody(bodyTwo));
        verticalLayout.addAndExpand(createBody(bodyThree));
        verticalLayout.addAndExpand(createBody(bodyEnd));
        verticalLayout.addAndExpand(createBody(buyWords));
        add(verticalLayout);
    }
}


package ru.ekhart86.views.topics;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("russian-museum")
public class RussianMuseumTheme extends Div implements ComponentFactory {
    String imagePath = "images/Russian-museum.jpg";
    String imageAlt = "Фото русского музея";
    String topicName = "Russian Museum";
    String body = "The State Russian Museum is the world’s largest collection of Russian art. \n" +
            "It is located in the historical centre of Saint Petersburg. " +
            "The grand opening of the Russian Museum was on March 19, 1898." +
            "The museum collection contains over 400 000 exhibits. " +
            "It covers all major periods and trends in the history of Russian art.\n" +
            "The main retrospective exhibition of the museum is located in Mikhailovsky Palace" +
            " and in the Benois Wing. " +
            "The collection of the museum includes Ivan Aivazovsky's The Ninth Wave, " +
            "Karl Brullov’s The Last Day of Pompeii, Vasily Surikov's Suvorov Crossing the Alps in 1799.\n" +
            "Today the State Russian Museum is a large research and educational centre.";
    public RussianMuseumTheme() {
        add(createHeaderContentBackToThemes("themes", topicName));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header(topicName));
        verticalLayout.addAndExpand(createImage(imagePath, imageAlt));
        verticalLayout.addAndExpand(createBody(body));
        add(verticalLayout);
    }
}

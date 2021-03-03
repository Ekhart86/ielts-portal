package ru.ekhart86.views.themes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("museums")
public class MuseumTheme extends Div implements ComponentFactory {
    String imagePath = "images/peterhof.jpg";
    String imageAlt = "Фото парка";
    String topicName = "The town where I was born.";
    String body = "So, today I want to tell you how my mother and me first visited Peterhof. \n" +
            "When I was a child, we often used to travel with my mother. \n" +
            "We first came to Saint Petersburg in 2000. \n" +
            "My sister advised us to go to Peterhof Park, \n" +
            "she said that is one of the most amazing places in the suburbs of St. Petersburg.\n" +
            "The Park is located in the suburbs and can be reached by bus in about 30 minutes.\n" +
            "Actually, Petergof Park it is Residence of Peter the great \n" +
            "which built in honor of Russia's access to the Baltic sea.\n" +
            "Fountains in Peterhof are realy incredible structures.\n" +
            "And what is surprising, even nowadays, they work without the use of pumps.\n" +
            "Peterhof has a large and beautiful Park \n" +
            "where you can easily meet squirrels and even feed them something.\n" +
            "There is also a delightful Palace which decorated with many Golden elements.\n" +
            "People admire it for a long time and take photos with it.\n" +
            "We were impressed by the visit to the Park \n" +
            "and now we also recommend our friends who have not been there yet,\n" +
            "be sure to visit this place.";

    public MuseumTheme() {
        add(createHeaderContentBackToThemes("themes", imageAlt));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header(topicName));
        verticalLayout.addAndExpand(createImage(imagePath, imageAlt));
        verticalLayout.addAndExpand(createBody(body));
        add(verticalLayout);
    }
}

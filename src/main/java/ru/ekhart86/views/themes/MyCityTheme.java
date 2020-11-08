package ru.ekhart86.views.themes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("my-city")
public class MyCityTheme extends Div implements ComponentFactory {
    String imagePath = "images/my-city.jpg";
    String imageAlt = "Фото города";
    String topicName = "The town where I was born.";
    String body = "     I was born in a small town in the North of Kazakhstan in 1986. \n" +
            "This town is called Kostanay.\n" +
            "The population of the town is approximately three hundred thousand people. \n" +
            "This region is famous for its large wheat harvests and mining, \n" +
            "which is used all over the world.\n" +
            "The town has many parks and squares and is surrounded by greenery.\n" +
            "In the summer, people are happy to relax there with their children.\n" +
            "I went to school in this city, but when I was fifteen years old, \n" +
            "my parents decided to move to St. Petersburg and I finished school there.\n" +
            "I have been living and working in Saint Petersburg for many years, \n" +
            "but I always remember my city with love. \n" +
            "My childhood was spent there and this city will always remain in my heart.";

    public MyCityTheme() {
        add(createHeaderContentBackToThemes());
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header(topicName));
        verticalLayout.addAndExpand(createImage(imagePath, imageAlt));
        verticalLayout.addAndExpand(createBody(body));
        add(verticalLayout);
    }

}

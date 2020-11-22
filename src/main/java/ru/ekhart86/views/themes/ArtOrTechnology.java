package ru.ekhart86.views.themes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("art-or-technology")
public class ArtOrTechnology  extends Div implements ComponentFactory {
    String imagePath = "images/art-or-technology.jpg";
    String imageAlt = "Фото искусства и науки";
    String topicName = "What is more important, science or art?";
    String body = "Nowadays, life of people easier than 100 or 200 years ago. " +
            "It is possible thanks to incredible discoveries in science and technology. " +
            "Today, many types of hard work are performed by machines. " +
            "For humans appeared a lot of professions which require high intelligence. " +
            "A huge amount of information that people encounter every day often becomes cause mental problems. " +
            "People have a bad mood or even suffer from depression. " +
            "In my opinion, art helps people cope with these overloads. " +
            "People go to music concerts, art galleries, theatres or cinema and relax there. " +
            "This fact let me claim that art no less important than science. " +
            "As it seems to me science and art should develop in parallel and they can't exist without each other.";

    public ArtOrTechnology() {
        add(createHeaderContentBackToThemes("themes"));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header(topicName));
        verticalLayout.addAndExpand(createImage(imagePath, imageAlt));
        verticalLayout.addAndExpand(createBody(body));
        add(verticalLayout);
    }

}

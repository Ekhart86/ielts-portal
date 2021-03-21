package ru.ekhart86.views.topics;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;
@Route("music-traditional-or-modern")
public class MusicTraditionalOrModern  extends Div implements ComponentFactory {
    String imagePath = "images/music-mind.png";
    String imageAlt = "Фото парка";
    String topicName = "What does music reveal to people about the world?";

    String body = "In our days there are lot of types music and each people can find that like him. " +
            "But what things music opens for people? Are modern types of music becomes more popular than traditional forms?\n" +
            "Music opens  the door in another world for man. " +
            "This world can exist without words and contain only sounds. Music calms or excites, makes you laugh or sad. \n" + "\n" +
            "For example, classic music is used to treat certainly kinds mental illnesses. It helps people find to harmony with themselves. " +
            "Another example when classic music turn on farms as a result cows gives more milk than usually.\n" +
            "I am absolutely convinced that modern music never can completely displace traditional forms of music.\n" +
            "Traditional music always will remain for man more essential than modern music because it is part of the cultural heritage.\n" +
            " Modern composition appear every day but after a few years, nobody remember them. " +
            "Traditional kind of music, on the contrary, remain in the memory of people for hundreds of years.\n" +
            " In generally, modern music compositions create as commercial projects. " +
            "Their main goal is bring money. They are designed mainly for young people and do not have a deep meaning in themselves. " +
            "Adult people more often prefer to listen traditional kind of music because they able understand it and enjoy it.";

    public MusicTraditionalOrModern() {
        add(createHeaderContentBackToThemes("themes", topicName));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header(topicName));
        verticalLayout.addAndExpand(createImage(imagePath, imageAlt));
        verticalLayout.addAndExpand(createBody(body));
        add(verticalLayout);
    }
}

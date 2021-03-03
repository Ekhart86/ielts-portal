package ru.ekhart86.views.themes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("furniture-letter")
public class LetterAboutFurniture extends Div implements ComponentFactory {
    String imagePath = "images/furniture.jpg";
    String imageAlt = "Фото мебели";
    String topicName = "Letter to friend about selling furniture";
    String bodyHeader = "Dear, Tom\n";
    String bodyOne = "I'm writing to let you know that I'm selling excellent furniture.";
    String bodyTwo = "I'm going to move into a new apartment, and I have a lot of unnecessary furniture left in the current one.\n" +
            "In my new flat just are all necessary furniture.\n" +
            "All furniture which i am selling almost new. \n" +
            "I tend to think are part of them you will like it.\n" +
            "For you as my friend cost will be the lowest almost for nothing.\n" +
            "There are cosy sofa and glass coffee table. \n" +
            "They are perfect for each other and they nice fit in your living room.\n" +
            "We will be able to meet more often at your home to play table games.";
    String bodyThree = "At this weekend I will be at old flat and I want to suggest you come here for see my furniture.\n" +
            "What do you say Tom? Should I wait for you this weekend?\n" +
            "I'm looking forward to hearing from you as soon as possible.";
    String bodyEnd = "Best regards, Roman";


    public LetterAboutFurniture() {
        add(createHeaderContentBackToThemes("themes", topicName));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH3Header(topicName));
        verticalLayout.addAndExpand(createImage(imagePath, imageAlt));
        verticalLayout.addAndExpand(createBody(bodyHeader));
        verticalLayout.addAndExpand(createBody(bodyOne));
        verticalLayout.addAndExpand(createBody(bodyTwo));
        verticalLayout.addAndExpand(createBody(bodyThree));
        verticalLayout.addAndExpand(createBody(bodyEnd));
        add(verticalLayout);
    }
}

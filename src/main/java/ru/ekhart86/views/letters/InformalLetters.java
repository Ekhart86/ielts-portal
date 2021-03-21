package ru.ekhart86.views.letters;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("informal-letter")
public class InformalLetters extends Div implements ComponentFactory {
    public InformalLetters() {
        add(createHeaderContentBackToThemes("letters", "Неформальные письма"));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(setLetterFurniture());
        verticalLayout.addAndExpand(setLetterMovedFriend());
        add(verticalLayout);
    }

    private Div setLetterFurniture() {
        VerticalLayout verticalLayout = new VerticalLayout();
        String topicName = "Letter to friend about selling furniture";
        String bodyHeader = "Dear Tom,";
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
        verticalLayout.addAndExpand(createH3Header(topicName));
        verticalLayout.addAndExpand(createBody(bodyHeader));
        verticalLayout.addAndExpand(createBody(bodyOne));
        verticalLayout.addAndExpand(createBody(bodyTwo));
        verticalLayout.addAndExpand(createBody(bodyThree));
        verticalLayout.addAndExpand(createBody(bodyEnd));
        Div div = createLetterDiv();
        div.add(verticalLayout);
        return div;
    }

    private Div setLetterMovedFriend() {
        VerticalLayout verticalLayout = new VerticalLayout();
        String topicName = "Email to a friend who recently moved in";
        String bodyHeader = "Hello Mike,";
        String bodyOne = "As I know you moved in new large estate recently, it is cool, congratulations! \n" +
                "I remember you were dreaming about it several  years, you worked hardly all this time and  have achieved it. ";
        String bodyTwo = "Unfortunately, in close time I can’t visit you, but I am preparing the great gift for you, it’s the enormous square carpet which I bought in India. It is made from the most expensive material, furthermore, edge of carpet is decorated by ornament.\n" +
                "Due to the fact,  that carpet has huge size, I have used the transport company which is  called DHL. They will deliver it on the next week, moreover, I asked them to call you before they were going to come. ";
        String bodyThree = "I am sure that for your living room this carpet will fit excellent, undoubtedly, it will make you house cozier.\n" +
                "If any problems are related with delivering arise, immediately, let me know about it. \n" +
                "Well, I really look forward to seeing you soon.\n";
        String bodyEnd = "All the best,\n" +
                "Roman";
        verticalLayout.addAndExpand(createH3Header(topicName));
        verticalLayout.addAndExpand(createBody(bodyHeader));
        verticalLayout.addAndExpand(createBody(bodyOne));
        verticalLayout.addAndExpand(createBody(bodyTwo));
        verticalLayout.addAndExpand(createBody(bodyThree));
        verticalLayout.addAndExpand(createBody(bodyEnd));
        Div div = createLetterDiv();
        div.add(verticalLayout);
        return div;
    }
}

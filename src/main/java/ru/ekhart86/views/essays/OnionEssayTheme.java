package ru.ekhart86.views.essays;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("onion")
public class OnionEssayTheme extends Div implements ComponentFactory {
    String topicName = "Onion essay";
    String bodyHeader = "Nowadays, onions are an important part of most dishes in the world. " +
            "But is it really that good? Let's look at this issue.\n";
    String bodyOne = "If we talk about the advantages of onions, " +
            "it is undoubtedly its health benefits. " +
            "Onions improve the immune system and make it easier for the body to cope with colds.\n" +
            "Onions contain a lot of useful vitamins and trace elements. " +
            "Onions are not an expensive product and almost everyone can afford them. You can find it in almost every grocery store.";
    String bodyTwo = "Now let's talk about the disadvantages. " +
            "First of all, it is not always a pleasant taste. Onions are often bitter. " +
            "Secondly, onions have an unpleasant smell and this can prevent you from contacting other people. " +
            "And third, when you peel the onion from the skin, it causes unpleasant sensations and tears.\n" +
            "As for me, I like to eat onions in any form. For example, with meat dishes or in a salad. " +
            "I'm fond of its taste and don't worry about its unpleasant smell. " +
            "In my family, everyone eats onions without any doubts.";
    String bodyThree = "In conclusion, I want to say that despite the disadvantages of onions, people should eat them.\n" +
            "Health is the most important thing that a person has. And the onion certainly helps to preserve it. Of course, if you have an important meeting planned, then it's not a good idea to have onion before it. But for example, eating onions for dinner is quite acceptable and useful.\n" +
            "I tend to think that onions continue to be a favorite vegetable for millions of people around the world.";

    public OnionEssayTheme() {
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
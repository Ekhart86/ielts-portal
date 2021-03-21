package ru.ekhart86.views.essays;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("violence-on-tv")
public class ViolenceOnTVEssay extends Div implements ComponentFactory {
    String topicName = "Onion essay";
    String bodyHeader = "Today numerous people suppose that a level of violence in the society is increasing especially among young people. It is considered that an enormous number of violent scenes are being shown on TV and the cinema. I accept that it might influence on behavior of young people, but I disagree that only video is cause for it.";
    String bodyOne = "There are many companies in the world which produce a huge number of films and TV shows everyday. The rating of movies is the most essentially index for producers, therefore, they add violent moments in their pictures, it causes the interest from viewers.\n" +
            "I am sure that youth, who often watch violent movies, begin to think that this is the standard of conduct.\n" +
            "They start to repeat abuse action at home or school, moreover, they engage their friends in it . Nowadays, the bullying in the schools is sufficiently frequent event despite all efforts of teachers resolve this problem difficult enough.";
    String bodyTwo = "However, I tend to think that environment in family affects on person not less than violence on TV or the cinema. For example, in family where someone from parents is alcoholic, children become more aggressive than other from normal families. If such children timely are not given mental help, probably, they will grow criminals.";
    String bodyThree = "To sum up, undoubtedly in the modern world humans are compelled to encounter with extremely high level of violence in our society. Furthermore, I am absolutely convinced that this tendency will continue in the future. Nevertheless, I tend to believe that sooner or later humanity will realize that violence it is the way to nowhere, that only love and friendship are able to make this peace superior.";

    public ViolenceOnTVEssay() {
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
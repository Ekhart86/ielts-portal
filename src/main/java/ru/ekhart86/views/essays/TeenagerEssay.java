package ru.ekhart86.views.essays;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("teenagers")
public class TeenagerEssay extends Div implements ComponentFactory {

    String topicName = "Essay about teenagers";
    String bodyHeader = "Nowadays numerous people assume that youth is the best time in the life of each person. However, others think against that  the adult life is more interesting than the teenage years. In my opinion, every period of life has both advantages and disadvantages, in this way, the person should learn to be happy in each age.";
    String bodyOne = "In the youth, people usually do not have a lot of life problems, they are filled power and energy.\n" +
            "It might seem to be  ideal time for happiness, but unfortunately this is not always like in that way.   \n" +
            "For example, the most of students are compelled to live with conditions of a constant lack of money, moreover, often they compile study with work. As a result, they are extremely tired, in this way, they can hardly be called joyful.";
    String bodyTwo = "It is believed, that adult people mostly have a stable salary, therefore, they can let for themselves the various expensive things. Despite this, they generally have enormous responsible for their family, also they frequently are overloaded at work because of it, they often need the help of a professional psychologist. Obviously, that such life also has a lot of reason for decrease a level of enjoyment.";
    String bodyThree = "In conclusion, I believe that the happiness does not depend on age, it is possible to be cheerful in whichever  age. For instance, the person can always  call their friends for meeting or find new hobbies for themselves.  We live in the vast world with incredible opportunities, accordingly, it only depend on us which mood we have today, and how we will live this life.";

    public TeenagerEssay() {
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
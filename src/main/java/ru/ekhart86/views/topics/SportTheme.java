package ru.ekhart86.views.topics;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("sport-topic")
public class SportTheme extends Div implements ComponentFactory {
    String imagePath = "images/sporting.jpg";
    String imageAlt = "Спортивное фото";
    String topicName = "My Attitude to Sports";
    String body = "If you want to be healthy, strong and beautiful, you should go in for sports.\n" +
            "   When I go in for sports, I feel wonderful. I don't sneeze or cough. I am cheerful, active and full of energy. In summer I go swimming. I enjoy spending winter holidays in the country There I can ski or skate. Certainly, it depends on the weather.\n" +
            "   For those who have already determined to go in for sport is very important to choose the kind of sport he likes best.\n" +
            "   First touch to sports and games we make in childhood. In school we discover our favourite sports and games. That's why the lessons of physical training at school are very important.\n" +
            "   At school we have PT lessons twice a week. Those who want to become professionals attend specialized sport sections.\n" +
            "   As for me I enjoy basketball. Basketball is a dynamic and interesting game. It develops many good qualities such as rapid reaction, will-power and collective spirit.\n" +
            "   I have already realized that sport is desperately necessary for everybody.";
    public SportTheme() {
        add(createHeaderContentBackToThemes("themes", topicName));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header(topicName));
        verticalLayout.addAndExpand(createImage(imagePath, imageAlt));
        verticalLayout.addAndExpand(createBody(body));
        add(verticalLayout);
    }
}

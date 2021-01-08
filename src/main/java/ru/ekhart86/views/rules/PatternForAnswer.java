package ru.ekhart86.views.rules;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("pattern-for-answer")
public class PatternForAnswer extends Div implements ComponentFactory {

    public PatternForAnswer() {
        add(createHeaderContentBackToThemes("rules"));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header("Шаблон ответа"));
        verticalLayout.addAndExpand(createBodyWithColor("Present perfect continuous (I have been verb + ing for ...)", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("I have been listening rock music for 20 years and I keep listening to it in nowadays"));
        verticalLayout.addAndExpand(createBodyWithColor("Past simple ...", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("When I was a child I often listened to music with my father"));
        verticalLayout.addAndExpand(createBodyWithColor("For example ... или For instance ... ", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("For example we listened so bands like The queen or Abba"));
        verticalLayout.addAndExpand(createBodyWithColor("Condition 3 (Past perfect + would have past participle)", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("If my father hadn't shown me them probably I wouldn't have become fan of the rock music"));
        verticalLayout.addAndExpand(createBodyWithColor("Used to ...", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("I used to listen to music every day after school."));
        verticalLayout.addAndExpand(createBodyWithColor("There are ...", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("There are several reasons why I love rock music"));
        verticalLayout.addAndExpand(createBodyWithColor("Firstly, ...", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Firstly, rock music helps me to improve my mood"));
        verticalLayout.addAndExpand(createBodyWithColor("Secondly, ...", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Secondly, it allowed me to meet many interesting people who also fond of rock music."));
        verticalLayout.addAndExpand(createBodyWithColor("Future time", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Next month I am going Rock festival which will go in Moscow. It will be really amazing concert."));
        verticalLayout.addAndExpand(createBodyWithColor("Therefore", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Therefore, i tend to think that rock music positive influence on life person and listening music helpful in any age"));
        add(verticalLayout);

    }
}

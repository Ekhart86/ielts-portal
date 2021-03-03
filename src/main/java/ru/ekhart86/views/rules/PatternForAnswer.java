package ru.ekhart86.views.rules;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("pattern-for-answer")
public class PatternForAnswer extends Div implements ComponentFactory {

    public PatternForAnswer() {
        add(createHeaderContentBackToThemes("rules", ""));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header("Шаблон ответа"));
        verticalLayout.addAndExpand(createBody("Present perfect continuous (I have been verb + ing for ...)"));
        verticalLayout.addAndExpand(createBodyWithColor("I have been listening rock music for 20 years and I keep listening to it in nowadays", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Past simple ..."));
        verticalLayout.addAndExpand(createBodyWithColor("When I was a child I often listened to music with my father", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("For example ... или For instance ... "));
        verticalLayout.addAndExpand(createBodyWithColor("For example we listened so bands like The queen or Abba", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Condition 3 (Past perfect + would have past participle)"));
        verticalLayout.addAndExpand(createBodyWithColor("If my father hadn't shown me them probably I wouldn't have become fan of the rock music", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Used to ..."));
        verticalLayout.addAndExpand(createBodyWithColor("I used to listen to music every day after school.", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("There are ..."));
        verticalLayout.addAndExpand(createBodyWithColor("There are several reasons why I love rock music", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Firstly, ..."));
        verticalLayout.addAndExpand(createBodyWithColor("Firstly, rock music helps me to improve my mood", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Secondly, ..."));
        verticalLayout.addAndExpand(createBodyWithColor("Secondly, it allowed me to meet many interesting people who also fond of rock music.", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Future time ..."));
        verticalLayout.addAndExpand(createBodyWithColor("Next month I am going Rock festival which will go in Moscow. It will be really amazing concert.", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Therefore ..."));
        verticalLayout.addAndExpand(createBodyWithColor("Therefore, i tend to think that rock music positive influence on life person and listening music helpful in any age", "DarkGreen"));
        add(verticalLayout);

    }
}

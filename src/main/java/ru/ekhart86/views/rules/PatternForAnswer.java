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
        verticalLayout.addAndExpand(createBodyWithColor("I have been verb + ing for ...", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("I have been listening rock music for 20 years and I keep listening to it in nowadays"));
        verticalLayout.addAndExpand(createBodyWithColor("Past simple ...", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("When I was a child I often listened to music with my father"));
        verticalLayout.addAndExpand(createBodyWithColor("For example ... или For instance ... ", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("For example we listened so bands like The queen or Abba"));
        verticalLayout.addAndExpand(createBodyWithColor("", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("If my father hadn't shown me them probably I would not become fan of the rock music"));
        verticalLayout.addAndExpand(createBodyWithColor("Used to ...", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("I used to listen to music every day after school."));
        verticalLayout.addAndExpand(createBodyWithColor("re several reasons why ...", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("There are several reasons why I love rock music"));
        verticalLayout.addAndExpand(createBodyWithColor("Firstly, ...", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Firstly, rock music helps me to improve my mood"));
        verticalLayout.addAndExpand(createBodyWithColor("Secondly, ...", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Secondly, it allowed me to meet many interesting people who also fond of rock music."));
        verticalLayout.addAndExpand(createBodyWithColor("", "DarkGreen"));
        verticalLayout.addAndExpand(createBody(""));
        add(verticalLayout);

    }
}

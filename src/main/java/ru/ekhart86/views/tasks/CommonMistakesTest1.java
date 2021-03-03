package ru.ekhart86.views.tasks;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("common-mistakes-test-1")
public class CommonMistakesTest1 extends Div implements ComponentFactory {

    public CommonMistakesTest1() {
        add(createHeaderContentBackToThemes("tasks", ""));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createImage("images/commontest1/common-test-1.png", "Page 1"));
        verticalLayout.addAndExpand(createImage("images/commontest1/common-test-2.png", "Page 2"));
        verticalLayout.addAndExpand(createImage("images/commontest1/common-4.png", "Page 1"));
        verticalLayout.addAndExpand(createImage("images/commontest1/common-5.png", "Page 2"));
        verticalLayout.addAndExpand(createImage("images/commontest1/common-6-1.png", "Page 2"));
        verticalLayout.addAndExpand(createImage("images/commontest1/common-6-2.png", "Page 2"));
        verticalLayout.addAndExpand(createImage("images/commontest1/common-6-3.png", "Page 2"));
        verticalLayout.addAndExpand(createImage("images/commontest1/common-7-1.png", "Page 2"));
        add(verticalLayout);
    }
}

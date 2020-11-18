package ru.ekhart86.views.tasks;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("test-3-reading")
public class TestThreeReading extends Div implements ComponentFactory {

    public TestThreeReading() {
        add(createHeaderContentBackToThemes("tasks"));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createImage("images/test-3-reading/test-3-reading-1.PNG", "Page 1"));
        verticalLayout.addAndExpand(createImage("images/test-3-reading/test-3-reading-2.PNG", "Page 2"));
        verticalLayout.addAndExpand(createImage("images/test-3-reading/test-3-reading-3.PNG", "Page 3"));
        verticalLayout.addAndExpand(createImage("images/test-3-reading/test-3-reading-4.PNG", "Page 4"));
        verticalLayout.addAndExpand(createImage("images/test-3-reading/test-3-reading-5.PNG", "Page 5"));
        verticalLayout.addAndExpand(createImage("images/test-3-reading/test-3-reading-6.PNG", "Page 6"));
        verticalLayout.addAndExpand(createImage("images/test-3-reading/test-3-reading-7.PNG", "Page 7"));
        verticalLayout.addAndExpand(createImage("images/test-3-reading/test-3-reading-8.PNG", "Page 8"));
        verticalLayout.addAndExpand(createImage("images/test-3-reading/test-3-reading-9.PNG", "Page 9"));
        add(verticalLayout);
    }
}

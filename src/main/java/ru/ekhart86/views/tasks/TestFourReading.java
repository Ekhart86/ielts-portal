package ru.ekhart86.views.tasks;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;
@Route("test-4-reading")
public class TestFourReading extends Div implements ComponentFactory {

    public TestFourReading() {
        add(createHeaderContentBackToThemes("tasks", ""));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createImageWithoutRestrictions("images/test-4-reading/test-4-1.png", "Page 1"));
        verticalLayout.addAndExpand(createImageWithoutRestrictions("images/test-4-reading/test-4-2.png", "Page 1"));
        verticalLayout.addAndExpand(createImageWithoutRestrictions("images/test-4-reading/test-4-3.png", "Page 1"));
        verticalLayout.addAndExpand(createImageWithoutRestrictions("images/test-4-reading/test-4-4.png", "Page 1"));
        verticalLayout.addAndExpand(createImageWithoutRestrictions("images/test-4-reading/test-4-5.png", "Page 1"));
        verticalLayout.addAndExpand(createImageWithoutRestrictions("images/test-4-reading/test-4-6.png", "Page 1"));
        verticalLayout.addAndExpand(createImageWithoutRestrictions("images/test-4-reading/test-4-7.png", "Page 1"));
        verticalLayout.addAndExpand(createImageWithoutRestrictions("images/test-4-reading/test-4-8.png", "Page 1"));
        verticalLayout.addAndExpand(createImageWithoutRestrictions("images/test-4-reading/test-4-9.png", "Page 1"));
        add(verticalLayout);
    }
}

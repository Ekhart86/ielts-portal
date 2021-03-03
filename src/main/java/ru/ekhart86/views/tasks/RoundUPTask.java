package ru.ekhart86.views.tasks;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("round-up-4")
public class RoundUPTask extends Div implements ComponentFactory {

    public RoundUPTask() {
        add(createHeaderContentBackToThemes("tasks", ""));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createImage("images/roundup4/roundup4-1.PNG", "Page 1"));
        verticalLayout.addAndExpand(createImage("images/roundup4/roundup4-2.PNG", "Page 2"));
        verticalLayout.addAndExpand(createImage("images/roundup4/roundup4-3.PNG", "Page 3"));
        add(verticalLayout);
    }
}

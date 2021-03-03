package ru.ekhart86.views.rules;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("conditionals")
public class Conditionals extends Div implements ComponentFactory {
    public Conditionals() {
        add(createHeaderContentBackToThemes("rules", ""));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header("Conditionals"));
        verticalLayout.addAndExpand(createImage("images/conditionals/conditionals.jpg", "conditionals"));
        add(verticalLayout);
    }
}

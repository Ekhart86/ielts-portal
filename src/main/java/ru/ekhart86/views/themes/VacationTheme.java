package ru.ekhart86.views.themes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("vacation")
public class VacationTheme extends Div {
    public VacationTheme() {
        setText("Vacation!");
    }
}

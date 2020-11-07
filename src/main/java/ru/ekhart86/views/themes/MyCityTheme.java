package ru.ekhart86.views.themes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("my-city")
public class MyCityTheme extends Div {
    public MyCityTheme() {
        setText("My city!");
    }
}

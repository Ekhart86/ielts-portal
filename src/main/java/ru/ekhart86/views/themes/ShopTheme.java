package ru.ekhart86.views.themes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("shop")
public class ShopTheme extends Div {
    public ShopTheme() {
        setText("Shop!");
    }
}

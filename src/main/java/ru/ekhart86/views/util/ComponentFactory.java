package ru.ekhart86.views.util;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Style;


public interface ComponentFactory {
   default Component createHeaderContentBackToThemes() {
        HorizontalLayout layout = new HorizontalLayout();
        layout.setId("header");
        layout.getThemeList().set("dark", true);
        layout.setWidthFull();
        layout.setSpacing(false);
        layout.setAlignItems(FlexComponent.Alignment.CENTER);
        Button backButton = new Button();
        Icon icon = new Icon(VaadinIcon.ARROW_LEFT);
        Label label = new Label("  ");
        Text text = new Text("на главную");
        backButton.getElement().appendChild(icon.getElement());
        backButton.getElement().appendChild(label.getElement());
        backButton.getElement().appendChild(text.getElement());
        backButton.addClickListener(e ->
                backButton.getUI().ifPresent(ui ->
                        ui.navigate("themes"))
        );
        layout.add(backButton);
        H1 viewTitle = new H1();
        layout.add(viewTitle);
        return layout;
    }

     default Component createH2Header(String text) {
          FlexLayout centeredLayout = new FlexLayout();
          centeredLayout.setSizeFull();
          centeredLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
          centeredLayout.setAlignItems(FlexComponent.Alignment.CENTER);
          centeredLayout.add(new H2(text));
          return centeredLayout;
     }

     default Component createImage(String path, String alt) {
          FlexLayout centeredLayout = new FlexLayout();
          centeredLayout.setSizeFull();
          centeredLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
          centeredLayout.setAlignItems(FlexComponent.Alignment.CENTER);
          centeredLayout.add(new Image(path, alt));
          return centeredLayout;
     }

     default Component createBody(String text) {
          H3 body = new H3(text);
          Style style = body.getElement().getStyle();
          style.set("margin-top", "3%");
          style.set("margin-left", "30%");
          style.set("margin-right", "30%");
          return body;
     }
}

package ru.ekhart86.views.letters;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import ru.ekhart86.views.main.MainView;
import ru.ekhart86.views.topics.*;

import java.util.Arrays;
import java.util.List;

@Route(value = "letters", layout = MainView.class)
@PageTitle("Письма")
@CssImport("./styles/views/themes/themes-view.css")
@RouteAlias(value = "", layout = MainView.class)
public class LettersView extends Div {
    public LettersView() {
        setId("letters-view");
        List<ThemeItem> themesList = Arrays.asList(
                new ThemeItem("Формальные письма", "Formal letter", 1),
                new ThemeItem("Неформальные письма", "Informal letter", 2),
                new ThemeItem("Полуформальные письма", "Semi-formal letter", 3));
        Grid<ThemeItem> grid = new Grid<>();
        Style style = grid.getElement().getStyle();
        style.set("height", "40em");
        grid.setItems(themesList);
        grid.addColumn(ThemeItem::getTitle).setHeader("Название");
        grid.addColumn(ThemeItem::getSubTitle).setHeader("Описание");
        grid.addComponentColumn(
                item -> {
                    Button openButton = new Button();
                    Icon icon = new Icon(VaadinIcon.SEARCH);
                    openButton.getElement().appendChild(icon.getElement());
                    openButton.addClickListener(e -> {
                        openSelectedTheme(item.getId());
                    });
                    return openButton;
                }).setHeader("Просмотр");
        grid.setSelectionMode(Grid.SelectionMode.SINGLE);
        grid.addItemClickListener(listener ->
                {
                    if (listener.getClickCount() == 2) {
                        openSelectedTheme(listener.getItem().getId());
                    }
                }
        );
        add(grid);
    }

    private void openSelectedTheme(int id) {
        switch (id) {
            case 1:
                UI.getCurrent().navigate(FormalLetters.class);
                break;
            case 2:
                UI.getCurrent().navigate(InformalLetters.class);
                break;
            case 3:
                UI.getCurrent().navigate(SemiFormalLetters.class);
                break;
        }
    }
}

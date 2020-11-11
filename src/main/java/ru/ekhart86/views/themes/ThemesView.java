package ru.ekhart86.views.themes;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import ru.ekhart86.views.main.MainView;

import java.util.Arrays;
import java.util.List;

@Route(value = "themes", layout = MainView.class)
@PageTitle("Темы")
@CssImport("./styles/views/themes/themes-view.css")
@RouteAlias(value = "", layout = MainView.class)
public class ThemesView extends Div {

    public ThemesView() {
        setId("themes-view");
        List<ThemeItem> themesList = Arrays.asList(
                new ThemeItem("Мой город", "Город в котором я родился", 1),
                new ThemeItem("Петергоф", "Рассказ о посещении Петергофского парка", 2));
        Grid<ThemeItem> grid = new Grid<>();
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
                UI.getCurrent().navigate(MyCityTheme.class);
                break;
            case 2:
                UI.getCurrent().navigate(MuseumTheme.class);
                break;
        }
    }
}

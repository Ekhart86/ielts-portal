package ru.ekhart86.views.topics;

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
import ru.ekhart86.views.essays.OnionEssayTheme;
import ru.ekhart86.views.main.MainView;

import java.util.Arrays;
import java.util.List;

@Route(value = "themes", layout = MainView.class)
@PageTitle("Темы")
@CssImport("./styles/views/themes/themes-view.css")
@RouteAlias(value = "themes", layout = MainView.class)
public class ThemesView extends Div {

    public ThemesView() {
        setId("themes-view");
        List<ThemeItem> themesList = Arrays.asList(
                new ThemeItem("Мой город", "Город в котором я родился", 1),
                new ThemeItem("Петергоф", "Рассказ о посещении Петергофского парка", 2),
                new ThemeItem("Книга", "Рассказ о последней прочитанной книге", 3),
                new ThemeItem("Искусство или наука", "Рассуждение о том что важней", 4),
                new ThemeItem("Рассуждение о музыке", "Рассуждение о том вытеснит ли современная музыка традиционную", 5),
                new ThemeItem("Шопинг", "Монолог на тему шопинга", 6),
                new ThemeItem("Русский музей", "Рассказ о русском музее", 7),
                new ThemeItem("Спорт", "Моё отношение к спорту", 8),
                new ThemeItem("Луковое эссе", "Эссе о плюсах и минусах лука", 9),
                new ThemeItem("Солнечная система", "Рассказ о солнечной системе", 10));
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
                UI.getCurrent().navigate(MyCityTheme.class);
                break;
            case 2:
                UI.getCurrent().navigate(MuseumTheme.class);
                break;
            case 3:
                UI.getCurrent().navigate(BookTheme.class);
                break;
            case 4:
                UI.getCurrent().navigate(ArtOrTechnology.class);
                break;
            case 5:
                UI.getCurrent().navigate(MusicTraditionalOrModern.class);
                break;
            case 6:
                UI.getCurrent().navigate(ShopTheme.class);
                break;
            case 7:
                UI.getCurrent().navigate(RussianMuseumTheme.class);
                break;
            case 8:
                UI.getCurrent().navigate(SportTheme.class);
                break;
            case 9:
                UI.getCurrent().navigate(OnionEssayTheme.class);
                break;
            case 10:
                UI.getCurrent().navigate(SolarSystemTheme.class);
                break;
        }
    }
}

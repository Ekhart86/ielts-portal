package ru.ekhart86.views.essays;

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

@Route(value = "essays", layout = MainView.class)
@PageTitle("Эссе")
@CssImport("./styles/views/themes/themes-view.css")
@RouteAlias(value = "essays", layout = MainView.class)
public class EssaysView extends Div {
    public EssaysView() {
        setId("essays-view");
        List<ThemeItem> themesList = Arrays.asList(
                new ThemeItem("Луковое эссе", "Шуточное эссе о луке", 1),
                new ThemeItem("Счастливы ли люди в богатых странах", "Оценка зависимости счастья от богатств", 2),
                new ThemeItem("Жестокость на телевидении", "Рассуждения о том влияет ли ТВ на людей", 3),
                new ThemeItem("Тяжело ли быть подростком", "Эссе о тинейджерах", 4));
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
                UI.getCurrent().navigate(OnionEssayTheme.class);
                break;
            case 2:
                UI.getCurrent().navigate(RichCountriesEssay.class);
                break;
            case 3:
                UI.getCurrent().navigate(ViolenceOnTVEssay.class);
                break;
            case 4:
                UI.getCurrent().navigate(TeenagerEssay.class);
                break;
        }
    }
}

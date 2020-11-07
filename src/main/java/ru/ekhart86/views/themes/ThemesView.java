package ru.ekhart86.views.themes;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.data.selection.SingleSelect;
import com.vaadin.flow.dom.Style;
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
    int selectedThemeId;

    public ThemesView() {
        setId("themes-view");
        List<ThemeItem> themesList = Arrays.asList(
                new ThemeItem("Мой город", "Город в котором я родился", 1),
                new ThemeItem("Отпуск", "История последнего отпуска", 2),
                new ThemeItem("Магазин", "Правила похода в магазин", 3));
        Grid<ThemeItem> grid = new Grid<>();
        grid.setItems(themesList);
        grid.addColumn(ThemeItem::getTitle).setHeader("Название");
        grid.addColumn(ThemeItem::getSubTitle)
                .setHeader("Описание");
        grid.setSelectionMode(Grid.SelectionMode.SINGLE);
        SingleSelect<Grid<ThemeItem>, ThemeItem> themeSelect =
                grid.asSingleSelect();
        themeSelect.addValueChangeListener(e -> {
            ThemeItem currentThemeItem = e.getValue();
            this.selectedThemeId = currentThemeItem.getId();
        });
        Label label = new Label();
        Style style = label.getElement().getStyle();
        style.set("display", "block");
        style.set("margin-bottom", "30px");
        Button button = new Button("Открыть");
        Style buttonStyle = button.getElement().getStyle();
        buttonStyle.set("background", "#2196f3");
        buttonStyle.set("color", "white");
        button.addClickListener(e -> openSelectedTheme());
        FlexLayout centeredLayout = new FlexLayout();
        centeredLayout.setSizeFull();
        centeredLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        centeredLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        centeredLayout.add(button);
        add(grid, label, centeredLayout);
    }

    private void openSelectedTheme() {
        switch (selectedThemeId) {
            case 1:
                UI.getCurrent().navigate(MyCityTheme.class);
                break;
            case 2:
                UI.getCurrent().navigate(VacationTheme.class);
                break;
            case 3:
                UI.getCurrent().navigate(ShopTheme.class);
                break;
        }
    }

}

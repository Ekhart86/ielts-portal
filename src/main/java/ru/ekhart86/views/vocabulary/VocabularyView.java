package ru.ekhart86.views.vocabulary;

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
import ru.ekhart86.views.main.MainView;
import ru.ekhart86.views.themes.MyCityTheme;
import ru.ekhart86.views.themes.ShopTheme;
import ru.ekhart86.views.themes.ThemeItem;
import ru.ekhart86.views.themes.VacationTheme;

import java.util.Arrays;
import java.util.List;

@Route(value = "vocabulary", layout = MainView.class)
@PageTitle("Словарь")
@CssImport("./styles/views/vocabulary/vocabulary-view.css")
public class VocabularyView extends Div {

    int selectedThemeId;

    public VocabularyView() {
        setId("themes-view");
        List<ThemeItem> themesList = Arrays.asList(
                new ThemeItem("IELTS Вступительные слова", "Слова используемые в начале предложений", 1),
                new ThemeItem("Погода", "Слова для описания погоды", 2),
                new ThemeItem("Art", "Слова связанные с искусством", 3));
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

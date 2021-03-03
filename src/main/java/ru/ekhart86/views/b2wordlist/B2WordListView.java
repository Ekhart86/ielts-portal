package ru.ekhart86.views.b2wordlist;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.main.MainView;
import ru.ekhart86.views.themes.ThemeItem;
import ru.ekhart86.views.vocabulary.*;

import java.util.Arrays;
import java.util.List;

@Route(value = "b2-vocabulary", layout = MainView.class)
@PageTitle("B2 Словарь")
@CssImport("./styles/views/vocabulary/vocabulary-view.css")
public class B2WordListView extends Div {

    int selectedThemeId;

    public B2WordListView() {
        setId("b2-part-1-view");
        List<ThemeItem> themesList = Arrays.asList(
                new ThemeItem("Часть 1", "Список слов уровня B2", 1),
                new ThemeItem("Часть 2", "Список слов уровня B2", 2),
                new ThemeItem("Часть 3", "Список слов уровня B2", 3),
                new ThemeItem("Часть 3", "Список слов уровня B2", 4));
        Grid<ThemeItem> grid = new Grid<>();
        grid.setItems(themesList);
        grid.addColumn(ThemeItem::getTitle).setHeader("Название");
        grid.addColumn(ThemeItem::getSubTitle)
                .setHeader("Описание");
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
                UI.getCurrent().navigate(B2PartOne.class);
                break;
            case 2:
                UI.getCurrent().navigate(B2PartTwo.class);
                break;
            case 3:
                UI.getCurrent().navigate(B2PartThree.class);
                break;
            case 4:
                UI.getCurrent().navigate(BPart4.class);
                break;
            case 5:
                UI.getCurrent().navigate(Art.class);
                break;
        }
    }

}

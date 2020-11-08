package ru.ekhart86.views.vocabulary;

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

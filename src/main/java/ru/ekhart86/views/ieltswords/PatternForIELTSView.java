package ru.ekhart86.views.ieltswords;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.b2wordlist.B2PartThree;
import ru.ekhart86.views.main.MainView;
import ru.ekhart86.views.topics.ThemeItem;

import java.util.Arrays;
import java.util.List;

@Route(value = "pattern-for-ielts", layout = MainView.class)
@PageTitle("Слова для IELTS")
@CssImport("./styles/views/vocabulary/vocabulary-view.css")
public class PatternForIELTSView extends Div {
    int selectedThemeId;

    public PatternForIELTSView() {
        setId("b2-part-1-view");
        List<ThemeItem> themesList = Arrays.asList(
                new ThemeItem("Вступительные слова для Speaking", "Слова используемые в начале предложений", 1),
                new ThemeItem("Фразы для Писем", "Первая часть задания Writing", 2),
                new ThemeItem("Конструкции слов для Writing", "Полезные конструкции слов", 3));
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
                UI.getCurrent().navigate(StartWordForIELTS.class);
                break;
            case 2:
                UI.getCurrent().navigate(WritingPartOnePhrase.class);
                break;
            case 3:
                UI.getCurrent().navigate(WordConstructions.class);
                break;
        }
    }
}

package ru.ekhart86.views.vocabulary;

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
import ru.ekhart86.views.ieltswords.StartWordForIELTS;
import ru.ekhart86.views.ieltswords.WritingPartOnePhrase;
import ru.ekhart86.views.main.MainView;
import ru.ekhart86.views.topics.ThemeItem;

import java.util.Arrays;
import java.util.List;

@Route(value = "vocabulary", layout = MainView.class)
@PageTitle("Слова по темам")
@CssImport("./styles/views/vocabulary/vocabulary-view.css")
public class VocabularyView extends Div {

    int selectedThemeId;

    public VocabularyView() {
        setId("vocabulary-view");
        List<ThemeItem> themesList = Arrays.asList(
                new ThemeItem("Прилагательные", "Список самых популярных прилагательных", 1),
                new ThemeItem("Фразовые глаголы", "Список самых популярных фразовых глаголов", 2),
                new ThemeItem("Идиомы", "Список популярных идиом", 3),
                new ThemeItem("Искусство", "Список слов об искусстве", 4),
                new ThemeItem("Предлоги", "Все предлоги в английском языке", 5),
                new ThemeItem("Окружающая среда", "Слова для темы окружающая среда", 6));
        Grid<ThemeItem> grid = new Grid<>();
        Style style = grid.getElement().getStyle();
        style.set("height", "40em");
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
                UI.getCurrent().navigate(Adjective.class);
                break;
            case 2:
                UI.getCurrent().navigate(PhrasalVerbs.class);
                break;
            case 3:
                UI.getCurrent().navigate(Idioms.class);
                break;
            case 4:
                UI.getCurrent().navigate(Art.class);
                break;
            case 5:
                UI.getCurrent().navigate(Prepositions.class);
                break;
            case 6:
                UI.getCurrent().navigate(Environment.class);
                break;
        }
    }

}

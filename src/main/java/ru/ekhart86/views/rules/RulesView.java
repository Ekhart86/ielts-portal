package ru.ekhart86.views.rules;

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
import ru.ekhart86.views.themes.ShopTheme;
import ru.ekhart86.views.themes.VacationTheme;

import java.util.Arrays;
import java.util.List;

@Route(value = "rules", layout = MainView.class)
@PageTitle("Правила")
@CssImport("./styles/views/themes/themes-view.css")
public class RulesView extends Div {
    public RulesView() {
        setId("rules-view");
        List<RuleItem> tasksList = Arrays.asList(
                new RuleItem("Конструкция used to", "used to, would, be used to, get used to,", 1),
                new RuleItem("Пассивный залог", "Правила пассивного залога", 2),
                new RuleItem("Условные предложения", "Правила условных предложений", 3)
        );
        Grid<RuleItem> grid = new Grid<>();
        grid.setItems(tasksList);
        grid.addColumn(RuleItem::getTitle).setHeader("Название");
        grid.addColumn(RuleItem::getSubTitle).setHeader("Описание");
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
                UI.getCurrent().navigate(UsedToRule.class);
                break;
            case 2:
                UI.getCurrent().navigate(PassiveVoice.class);
                break;
            case 3:
                UI.getCurrent().navigate(Conditionals.class);
                break;
        }
    }
}

package ru.ekhart86.views.tasks;

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

@Route(value = "tasks", layout = MainView.class)
@PageTitle("Задания")
@CssImport("./styles/views/themes/themes-view.css")
public class TasksView extends Div {
    public TasksView() {
        setId("tasks-view");
        List<TaskItem> tasksList = Arrays.asList(
                new TaskItem("Round-Up 4", "Практика. Уровень A2", 1),
                new TaskItem("Test 3 Reading", "Практика. Тест третий, 5 частей", 2));
        Grid<TaskItem> grid = new Grid<>();
        grid.setItems(tasksList);
        grid.addColumn(TaskItem::getTitle).setHeader("Название");
        grid.addColumn(TaskItem::getSubTitle).setHeader("Описание");
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
                UI.getCurrent().navigate(RoundUPTask.class);
                break;
            case 2:
                UI.getCurrent().navigate(TestThreeReading.class);
                break;
            case 3:
                UI.getCurrent().navigate(ShopTheme.class);
                break;
        }
    }
}

package ru.ekhart86.views.util;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.HeaderRow;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.dom.Style;
import org.apache.commons.lang3.StringUtils;
import ru.ekhart86.views.vocabulary.PhrasalVerbItem;
import ru.ekhart86.views.vocabulary.WordItem;

import java.util.List;


public interface ComponentFactory {

    default Component createHeaderContentBackToThemes(String backPage) {
        HorizontalLayout layout = new HorizontalLayout();
        layout.setId("header");
        layout.getThemeList().set("dark", true);
        layout.setWidthFull();
        layout.setSpacing(false);
        layout.setAlignItems(FlexComponent.Alignment.CENTER);
        Button backButton = new Button();
        Icon icon = new Icon(VaadinIcon.ARROW_LEFT);
        Label label = new Label("  ");
        Text text = new Text("назад");
        backButton.getElement().appendChild(icon.getElement());
        backButton.getElement().appendChild(label.getElement());
        backButton.getElement().appendChild(text.getElement());
        backButton.addClickListener(e ->
                backButton.getUI().ifPresent(ui ->
                        ui.navigate(backPage))
        );
        layout.add(backButton);
        H1 viewTitle = new H1();
        layout.add(viewTitle);
        return layout;
    }

    default Component createH2Header(String text) {
        FlexLayout centeredLayout = new FlexLayout();
        centeredLayout.setSizeFull();
        centeredLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        centeredLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        centeredLayout.add(new H2(text));
        return centeredLayout;
    }

    default Component createImage(String path, String alt) {
        FlexLayout centeredLayout = new FlexLayout();
        centeredLayout.setSizeFull();
        centeredLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        centeredLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        centeredLayout.add(new Image(path, alt));
        return centeredLayout;
    }

    default Component createBody(String text) {
        H3 body = new H3(text);
        Style style = body.getElement().getStyle();
        style.set("margin-top", "3%");
        style.set("margin-left", "30%");
        style.set("margin-right", "30%");
        return body;
    }

    default Component createBodyWithColor(String text, String color) {
        H3 body = new H3(text);
        Style style = body.getElement().getStyle();
        style.set("margin-top", "3%");
        style.set("margin-left", "30%");
        style.set("margin-right", "30%");
        style.set("color", color);
        return body;
    }

    default Component createWordTable(List<WordItem> list) {
        Grid<WordItem> grid = new Grid<>();
        Style style = grid.getElement().getStyle();
        style.set("margin-left", "5%");
        style.set("margin-right", "5%");
        style.set("height", "40em");
        ListDataProvider<WordItem> dataProvider = new ListDataProvider<>(list);
        grid.setDataProvider(dataProvider);
        Grid.Column<WordItem> englishNameColumn = grid
                .addColumn(WordItem::getEnglishName).setHeader("English");
        Grid.Column<WordItem> russianNameColumn = grid.addColumn(WordItem::getRussianName)
                .setHeader("Russian");
        Grid.Column<WordItem> transcriptionColumn = grid.addColumn(WordItem::getTranscription)
                .setHeader("Transcription");
        HeaderRow filterRow = grid.appendHeaderRow();

        // English filter
        TextField englishNameField = new TextField();
        englishNameField.addValueChangeListener(event -> dataProvider.addFilter(
                word -> StringUtils.containsIgnoreCase(word.getEnglishName(),
                        englishNameField.getValue())));
        englishNameField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(englishNameColumn).setComponent(englishNameField);
        englishNameField.setSizeFull();
        englishNameField.setPlaceholder("Поиск по английски");

        // Russian filter
        TextField russianNameField = new TextField();
        russianNameField.addValueChangeListener(event -> dataProvider
                .addFilter(word -> StringUtils.containsIgnoreCase(
                        String.valueOf(word.getRussianName()), russianNameField.getValue())));
        russianNameField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(russianNameColumn).setComponent(russianNameField);
        russianNameField.setSizeFull();
        russianNameField.setPlaceholder("Поиск по русски");

        // Transcription filter
        TextField transcriptionNameField = new TextField();
        transcriptionNameField.addValueChangeListener(event -> dataProvider
                .addFilter(word -> StringUtils.containsIgnoreCase(
                        word.getTranscription(), transcriptionNameField.getValue())));
        transcriptionNameField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(transcriptionColumn).setComponent(transcriptionNameField);
        transcriptionNameField.setSizeFull();
        transcriptionNameField.setPlaceholder("Поиск по транскрипции");
        return grid;
    }

    default Component createPhrasalVerbsTable(List<PhrasalVerbItem> list) {
        Grid<PhrasalVerbItem> grid = new Grid<>();
        Style style = grid.getElement().getStyle();
        style.set("height", "40em");
        ListDataProvider<PhrasalVerbItem> dataProvider = new ListDataProvider<>(list);
        grid.setDataProvider(dataProvider);
        Grid.Column<PhrasalVerbItem> englishNameColumn = grid
                .addColumn(PhrasalVerbItem::getEnglishName).setHeader("English");
        Grid.Column<PhrasalVerbItem> russianNameColumn = grid.addColumn(PhrasalVerbItem::getRussianName)
                .setHeader("Russian");
        Grid.Column<PhrasalVerbItem> exampleColumn = grid.addColumn(PhrasalVerbItem::getExample)
                .setHeader("Example");
        HeaderRow filterRow = grid.appendHeaderRow();

        // English filter
        TextField englishNameField = new TextField();
        englishNameField.addValueChangeListener(event -> dataProvider.addFilter(
                word -> StringUtils.containsIgnoreCase(word.getEnglishName(),
                        englishNameField.getValue())));
        englishNameField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(englishNameColumn).setComponent(englishNameField);
        englishNameField.setSizeFull();
        englishNameField.setPlaceholder("Поиск по английски");

        // Russian filter
        TextField russianNameField = new TextField();
        russianNameField.addValueChangeListener(event -> dataProvider
                .addFilter(word -> StringUtils.containsIgnoreCase(
                        String.valueOf(word.getRussianName()), russianNameField.getValue())));
        russianNameField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(russianNameColumn).setComponent(russianNameField);
        russianNameField.setSizeFull();
        russianNameField.setPlaceholder("Поиск по русски");

        // Transcription filter
        TextField exampleNameField = new TextField();
        exampleNameField.addValueChangeListener(event -> dataProvider
                .addFilter(word -> StringUtils.containsIgnoreCase(
                        word.getExample(), exampleNameField.getValue())));
        exampleNameField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(exampleColumn).setComponent(exampleNameField);
        exampleNameField.setSizeFull();
        exampleNameField.setPlaceholder("Поиск в примере");
        return grid;
    }

}

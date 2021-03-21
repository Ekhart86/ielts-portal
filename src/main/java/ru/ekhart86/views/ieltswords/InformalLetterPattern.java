package ru.ekhart86.views.ieltswords;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import ru.ekhart86.pdf.EmbeddedPdfDocument;
import ru.ekhart86.views.util.ComponentFactory;

@Route("informal-pattern")
public class InformalLetterPattern extends Div implements ComponentFactory {
    public InformalLetterPattern() {
        add(createHeaderContentBackToThemes("pattern-for-ielts", "Шаблон неформального письма"));
        add(new EmbeddedPdfDocument("frontend/informal-letter.pdf"));
        setHeight("100%");
    }
}
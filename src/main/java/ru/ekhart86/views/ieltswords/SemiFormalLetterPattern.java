package ru.ekhart86.views.ieltswords;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import ru.ekhart86.pdf.EmbeddedPdfDocument;
import ru.ekhart86.views.util.ComponentFactory;

@Route("semi-formal-pattern")
public class SemiFormalLetterPattern extends Div implements ComponentFactory {
    public SemiFormalLetterPattern() {
        add(createHeaderContentBackToThemes("pattern-for-ielts", "Шаблон полуформального письма"));
        add(new EmbeddedPdfDocument("frontend/a-letter-of-complaint.pdf"));
        setHeight("100%");
    }
}

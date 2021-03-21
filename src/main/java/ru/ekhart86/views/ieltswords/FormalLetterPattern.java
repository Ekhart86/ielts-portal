package ru.ekhart86.views.ieltswords;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import ru.ekhart86.pdf.EmbeddedPdfDocument;
import ru.ekhart86.views.util.ComponentFactory;

@Route("formal-pattern")
public class FormalLetterPattern extends Div implements ComponentFactory {
    public FormalLetterPattern() {
        add(createHeaderContentBackToThemes("pattern-for-ielts", "Шаблон формального письма"));
        add(new EmbeddedPdfDocument("frontend/a-letter-of-application.pdf"));
        setHeight("100%");
    }
}

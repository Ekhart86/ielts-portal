package ru.ekhart86.views.ieltswords;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("semi-formal-pattern")
public class SemiFormalLetterPattern extends Div implements ComponentFactory {
    public SemiFormalLetterPattern() {
        add(createHeaderContentBackToThemes("pattern-for-ielts", "Шаблон полуформального письма"));
        Component component = createPreText("Greeting \n\n" +
                "Dear Sir or Madam,\n\n" +
                "Paragraph 1- introduction\n" +
                "I am writing with regard to / in connection with ...\n" +
                "I am writing in the hope that ...\n" +
                "I would like to express my concern about ...\n" +
                "I am writing this letter to report … that I purchased from your company on\n" +
                "I am a resident of ... and I would like to draw your attention to ...\n" +
                "I enclose copies of the guarantee and the receipt.\n" +
                "My name is .. and I am one of your frequent customers.\n" +
                "I live in .. and I have been using your services and buying your products for the last .. years.\n\n" +
                "Paragraph 2\n" +
                "Максимально описываем товар или услугу\n\n" +
                "Paragraph 3\n" +
                "Рассказываем как произошло – фантазируем\n" +
                "I am exceedingly displeased with both the quality of product that\n" +
                "I purchased from your company as well as poor service\n" +
                "I have received since.\n" +
                "I hope this problem will be resolved promptly.\n\n" +
                "Paragraph 4\n" +
                "Наши требования\n" +
                "I would like you to refund my money. \n" +
                "Unless I receive a satisfactory reply, I will write to the Consumer Association.\n" +
                "I look forward to hearing from you.\n\n" +
                "Yours sincerely/ faithfully");
        add(component);
    }
}

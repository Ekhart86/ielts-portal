package ru.ekhart86.views.ieltswords;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("formal-pattern")
public class FormalLetterPattern extends Div implements ComponentFactory {
    public FormalLetterPattern() {
        add(createHeaderContentBackToThemes("pattern-for-ielts", "Шаблон формального письма"));
        Component component = createPreText("Greeting \n\n" +
                "Dear Sir or Madam,\n\n" +
                "Paragraph 1 \n" +
                "Почему пишем (2-4 предложения)\n" +
                "I am writing in connection with…\n" +
                "I am writing in response to/with regard to\n" +
                "I would like to express my interest in\n" +
                "I would like to apply for the position of… " +
                "I am a professional.." +
                "and I would like to join the campaign…\n\n" +
                "Paragraph 2\n" +
                "Раскрываем точки задания и говорим про себя\n" +
                "I am a professional…  I graduated from….\n" +
                "I attended in training courses specialized in…\n" +
                "I participated in – максимально фантазируем\n" +
                "In addition," +
                "Despite…,\n\n" +
                "Paragraph 3\n" +
                "Раскрываем оставшиеся пункты задания и плюс добавляем про себя\n" +
                "Due to my … qualifications, I could…\n" +
                "Apart from that, I am sure I would cope with other complicated situations, such as\n" +
                "I would be happy to\n\n" +
                "Paragraph 4\n" +
                "Пишем итоги и встречные вопросы\n" +
                "I enclose my CV and references from my previous employers\n" +
                "I would happy to attend an interview at your earliest convenience.\n" +
                "I would be grateful if you could inform me when you will be announcing the results of the applications.\n" +
                "I would also be interested to know the planned departure date\n" +
                "I look forward to hearing from you\n\n" +
                "Yours sincerely/faithfully");
        add(component);
    }
}

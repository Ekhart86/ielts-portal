package ru.ekhart86.views.ieltswords;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("informal-pattern")
public class InformalLetterPattern extends Div implements ComponentFactory {
    public InformalLetterPattern() {
        add(createHeaderContentBackToThemes("pattern-for-ielts", "Шаблон неформального письма"));
        Component component = createPreText(
                "Greetings — Приветствие\n\n" +
                "Hi \n" +
                "Hello David\n" +
                "Dear David\n" +
                "Hi более неформально, чем hello и dear.\n\n" +
                "2. Первый абзац — Opening paragraph\n" +
                "Наша реакция на полученную новость. Можно спросить как адресат себя чувствует.\n" +
                "— I am looking forward to going to the beach.\n" +
                "— Thanks a lot for writing back, I’m also very excited about visiting you!\n" +
                "— Nice to hear from you.\n" +
                "Допускается включать в первый абзац ответ на первый вопрос из письма.\n\n" +
                "Эмоции\n" +
                "Положительные\n" +
                "That’s really cool that your parents are letting you choose which video game you want to buy as a birthday gift.\n" +
                "It’s nice / great / good to read your email. \n" +
                "It’s nice / great / good to hear from you. \n" +
                "I’m glad to hear your news. \n" +
                "It’s great to hear that…\n" +
                "It was good to receive your email.\n" +
                "I think your new club is an excellent idea.\n" +
                "I can’t wait to go to the beach with you this Sunday.\n" +
                "I can’t wait to go to the theater with you this Friday.\n" +
                "I can’t wait to go to the cinema this Saturday.\n" +
                "I’m excited about… (your news)\n\n" +
                "Сочувствие\n" +
                "I’m sorry to hear that…\n" +
                "I’m really sorry to read your news.\n" +
                "Благодарность\n" +
                "Thank you for inviting me to help with the new English-language newspaper.\n" +
                "Thank you for getting me a ticket for the science festival. I am really excited about going to it!\n" +
                "Thanks a lot for writing! It’s great to hear from you.\n" +
                "Thank you very much for your email.\n" +
                "Nice to hear from you. I’d love to meet you so I can tell you…\n" +
                "\n" +
                "Спросить, как чувствует себя адресат\n" +
                "Hope you are doing well. \n" +
                "How’s it going? \n" +
                "How are you (doing)?\n" +
                "How are things (going)?\n\n" +
                "3. Основной абзац 1 — Main paragraph 1\n" +
                "Linking words\n" +
                "And\n" +
                "But\n" +
                "Because\n" +
                "Because of that\n" +
                "However\n" +
                "Moreover\n" +
                "As for/regarding\n" +
                "in case\n" +
                "Than\n" +
                "After that\n" +
                "This morning\n" +
                "Last summer\n\n" +
                "4. Основной абзац 2 — Main paragraph 2 \n" +
                "Отвечаем на оставшиеся пункты.\n\n" +
                "5. Заключительный абзац — Closing paragraph\n" +
                "В данном параграфе мы начинаем прощаться, желаем удачи и просим ответить на наше письмо.\n" +
                "Well, I have to go now, but please let me know what you think.\n" +
                "Well, it’s time to say goodbye. \n" +
                "I really hope to hear from you soon. \n" +
                "I hope you write back soon. \n" +
                "Make sure you write back soon.\n\n" +
                "6. Прощальное выражение\n" +
                "Мы используем короткие выражения, чтобы попрощаться.\n" +
                "See you on Friday,\n" +
                "See you soon, \n" +
                "Bye for new,\n" +
                "Take care,\n" +
                "Best wishes,\n" +
                "Best,\n" +
                "Sincerely, \n" +
                "All my love, \n" +
                "Love,\n" +
                "Lots of love, \n" +
                "Hope to see you next week?\n\n" +
                "7. Подпись\n" +
                "Roman");
        add(component);
    }
}
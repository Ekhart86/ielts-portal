package ru.ekhart86.views.themes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;
@Route("java-book")
public class BookTheme extends Div implements ComponentFactory {
    String imagePath = "images/java-book.jpeg";
    String imageAlt = "Фото парка";
    String topicName = "The last book which I read";
    String body = "Nowadays, It’s impossible to be an educated person without good books.\n" +
            "Most of the books are to be read just once, others can be read plenty of times.\n" +
            "I am fond of books about adventures and great people, detective stories and science fiction. \n" +
            "I enjoy reading them when I have spare time.\n" +
            "But more often lately I read technical literature that helps me in my work.\n" +
            "One of the last books which I read is \"the Java Philosophy\" by author Bruce Eckel.\n" +
            "This book explains in detail how correctly design and develop applications in the Java language.\n" +
            "Now, after reading this book, I involve this knowledge in practice.\n" +
            "This is the only way to remain a valuable employee in the modern world of software development.";
    public BookTheme() {
        add(createHeaderContentBackToThemes("themes", topicName));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header(topicName));
        verticalLayout.addAndExpand(createImage(imagePath, imageAlt));
        verticalLayout.addAndExpand(createBody(body));
        add(verticalLayout);
    }
}

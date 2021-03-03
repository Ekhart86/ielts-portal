package ru.ekhart86.views.themes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("apple-letter")
public class LetterForApple extends Div implements ComponentFactory {
    String imagePath = "images/apple.jpg";
    String imageAlt = "Фото мебели";
    String topicName = "Email to an HR manager at Apple";
    String bodyHeader = "Dear Apple Hiring Manager,";
    String bodyOne = "I am writing to apply for the Quality Assurance Automation Engineer.\n" +
            "I have more than three years of experience testing different kind of software, and my professional expertise aligns closely with the responsibilities outlined in your job advertisement.";
    String bodyTwo = "In my role as a quality assurance engineer, I have proven myself to be an effective and professional employee. This can be read in the recommendations in my resume. I am sure that my experience would be useful for Apple.\n" +
            "Your company is remaining a leader in developing innovative products for many years and I would like to be part of your team.";
    String bodyThree = "I can perform a test task for confirm my technical skills necessary for this position.\n" +
            "In the attachment to the letter is my resume with a detailed description of my skills and my work experience. If my candidacy seems acceptable to you do not hesitate to write me for discussing about next steps of hiring.\n" +
            "Thank you for your time and I am looking forward to answer from you!";
    String bodyEnd = "Respectfully, Roman Morozov";

    public LetterForApple() {
        add(createHeaderContentBackToThemes("themes", topicName));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH3Header(topicName));
        verticalLayout.addAndExpand(createImage(imagePath, imageAlt));
        verticalLayout.addAndExpand(createBody(bodyHeader));
        verticalLayout.addAndExpand(createBody(bodyOne));
        verticalLayout.addAndExpand(createBody(bodyTwo));
        verticalLayout.addAndExpand(createBody(bodyThree));
        verticalLayout.addAndExpand(createBody(bodyEnd));
        add(verticalLayout);
    }
}


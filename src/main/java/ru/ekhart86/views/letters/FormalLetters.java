package ru.ekhart86.views.letters;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("formal-letter")
public class FormalLetters extends Div implements ComponentFactory {
    public FormalLetters() {
        add(createHeaderContentBackToThemes("letters", "Формальные письма"));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(setLetterForApple());
        verticalLayout.addAndExpand(setTruckDriverLetter());
        add(verticalLayout);
    }

    private Div setLetterForApple() {
        VerticalLayout verticalLayout = new VerticalLayout();
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
        verticalLayout.addAndExpand(createH3Header(topicName));
        verticalLayout.addAndExpand(createBody(bodyHeader));
        verticalLayout.addAndExpand(createBody(bodyOne));
        verticalLayout.addAndExpand(createBody(bodyTwo));
        verticalLayout.addAndExpand(createBody(bodyThree));
        verticalLayout.addAndExpand(createBody(bodyEnd));
        Div div = createLetterDiv();
        div.add(verticalLayout);
        return div;
    }

    private Div setTruckDriverLetter() {
        VerticalLayout verticalLayout = new VerticalLayout();
        String topicName = "Letter in an employment agency";
        String bodyHeader = "Dear Sir or Madam,";
        String bodyOne = "I am writing to find new job opportunity for myself through your employment agency. I have lost my job in November because of pandemic and I found nothing yet.";
        String bodyTwo = "I had worked for 7 years as a truck driver before my company was closed due to financial problems. My driver's license is professional and contains a lot of different categories. I can drive any type of transport  for instance long vehicle truck or small pickup.";
        String bodyThree = "I would like to find job where require to work 40 hours a week. Company must provide me a medical insurance. The salary must be at least $ 25 per hour. Also essential to me is absence of overtime because my family  need my aid in the evenings.";
        String bodyEnd = "I believe that professionals from your agency help me fast to find new job. I'm ready for an interview from next week. If you require additional information, please, let me know.";
        String buyWords = "Yours faithfully, Roman Morozov";
        verticalLayout.addAndExpand(createH3Header(topicName));
        verticalLayout.addAndExpand(createBody(bodyHeader));
        verticalLayout.addAndExpand(createBody(bodyOne));
        verticalLayout.addAndExpand(createBody(bodyTwo));
        verticalLayout.addAndExpand(createBody(bodyThree));
        verticalLayout.addAndExpand(createBody(bodyEnd));
        verticalLayout.addAndExpand(createBody(buyWords));
        Div div = createLetterDiv();
        div.add(verticalLayout);
        return div;
    }
}

package ru.ekhart86.views.themes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("truck-driver")
public class TruckDriverLetter extends Div implements ComponentFactory {
    String imagePath = "images/truck-driver.jpg";
    String imageAlt = "Фото грузовика";
    String topicName = "Letter in an employment agency";
    String bodyHeader = "Dear Sir or Madam,";
    String bodyOne = "I am writing to find new job opportunity for myself through your employment agency. I have lost my job in November because of pandemic and I found nothing yet.";
    String bodyTwo = "I had worked for 7 years as a truck driver before my company was closed due to financial problems. My driver's license is professional and contains a lot of different categories. I can drive any type of transport  for instance long vehicle truck or small pickup.";
    String bodyThree = "I would like to find job where require to work 40 hours a week. Company must provide me a medical insurance. The salary must be at least $ 25 per hour. Also essential to me is absence of overtime because my family  need my aid in the evenings.";
    String bodyEnd = "I believe that professionals from your agency help me fast to find new job. I'm ready for an interview from next week. If you require additional information, please, let me know.";
    String buyWords = "Yours faithfully, Roman Morozov";

    public TruckDriverLetter() {
        add(createHeaderContentBackToThemes("themes"));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH3Header(topicName));
        verticalLayout.addAndExpand(createImage(imagePath, imageAlt));
        verticalLayout.addAndExpand(createBody(bodyHeader));
        verticalLayout.addAndExpand(createBody(bodyOne));
        verticalLayout.addAndExpand(createBody(bodyTwo));
        verticalLayout.addAndExpand(createBody(bodyThree));
        verticalLayout.addAndExpand(createBody(bodyEnd));
        verticalLayout.addAndExpand(createBody(buyWords));
        add(verticalLayout);
    }
}
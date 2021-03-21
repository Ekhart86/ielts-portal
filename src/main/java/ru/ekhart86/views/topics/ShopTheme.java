package ru.ekhart86.views.topics;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("shopping")
public class ShopTheme extends Div implements ComponentFactory {
    String imagePath = "images/shop.jpg";
    String imageAlt = "Фото торгового центра";
    String topicName = "Shopping";
    String body = "These days, people have the opportunity to visit many different stores. " +
            "Such as grocery stores, clothing stores, jewelry stores, and many others. " +
            "In large cities, there are large shopping centers that contain all these stores. " +
            "Often people go shopping to have fun and buy unnecessary things. " +
            "Stores have become a place of attraction for modern people. " +
            "As for me, I am an economical person and do not have the habit of spending money on useless things. " +
            "As a rule, before going to the store, I make a list of necessary purchases. " +
            "I also find out on the Internet which stores are currently holding promotions. " +
            "This allows me to buy products at the lowest possible prices. " +
            "I tend to think that useless purchases are not the best way to have fun. " +
            "It is much better to spend this money on education or travel. " +
            "Education will open the way to new opportunities in life. " +
            "Travel will bring a lot of positive emotions that will stay with you forever. " +
            "I hope that in the future people will become more conscious than they are now.";

    public ShopTheme() {
        add(createHeaderContentBackToThemes("themes", topicName));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header(topicName));
        verticalLayout.addAndExpand(createImage(imagePath, imageAlt));
        verticalLayout.addAndExpand(createBody(body));
        add(verticalLayout);
    }
}

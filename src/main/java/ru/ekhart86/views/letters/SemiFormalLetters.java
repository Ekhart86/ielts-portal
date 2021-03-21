package ru.ekhart86.views.letters;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("semi-formal-letter")
public class SemiFormalLetters extends Div implements ComponentFactory {
    public SemiFormalLetters() {
        add(createHeaderContentBackToThemes("letters", "Неформальные письма"));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(setLetterLostSuitCase());
        verticalLayout.addAndExpand(setLetterAboutFlyOnCake());
        verticalLayout.addAndExpand(setLetterAboutAbsenteeism());
        add(verticalLayout);
    }

    private Div setLetterLostSuitCase() {
        VerticalLayout verticalLayout = new VerticalLayout();
        String topicName = "Letter about a lost suitcase";
        String bodyHeader = "Dear Sir or Madam,";
        String bodyOne = "I am writing in connection with a luggage which I lost three days ago when I was flying on plane of your company from Toronto to Moscow.";
        String bodyTwo = "That was black suitcase on wheels with telescopic handle system which I bought last month with a price of USD 250.00. There were really valuable for me things When I was boarding on plane In Toronto I gave my suitcase to the airline staff as required by the rules.";
        String bodyThree = "However, after plane landing In Moscow, when I tried to get my baggage an airport employee said me that they cannot find my suitcase. He asked me to wait in the airport waiting room while they looking for my suitcase. I was waiting my luggage more than two hours but I don't received it. After that senior airport manager promised me that they definitely will find it and call me. It have been three days ago but nobody call me and I am starting to worry about my suitcase.";
        String bodyEnd = "Therefore, I request you to properly investigate  and I hope that your company will be able to find my suitcase. In the case if my luggage won’t find I'll be forced to demand from your company compensation in the amount of $ 3,000.";
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

    private Div setLetterAboutFlyOnCake() {
        VerticalLayout verticalLayout = new VerticalLayout();
        String topicName = "Letter of complaint about the fly on the cake";
        String bodyHeader = "Dear Sir or Madam,";
        String bodyOne = "I am writing in connection with the situation which happened on the last weekend. My wife and I were celebrating her birthday in your restaurant and we expected to have a good time.";
        String bodyTwo = "However, when the waiter brought the birthday cake we were shocked that on the top of it was a huge fly. Our celebration was failed, moreover, your workers even suggested nothing for apologize. We did not want to eat there anymore, therefore, we left this place as soon as possible. I hope that this terrible mistake happened randomly, and it is not whose horrible joke. In my opinion, employees in such cases must be maximally polite for customers, but all that we heard was just \"Sorry\".";
        String bodyThree = "I believe that your company appreciates its visitors and you do not want to ruin the reputation of restaurant. I am sure that I have right to require financial compensation from you for that incident. I ask you return my money which I spent on birthday celebration trough my bank account which I used for payment.";
        String bodyEnd = "Yours faithfully, Roman Morozov";
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

    private Div setLetterAboutAbsenteeism() {
        VerticalLayout verticalLayout = new VerticalLayout();
        String topicName = "Letter of absenteeism";
        String bodyHeader = "Dear Mr Connely,";
        String bodyOne = " I am writing to concern for the position of Quality Assurance Engineer that I am due to begin next week. Unfortunately, a trouble has emerged which does not allow me to do that.";
        String bodyTwo = "I have elderly grandmother who resides in the ramshackle house in the suburbs of Boston. She called me yesterday with a request about helping because I was the only one who could assist her. It was raining whole last week in that region. Due to the fact, that house has old roof, it does not protect from water anymore.  As a result, her house was completely flooded, so now it is impossible to live there without repairs.";
        String bodyThree = "I am going to start making repairs in the next few days, I expect it will take approximately two weeks.I hope it will not bring anything problems for your company. In the reason of this, I would like to ask you to keep that position for me until the end of the month. Rest assured, I will start work on the first day of next month.";
        String bodyEnd = "I look forward to hearing from you.";
        String buyWords = "Yours sincerely, Roman Morozov";
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

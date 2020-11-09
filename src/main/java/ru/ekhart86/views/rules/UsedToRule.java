package ru.ekhart86.views.rules;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;

@Route("used-to")
public class UsedToRule extends Div implements ComponentFactory {
    public UsedToRule() {
        add(createHeaderContentBackToThemes("rules"));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header("used to"));
        verticalLayout.addAndExpand(createBody("Конструкция used to используется для выражения повторяющихся действий в прошлом. " +
                "Used to имеет только одну форму прошедшего времени и не используется в других временах. " +
                "Значение конструкции used to может выражаться словами «раньше», «прежде», «раньше обычно»."));
        verticalLayout.addAndExpand(createBody("Утвердительное предложение образуется с помощью конструкции used to и простого инфинитива (первой формы) смыслового глагола."));
        verticalLayout.addAndExpand(createBodyWithColor("Kate used to go to school by bike. – Кэйт обычно ездила в школу на велосипеде.", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Отрицательное предложение образуется с помощью вспомогательного глагола did, " +
                "после которого используется use to в форме настоящего времени и простой инфинитив смыслового глагола."));
        verticalLayout.addAndExpand(createBodyWithColor("I didn’t use to learn French. – Раньше я не учил французский.", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Вопросительное предложение с used to образуется с помощью вспомогательного глагола did, " +
                "который выносится в начало предложения. "));
        verticalLayout.addAndExpand(createBodyWithColor("Did he use to do sports? – Он раньше занимался спортом?", "DarkGreen"));
        verticalLayout.addAndExpand(createH2Header("would"));
        verticalLayout.addAndExpand(createBody("Глагол would, как и конструкция used to, выражает повторяющееся действие в прошлом. " +
                "Однако would употребляется только в том случае, когда есть привязка к какому-то конкретному времени." +
                "Глагол would добавляет оттенок ностальгии в теплые воспоминания о прошлом."));
        verticalLayout.addAndExpand(createBodyWithColor("Every time Sarah came, we would play X-box for hours. — " +
                "Каждый раз, когда приходила Сара, мы часами играли в X-box.", "DarkGreen"));
        verticalLayout.addAndExpand(createBody("Чтобы задать вопрос, поставьте глагол would в начало предложения."));
        verticalLayout.addAndExpand(createBodyWithColor("Would you play hide-and-seek when you were a kid? — Ты играл в прятки, когда был маленьким?", "DarkGreen"));
        verticalLayout.addAndExpand(createH2Header("be used to"));
        verticalLayout.addAndExpand(createBody("Конструкция be used to описывает привычку, которая уже сформировалась"));
        verticalLayout.addAndExpand(createBodyWithColor("They are used to sleeping outdoors. — Они привыкли спать на улице.", "DarkGreen"));
        verticalLayout.addAndExpand(createH2Header("get used to"));
        verticalLayout.addAndExpand(createBody("Конструкция get used to описывает процесс приобретения привычки"));
        verticalLayout.addAndExpand(createBodyWithColor("I find it hard to get used to new conditions. — Мне трудно привыкать к новым условиям.", "DarkGreen"));
        add(verticalLayout);
    }
}

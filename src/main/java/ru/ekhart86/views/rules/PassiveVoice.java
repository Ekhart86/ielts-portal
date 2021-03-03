package ru.ekhart86.views.rules;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.ekhart86.views.util.ComponentFactory;
@Route("passive-voice")
public class PassiveVoice extends Div implements ComponentFactory {

    public PassiveVoice() {
        add(createHeaderContentBackToThemes("rules", ""));
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addAndExpand(createH2Header("Passive voice"));
        verticalLayout.addAndExpand(createImage("images/passive-voice/passive_voice-01.jpg", "passive voice 1"));
        verticalLayout.addAndExpand(createImage("images/passive-voice/passive_voice-02.jpg", "passive voice 2"));
        verticalLayout.addAndExpand(createImage("images/passive-voice/passive_voice-03.jpg", "passive voice 3"));
        add(verticalLayout);
    }
}

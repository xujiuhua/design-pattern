package com.behavior.mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {

    private Mediator mediator;

    public ColleagueCheckbox(String label, CheckboxGroup group, boolean state) throws HeadlessException {
        super(label, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean enabled) {
        setEnabled(enabled);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}

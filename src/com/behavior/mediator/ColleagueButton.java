package com.behavior.mediator;

import com.creator.builder.Builder;

import java.awt.*;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String label) throws HeadlessException {
        super(label);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean enabled) {
        setEnabled(enabled);
    }
}

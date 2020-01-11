package com.behavior.mediator;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public interface Colleague {
    void setMediator(Mediator mediator);

    void setColleagueEnable(boolean enabled);
}

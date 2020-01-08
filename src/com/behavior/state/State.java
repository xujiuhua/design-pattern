package com.behavior.state;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public interface State {
    void doClock(Context context, int hour);

    void doUse(Context context);

    void doAlert(Context context);
}

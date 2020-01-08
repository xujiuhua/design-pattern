package com.behavior.state;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class NightState implements State {

    private static final NightState instance = new NightState();

    private NightState() {
    }

    public static State getInstance() {
        return instance;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急: 晚上使用金库");
    }

    @Override
    public void doAlert(Context context) {
        context.callSecurityCenter("按下警铃，晚上");
    }
}

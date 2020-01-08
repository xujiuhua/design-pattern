package com.behavior.state;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class DayState implements State{

    private static final DayState instance = new DayState();

    private DayState() {
    }

    public static State getInstance() {
        return instance;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || hour >= 17) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库，白天");
    }

    @Override
    public void doAlert(Context context) {
        context.callSecurityCenter("按下警铃，白天");
    }
}

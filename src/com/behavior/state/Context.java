package com.behavior.state;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public interface Context {
    /**
     * 设置时间
     * @param hour
     */
    void setClock(int hour);

    /**
     * 改变状态
     * @param state
     */
    void changeState(State state);

    void callSecurityCenter(String msg);

    void recordLog(String msg);
}

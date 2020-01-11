package com.behavior.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class LoginFrame extends Frame implements ActionListener, Mediator {

    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4, 2));
        createColleagues();

        // 配置
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);

        // 初始
        colleagueChanged();

        pack();
        setVisible(true);
    }


    @Override
    public void createColleagues() {

        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        buttonOk = new ColleagueButton("Ok");
        buttonCancel = new ColleagueButton("Cancel");

        // 设置Mediator
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        // 设置Listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            textUser.setColleagueEnable(false);
            textPass.setColleagueEnable(false);
            buttonOk.setColleagueEnable(true);
        } else {
            textUser.setColleagueEnable(true);
            userpassChanged();
        }
    }

    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnable(true);
            if (textPass.getText().length() > 0) {
                buttonOk.setColleagueEnable(true);
            } else {
                buttonOk.setColleagueEnable(false);
            }
        } else {
            textPass.setColleagueEnable(false);
            buttonOk.setColleagueEnable(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}

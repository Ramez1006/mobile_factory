package com.mobileapp.factory;

import com.mobileapp.components.Button;
import com.mobileapp.components.TextField;
import com.mobileapp.components.Window;
import com.mobileapp.components.ios.IosButton;
import com.mobileapp.components.ios.IosTextField;
import com.mobileapp.components.ios.IosWindow;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public TextField createTextField() {
        return new IosTextField();
    }

    @Override
    public Window createWindow() {
        return new IosWindow();
    }
}

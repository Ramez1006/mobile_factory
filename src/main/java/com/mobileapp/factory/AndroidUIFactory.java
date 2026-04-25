package com.mobileapp.factory;

import com.mobileapp.components.Button;
import com.mobileapp.components.TextField;
import com.mobileapp.components.Window;
import com.mobileapp.components.android.AndroidButton;
import com.mobileapp.components.android.AndroidTextField;
import com.mobileapp.components.android.AndroidWindow;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public TextField createTextField() {
        return new AndroidTextField();
    }

    @Override
    public Window createWindow() {
        return new AndroidWindow();
    }
}

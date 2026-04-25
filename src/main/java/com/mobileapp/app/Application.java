package com.mobileapp.app;

import com.mobileapp.components.Button;
import com.mobileapp.components.TextField;
import com.mobileapp.components.Window;
import com.mobileapp.factory.UIFactory;

public class Application {
    private Button button;
    private TextField textField;
    private Window window;

    public Application(UIFactory factory) {
        this.button = factory.createButton();
        this.textField = factory.createTextField();
        this.window = factory.createWindow();
    }

    public void renderUI() {
        window.render();
        textField.render();
        button.render();
    }
}

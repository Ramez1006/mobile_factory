package com.mobileapp.factory;

import com.mobileapp.components.Button;
import com.mobileapp.components.TextField;
import com.mobileapp.components.Window;

public interface UIFactory {
    Button createButton();
    TextField createTextField();
    Window createWindow();
}

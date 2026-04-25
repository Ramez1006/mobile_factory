package com.mobileapp.components.android;

import com.mobileapp.components.Window;

public class AndroidWindow implements Window {
    @Override
    public void render() {
        System.out.println("Renderizando Janela no estilo Material Design (Android).");
    }
}

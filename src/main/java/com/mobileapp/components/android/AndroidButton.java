package com.mobileapp.components.android;

import com.mobileapp.components.Button;

public class AndroidButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando Botão no estilo Material Design (Android).");
    }
}

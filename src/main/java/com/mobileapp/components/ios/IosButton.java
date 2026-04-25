package com.mobileapp.components.ios;

import com.mobileapp.components.Button;

public class IosButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando Botão no estilo Cupertino (iOS).");
    }
}

package com.mobileapp.components.ios;

import com.mobileapp.components.Window;

public class IosWindow implements Window {
    @Override
    public void render() {
        System.out.println("Renderizando Janela no estilo Cupertino (iOS).");
    }
}

package com.mobileapp.app;

import com.mobileapp.factory.AndroidUIFactory;
import com.mobileapp.factory.IosUIFactory;
import com.mobileapp.factory.UIFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Iniciando Aplicativo Mobile ---");

        // Simulação de escolha de plataforma
        String os = System.getProperty("os.name").toLowerCase();
        UIFactory factory;

        // Para fins de demonstração, vamos alternar manualmente ou via argumento
        String targetPlatform = (args.length > 0) ? args[0] : "android";

        System.out.println("Plataforma selecionada: " + targetPlatform.toUpperCase());

        if (targetPlatform.equalsIgnoreCase("ios")) {
            factory = new IosUIFactory();
        } else {
            factory = new AndroidUIFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
        
        System.out.println("--- Interface renderizada com sucesso ---");
    }
}

# Projeto Mobile UI com Abstract Factory

Este projeto demonstra a implementação do padrão de design **Abstract Factory** em Java para gerenciar a criação de componentes de interface de usuário (UI) para diferentes plataformas móveis, especificamente Android e iOS. O objetivo é garantir que os componentes utilizados sejam sempre consistentes com a plataforma escolhida, evitando o acoplamento a classes concretas e permitindo a alternância transparente entre as plataformas.

## Enunciado do Problema

Uma empresa está desenvolvendo um aplicativo mobile que precisa oferecer suporte às plataformas Android e iOS. Cada plataforma possui sua própria família de componentes visuais, como Botão, Campo de Texto e Janela. O sistema deve garantir que os componentes utilizados sejam sempre consistentes com a plataforma escolhida (ex: componentes Android não devem ser misturados com iOS).

## Solução Proposta: Padrão Abstract Factory

O padrão Abstract Factory é ideal para este cenário, pois permite criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. Isso significa que podemos ter uma fábrica para componentes Android e outra para componentes iOS, e o cliente (neste caso, a aplicação mobile) interage apenas com a interface da fábrica abstrata, sem conhecer os detalhes de implementação específicos de cada plataforma.

### Estrutura do Padrão

1.  **Interfaces de Componentes (Produtos Abstratos):** Definem os métodos para cada tipo de componente (ex: `Button`, `TextField`, `Window`).
2.  **Componentes Concretos (Produtos Concretos):** Implementações específicas dos componentes para cada plataforma (ex: `AndroidButton`, `IosButton`).
3.  **Interface da Fábrica Abstrata (`UIFactory`):** Declara um conjunto de métodos para criar cada tipo de componente abstrato.
4.  **Fábricas Concretas (`AndroidUIFactory`, `IosUIFactory`):** Implementam a interface da fábrica abstrata para criar componentes específicos de uma plataforma.
5.  **Cliente (`Application`):** Utiliza a interface da fábrica abstrata para criar os componentes, sem se preocupar com a plataforma específica.

## Estrutura do Projeto

```
mobile_factory/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── mobileapp/
                    ├── app/
                    │   ├── Application.java
                    │   └── Main.java
                    ├── components/
                    │   ├── Button.java
                    │   ├── TextField.java
                    │   └── Window.java
                    ├── components/android/
                    │   ├── AndroidButton.java
                    │   ├── AndroidTextField.java
                    │   └── AndroidWindow.java
                    ├── components/ios/
                    │   ├── IosButton.java
                    │   ├── IosTextField.java
                    │   └── IosWindow.java
                    └── factory/
                        ├── AndroidUIFactory.java
                        ├── IosUIFactory.java
                        └── UIFactory.java
```

## Classes e Interfaces

### Interfaces de Componentes (Produtos Abstratos)

-   `com.mobileapp.components.Button.java`
-   `com.mobileapp.components.TextField.java`
-   `com.mobileapp.components.Window.java`

Cada interface define um método `render()` para simular a exibição do componente.

### Componentes Concretos (Produtos Concretos)

**Android:**

-   `com.mobileapp.components.android.AndroidButton.java`
-   `com.mobileapp.components.android.AndroidTextField.java`
-   `com.mobileapp.components.android.AndroidWindow.java`

**iOS:**

-   `com.mobileapp.components.ios.IosButton.java`
-   `com.mobileapp.components.ios.IosTextField.java`
-   `com.mobileapp.components.ios.IosWindow.java`

Cada classe implementa a interface correspondente e fornece uma implementação específica de `render()` para sua plataforma.

### Interface da Fábrica Abstrata

-   `com.mobileapp.factory.UIFactory.java`

Define os métodos para criar cada tipo de componente: `createButton()`, `createTextField()`, `createWindow()`.

### Fábricas Concretas

-   `com.mobileapp.factory.AndroidUIFactory.java`
-   `com.mobileapp.factory.IosUIFactory.java`

Implementam `UIFactory` e retornam instâncias dos componentes concretos para Android e iOS, respectivamente.

### Cliente

-   `com.mobileapp.app.Application.java`

Recebe uma `UIFactory` em seu construtor e utiliza-a para criar os componentes. O método `renderUI()` demonstra como os componentes são utilizados de forma agnóstica à plataforma.

-   `com.mobileapp.app.Main.java`

Classe principal para demonstração. Ela simula a escolha da plataforma (Android ou iOS) e cria a fábrica apropriada. Em seguida, uma instância de `Application` é criada com essa fábrica, e a UI é renderizada. A escolha da plataforma pode ser feita passando `ios` como argumento na linha de comando, caso contrário, `android` será o padrão.

## Benefícios do Abstract Factory neste Contexto

-   **Consistência:** Garante que todos os componentes criados por uma fábrica concreta pertençam à mesma família (Android ou iOS), evitando misturas indesejadas.
-   **Flexibilidade:** Permite alternar facilmente entre diferentes famílias de produtos (plataformas) com uma única mudança na fábrica concreta utilizada.
-   **Baixo Acoplamento:** O código cliente (`Application`) depende apenas das interfaces abstratas dos produtos e da fábrica, não das implementações concretas. Isso facilita a manutenção e a adição de novas plataformas no futuro.
-   **Escalabilidade:** Adicionar suporte a uma nova plataforma (ex: Windows Mobile) envolveria apenas a criação de novas classes de componentes concretos e uma nova fábrica concreta, sem a necessidade de modificar o código existente do cliente.



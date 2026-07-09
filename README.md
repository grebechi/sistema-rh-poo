# 🏢 Sistema de Pagamento de Bônus (RH Tech)

Este é um projeto prático desenvolvido em **Java** com o objetivo principal de demonstrar a aplicação clara e direta dos três pilares fundamentais da **Programação Orientada a Objetos (POO)**.

## 🎯 Objetivo do Exercício

O intuito deste sistema não é a complexidade de regras de negócio, mas sim a **clareza didática**. Ele simula o cálculo da folha de pagamento e do bônus anual para diferentes cargos de uma empresa de tecnologia (Desenvolvedores, Gerentes e Suporte).

Através desse cenário do mundo real, o código prova como a POO ajuda a criar sistemas mais seguros, com reaproveitamento de código e comportamentos dinâmicos.

---

## 🧠 Os 3 Pilares da POO Aplicados

Neste projeto, os fundamentos da Orientação a Objetos foram aplicados da seguinte forma:

### 1. 🛡️ Encapsulamento (Proteção de Dados)
Na classe base `Funcionario`, os atributos `nome` e `salario` foram declarados como `private`. Isso garante que nenhuma parte externa do sistema possa alterar o salário de um funcionário de forma acidental ou maliciosa. A leitura desses dados só é feita através dos métodos seguros (`Getters`).

### 2. 🧬 Herança (Reaproveitamento de Código)
Para não precisarmos reescrever os atributos de nome e salário para cada novo cargo da empresa, criamos as classes `Desenvolvedor` e `Gerente` que **herdam** (usam a palavra-chave `extends`) da classe base `Funcionario`. Eles herdam as características do pai, economizando linhas de código e facilitando a manutenção.

### 3. 🎭 Polimorfismo (Múltiplas Formas)
A regra de negócios diz que cada cargo recebe uma porcentagem diferente de bônus. Usamos o polimorfismo para **sobrescrever** (anotação `@Override`) o método `calcularBonus()` nas classes filhas.
Na classe `Main`, criamos um método único (`exibirFolhaDePagamento`) que aceita qualquer tipo de Funcionário, mas na hora de executar, o Java sabe exatamente qual cálculo aplicar dependendo do cargo daquela pessoa!

---

## 📂 Estrutura do Código

O projeto é composto por 4 classes simples:

* `Funcionario.java`: A classe base (superclasse). Contém os atributos privados e o cálculo padrão de 10% de bônus.
* `Desenvolvedor.java`: Classe filha. Sobrescreve o bônus para 15%.
* `Gerente.java`: Classe filha. Sobrescreve o bônus para 20% + um valor fixo de R$ 1.000,00.
* `Main.java`: A classe principal que executa o programa, instancia os objetos e exibe o resultado no console.
# 📚 Estudos Java — Fundamentos

Repositório dedicado aos exercícios práticos da **Fase 1** do meu aprendizado em Java, focado em lógica de programação, estruturas de controle, coleções e organização de código.

---

## 🎯 Objetivo

Construir uma base sólida em Java antes de avançar para Orientação a Objetos, Spring Boot. Todos os exercícios foram desenvolvidos do zero, com foco em entender o raciocínio por trás de cada solução.

---

## 🛠️ Tecnologias

- Java 8 (OpenJDK - Red Hat)
- Visual Studio Code
- Extension Pack for Java (Microsoft)

---

## 📂 Estrutura do Projeto

```
estudos-java/
└── src/
    ├── Numeros.java                    # Verificador de número inteiros
    ├── Taboada.java                    # Tabuada (somente números par)
    ├── Seguranca_senha.java            # Analisador de senha
    ├── Temperaatura.java               # Conversor de temperatura
    ├── Adivinhacao.java                # Jogo de adivinhação
    ├── Calculadora.java                # Calculadora com menu
    ├── Agenda_de_contato.java          # Agenda de contatos
    ├── Analisador_de_texto.java        # Analisador de texto
    ├── Carrinho_de_compra.java         # Carrinho de compras
    └── Menu_principal.java             # Menu unificado — Projeto Final
```

---

## 📝 Exercícios

### 1. Verificador de Número
Lê um número inteiro e informa se é positivo/negativo/zero, par/ímpar e divisível por 3.

**Conceitos praticados:** `Scanner`, condicionais `if/else`, operador módulo `%`

---

### 2. Tabuada Personalizada
Exibe a tabuada de um número de 1 a 10, mostrando apenas os resultados pares.

**Conceitos praticados:** laço `for`, filtragem com condicionais

---

### 3. Analisador de Senha
Valida uma senha verificando tamanho, letra maiúscula, letra minúscula, número e caractere especial. Fica em loop até o usuário digitar uma senha forte.

**Conceitos praticados:** `while`, expressões regulares (`matches`), `String.length()`

---

### 4. Conversor de Temperatura
Converte uma temperatura de Celsius para Fahrenheit e Kelvin.

**Conceitos praticados:** tipo `double`, operações aritméticas com ponto flutuante

---

### 5. Jogo de Adivinhação
O programa sorteia um número entre 1 e 100 e dá dicas de "muito alto" ou "muito baixo" até o usuário acertar. Conta o número de tentativas.

**Conceitos praticados:** `Random`, `while`, contadores

---

### 6. Calculadora com Menu
Calculadora completa com adição, subtração, multiplicação e divisão. Trata divisão por zero e fica em loop até o usuário sair.

**Conceitos praticados:** `switch`, loop com menu, tratamento de casos especiais

---

### 7. Agenda de Contatos
Permite adicionar, buscar e listar contatos (nome e telefone) durante a execução do programa.

**Conceitos praticados:** `ArrayList<String>`, `for-each`, `toLowerCase`, busca parcial

---

### 8. Analisador de Texto
Analisa uma frase informando quantidade de palavras, caracteres sem espaços, palavra mais longa e frequência de uma letra escolhida pelo usuário.

**Conceitos praticados:** `String.split()`, `String.replace()`, `charAt()`, laços de iteração

---

### 9. Carrinho de Compras
Simula um carrinho com adição de produtos, listagem, cálculo de total e aplicação de desconto percentual.

**Conceitos praticados:** `ArrayList`, parsing de String com `split()`, `Double.parseDouble()`

---

### 🏁 Projeto Final — Menu Principal
Integra todos os exercícios em um único menu interativo, onde o usuário escolhe qual módulo executar. Cada exercício foi refatorado como um método estático `executar(Scanner sc)` em sua própria classe.

**Conceitos praticados:** organização em classes, métodos estáticos, passagem de parâmetros, arquitetura modular

---

## 🚀 Como Executar

1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/estudos-java.git
```

2. Abra no VS Code com o **Extension Pack for Java** instalado

3. Execute `Menu_principal.java` para acessar todos os exercícios pelo menu

---

## 📈 Próximos Passos — Fase 2

- Orientação a Objetos (classes, objetos, herança, encapsulamento)
- Coleções avançadas
- Introdução ao Spring Boot
- APIs REST
- SQL e conexão com banco de dados

> **Foco:** O objetivo principal é back-end com Java. O aprendizado é 100% orientado para o mercado de trabalho nessa área, construindo uma base sólida antes de qualquer expansão para outras tecnologias.

---

## 👨‍💻 Autor

**Yuri** — estudante de Ciência da Computação com foco em desenvolvimento back-end Java.

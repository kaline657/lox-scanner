# Lox Scanner – Unidade 3 (Parte 1)

Repositório contendo a implementação da Parte 1 da Unidade 3 do curso baseado no livro *Crafting Interpreters*.

## 👩‍💻 Desenvolvido por:
**Kaline Maria Carvalho**  
GitHub: [kaline657](https://github.com/kaline657)

---

## 📘 Referência:
Capítulos 8 e 9 do livro *Crafting Interpreters*  
- Capítulo 8: **Statements and State**  
- Capítulo 9: **Control Flow**

---

## ✅ Funcionalidades implementadas:

### ✅ Interface e estrutura principal
- Implementação da interface `Stmt.Visitor<T>`
- Ampliação da classe `Interpreter`

### ✅ Execução das instruções:
- `print` – impressão de valores na tela
- `var` – declaração de variáveis
- `block` – blocos de escopo
- `if` – condicionais (estrutura de controle de fluxo)

---

## 📁 Estrutura da pasta `lox/`:
- `Interpreter.java` – interpretação e execução das instruções
- `Environment.java` – controle de escopo e armazenamento de variáveis
- `Expr.java` / `Stmt.java` – representações da árvore sintática
- `Token.java`, `TokenType.java` – estrutura de tokens

---

## 💻 Execução
Compile e execute os arquivos Java manualmente ou via terminal:

```bash
javac lox/*.java
java lox.Lox

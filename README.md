# Herança e Polimorfismo em Java

Projeto de estudo de Programação Orientada a Objetos (POO) em Java, usando herança, classe abstrata e polimorfismo.

O programa já tem alguns funcionários cadastrados no código. Ele mostra os dados de cada um no console, calcula a bonificação de cada cargo e soma o total.

## Estrutura

```
src/
├── App/
│   └── ProgramaFuncionario.java
├── Model/
│   ├── Funcionario.java
│   ├── Programador.java
│   ├── Gerente.java
│   ├── Diretor.java
│   └── Estagiario.java
└── Services/
    └── ControledeBonificacao.java
```

## Classes

- **Funcionario**: classe abstrata com nome, CPF, salário e a porcentagem da bonificação.
- **Programador**: herda de Funcionario e tem a linguagem.
- **Gerente**: herda de Funcionario, tem senha e o método `autentica()`.
- **Diretor**: herda de Gerente.
- **Estagiario**: herda de Funcionario e tem a instituição.
- **ControledeBonificacao**: soma a bonificação de todos os funcionários.
- **ProgramaFuncionario**: classe com o `main`.

```
           Funcionario
         /      |      \
Programador  Gerente  Estagiario
                |
             Diretor
```

## Bonificação

A bonificação é uma porcentagem do salário. A porcentagem é o último valor passado quando o funcionário é criado no `main`, então é só mudar ali:

```java
Diretor diretor = new Diretor("Carla", "333.333.333-33", 15000, 9999, 45);
```

| Cargo       | Porcentagem |
|-------------|-------------|
| Programador | 10%         |
| Gerente     | 15%         |
| Diretor     | 45%         |
| Estagiário  | 10%         |

## O que foi usado

- Classe abstrata e métodos abstratos (`getBonificacao()` e `getCargo()`)
- Herança com `extends` e `super`
- Sobrescrita de métodos com `@Override`
- Polimorfismo: o `registra(Funcionario f)` aceita qualquer tipo de funcionário
- `ArrayList` para guardar os funcionários

## Como rodar

No NetBeans: **File → Open Project**, abrir a pasta do projeto e apertar **F6**. O resultado aparece na aba **Output**.

Pelo terminal (dentro da pasta do projeto):

```powershell
javac -encoding UTF-8 -d out src\Model\*.java src\Services\*.java src\App\*.java
java -cp out App.ProgramaFuncionario
```

## Feito com

- Apache NetBeans 30
- JDK 26
- Projeto configurado em Java 17

## Saída

```
===== FUNCIONÁRIOS =====
Cargo: Programador
Nome: Matheus Magri
CPF: 119.741.906-33
Salário: R$ 10000.0
Bonificação (10.0%): R$ 1000.0
Linguagem: Java
------------------------------
Cargo: Gerente
Nome: Bruno
CPF: 222.222.222-22
Salário: R$ 8000.0
Bonificação (15.0%): R$ 1200.0
------------------------------
Cargo: Diretor
Nome: Carla
CPF: 333.333.333-33
Salário: R$ 15000.0
Bonificação (45.0%): R$ 6750.0
------------------------------
Cargo: Estagiário
Nome: Diego
CPF: 444.444.444-44
Salário: R$ 1500.0
Bonificação (10.0%): R$ 150.0
Instituição: FATEC
------------------------------
Total de bonificações: R$ 9100.0

===== LOGIN =====
Gerente Bruno: acesso permitido
Diretor Carla: acesso negado
```

## Autor

Matheus Silva Magri

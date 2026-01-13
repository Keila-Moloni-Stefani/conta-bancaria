# Conta Banco - Desafio DIO

Projeto desenvolvido como parte do desafio da Formação Java Developer na plataforma DIO (Digital Innovation One).

## Descrição

Este projeto simula a criação de uma conta bancária através do terminal/console, onde o usuário insere seus dados e recebe uma mensagem de confirmação com todas as informações cadastradas.

## Objetivo

Praticar os fundamentos da linguagem Java, incluindo:
- Sintaxe básica
- Tipos de variáveis
- Entrada de dados via terminal
- Uso da classe Scanner
- Concatenação de Strings
- Formatação de saída

## Tecnologias Utilizadas

- Java JDK 8+
- Visual Studio Code (ou IDE de sua preferência)

## Estrutura do Projeto

```
conta-banco/
│
├── src/
│   └── ContaTerminal.java
│
└── README.md
```

## Como Executar

### Pré-requisitos

- JDK (Java Development Kit) instalado
- Terminal/Prompt de comando

### Passos para execução

1. Clone ou faça download do repositório

2. Navegue até a pasta do projeto:
```bash
cd conta-banco/src
```

3. Compile o arquivo Java:
```bash
javac ContaTerminal.java
```

4. Execute o programa:
```bash
java ContaTerminal
```

5. Siga as instruções no terminal e insira os dados solicitados

## Exemplo de Uso

```
Por favor, digite o número da Conta:
1021

Por favor, digite o número da Agência:
067-8

Por favor, digite o nome do Cliente:
MARIO ANDRADE

Por favor, digite o saldo:
237.48

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque
```

## Atributos da Conta

| Atributo | Tipo | Exemplo |
|----------|------|---------|
| Numero | Integer | 1021 |
| Agencia | String | 067-8 |
| Nome Cliente | String | MARIO ANDRADE |
| Saldo | Double | 237.48 |

## Conceitos Aplicados

- **Declaração de variáveis**: Uso correto dos tipos de dados (int, String, double)
- **Classe Scanner**: Captura de dados inseridos pelo usuário via terminal
- **Método concat()**: Concatenação de Strings
- **String.format()**: Formatação de valores decimais
- **Locale**: Configuração para aceitar entrada de números com ponto decimal

## Licença

Este projeto foi desenvolvido para fins educacionais como parte do desafio da DIO.

---
## Desenvolvedor

Desenvolvido por Keila Moloni Stefani

⭐ Se este projeto foi útil para você, considere dar uma estrela!

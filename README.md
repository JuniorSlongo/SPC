# Sistema de Liberação de Crédito - Padrão Chain of Responsibility

Este projeto implementa o padrão Chain of Responsibility para simular o processo de liberação de crédito em um banco.

## Padrão Chain of Responsibility

O padrão Chain of Responsibility é um padrão de design comportamental que permite que um conjunto de objetos processe uma solicitação. Este padrão desacopla o remetente e o receptor de uma solicitação com base no tipo de solicitação. No nosso caso, a solicitação é a verificação de um cliente para a liberação de crédito.

## Como funciona

Temos uma interface `Verificacao` que define a estrutura para as classes de verificação. Cada classe de verificação implementa essa interface e define sua própria lógica de verificação.

As classes de verificação são:

- `VerificacaoCredito`: Verifica a disponibilidade de crédito.
- `VerificacaoRenda`: Verifica a compatibilidade da renda com o valor do financiamento.
- `VerificacaoHistorico`: Verifica o histórico de crédito do cliente.
- `VerificacaoGarantia`: Verifica se o cliente possui algum bem que possa ser dado como garantia.

Cada classe de verificação tem uma referência à próxima classe de verificação na cadeia. Se uma classe de verificação puder processar a solicitação, ela faz isso e passa a solicitação para a próxima classe de verificação na cadeia.

## Uso

Para usar este sistema, você precisa criar um objeto `Cliente` e definir suas propriedades. Em seguida, você cria a cadeia de verificação e chama o método `verificar` na primeira classe de verificação na cadeia, passando o cliente como argumento.

```java
Verificacao verificacao = new VerificacaoCredito();
verificacao.setNext(new VerificacaoRenda());
verificacao.setNext(new VerificacaoHistorico());
verificacao.setNext(new VerificacaoGarantia());

Cliente cliente = new Cliente();
// Definir propriedades do cliente

verificacao.verificar(cliente);
```
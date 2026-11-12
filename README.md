# Simulador de parcelas de contratos

Aplicação de console em Java para calcular parcelas de um contrato a partir de seu valor, data e quantidade de prestações.

## Funcionalidades

- Leitura dos dados do contrato pelo terminal.
- Geração das datas de vencimento e valores das parcelas.
- Separação entre entidades, processamento do contrato e cálculo de taxas.
- Estratégia de pagamento definida pela interface OnlinePaymentService.

## Executar

Requer JDK 17 ou compatível com as APIs utilizadas.

```bash
javac -encoding UTF-8 -d out src/application/Program.java src/entities/*.java src/services/*.java
java -cp out application.Program
```

Informe datas no formato dd/MM/yyyy e valores com ponto decimal.

## Organização

- `entities/`: contratos e parcelas.
- `services/`: processamento e estratégia de taxas.
- `application/Program.java`: entrada pelo terminal.

## Escopo

Exercício de orientação a objetos e injeção de dependências. A classe PaypalService simula regras de cobrança: não realiza chamadas à API do PayPal nem gera documentos de contrato.

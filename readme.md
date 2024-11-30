# Projeto de Financiamento

Este projeto calcula e gera um relatório de financiamentos de imóveis.

## Estrutura do Projeto

- `Main.java`: Classe principal que executa o programa.
- `Financing.java`: Classe que representa um financiamento.
- `UserInterface.java`: Classe que lida com a entrada do usuário.
- `Report.java`: Classe que gera o relatório dos financiamentos.

## Como Executar

1. Compile todas as classes Java:

   ```sh
   javac Main.java Financing.java UserInterface.java Report.java
   ```

2. Execute a classe principal:
   ```sh
   java Main
   ```

## Funcionalidades

- Entrada de dados do usuário para valor do imóvel, prazo do financiamento e taxa de juros anual.
- Cálculo do valor da parcela mensal e do valor total pago.
- Geração de um relatório com os detalhes dos financiamentos e os totais.

## Exemplo de Uso

Ao executar o programa, o usuário será solicitado a inserir os dados dos financiamentos. Após a entrada dos dados, o programa exibirá um resumo dos financiamentos e gerará um relatório no arquivo `financial_report.txt`.

## Contribuição

Sinta-se à vontade para contribuir com melhorias para este projeto. Faça um fork do repositório, crie uma branch para suas alterações e envie um pull request.

# Projeto: Conjunto de Testes Unitários para Diversas Classes Java

Este projeto é uma coleção de testes unitários para várias classes Java que realizam operações simples, como conversão de temperaturas, cálculos de carrinho de compras, e operações com funcionários. Ele utiliza o framework **JUnit 5** para os testes e simula diversas funcionalidades comuns.

## Estrutura do Projeto

### 1. **FahrenheitCelsiusConverter**
Classe responsável pela conversão de temperaturas entre Fahrenheit e Celsius.

#### Métodos:
- `toFahrenheit(double num)`: Converte uma temperatura de Celsius para Fahrenheit. Se o valor for menor que -273.15°C (zero absoluto), lança uma exceção `InvalidAlgorithmParameterException`.
- `toCelsius(double num)`: Converte uma temperatura de Fahrenheit para Celsius. Se o valor for menor que -459.67°F (zero absoluto), lança uma exceção `InvalidAlgorithmParameterException`.

#### Testes:
- `shouldConvertCelciusToFahrenheit`: Testa a conversão de Celsius para Fahrenheit.
- `shouldConvertFahrenheitToCelcius`: Testa a conversão de Fahrenheit para Celsius.

---

### 2. **ShoppingCart**
Classe que simula um carrinho de compras com funcionalidades de adicionar e remover itens, além de verificar o saldo total.

#### Métodos:
- `addItem(Product item)`: Adiciona um produto ao carrinho.
- `removeItem(Product item)`: Remove um produto do carrinho. Lança a exceção `ProductNotFoundException` se o item não estiver no carrinho.
- `getItemCount()`: Retorna o número de itens no carrinho.
- `getBalance()`: Retorna o valor total dos itens no carrinho.
- `empty()`: Esvazia o carrinho de compras.

#### Testes:
- `testeCarrinhoVazio`: Verifica se o carrinho inicia vazio.
- `testeCarrinhoQuandoEsvaziado`: Verifica se o carrinho está vazio após a chamada de `empty()`.
- `testeIncrementoCarrinho`: Verifica se a adição de um item incrementa o número de itens no carrinho.
- `testeValorTotalCarrinho`: Verifica se o saldo do carrinho é atualizado corretamente após a adição de itens.
- `testeRemoverItem`: Testa a remoção de um item do carrinho.
- `testeRemoverItemQueNaoEstaNoCarrinho`: Testa a remoção de um item que não está no carrinho, esperando a exceção `ProductNotFoundException`.

---

### 3. **Calculator**
Classe simples que realiza operações aritméticas básicas.

#### Métodos:
- `add(double num1, double num2)`: Soma dois números.

#### Testes:
- `testAdd`: Testa a soma de dois números.

---

### 4. **Funcionario**
Classe que simula um funcionário, realizando cálculos de bonificação e salário bruto.

#### Métodos:
- `converterDataNas(int dia, int mes, int ano)`: Converte a data de nascimento do funcionário para a idade atual.
- `getBonificacao(double salarioBase)`: Calcula a bonificação de um funcionário com base em seu salário.
- `calcSalario(double salarioBase)`: Calcula o salário bruto de um funcionário após descontos.

#### Testes:
- `testConverterDataNas`: Testa a conversão da data de nascimento.
- `testGetBonificacao`: Testa o cálculo da bonificação de um funcionário.
- `testConverterDataNasAll`: Testa outra variação da conversão de data de nascimento.
- `testCalcSalario`: Testa o cálculo do salário bruto.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação principal.
- **JUnit 5**: Framework para testes unitários.
- **Maven**: Ferramenta de build e gerenciamento de dependências (se aplicável).

## Instruções de Uso

1. **Clonagem do repositório**: Clone este repositório para a sua máquina local:
   ```bash
   git clone <URL_DO_REPOSITORIO>
2 . **Execução**: Execute cada arquivo como uma classe java normal.

# Projeto de testes simulando uma aplicação de banco

http://www.way2automation.com/angularjs-protractor/banking/#/login

Projeto de teste de uma aplicação Web, utilizando Selenium WebDriver

## Requisitos

* JDK 8 ou superior
* JUnit 4 ou superior
* Apache Maven <a href="https://maven.apache.org/download.cgi" target="_blank">Página oficial</a>

## Ferramentas
* Selenium WebDriver <a href="https://www.selenium.dev/documentation/en/webdriver/" target="_blank">Documentação</a>
* Web Driver Manager <a href="https://github.com/bonigarcia/webdrivermanager" target="_blank">Documentação</a>

## Casos de teste

**Cenário:** Mensagem deposito com sucesso

**Dado** que o cliente esteja na tela de depósito

**Quando** efetuar um depósito

**Então** deve mostrar uma mensagem de "Depósito com sucesso"

-----------------------------------------
**Cenário:** Mensagem saque com sucesso

**Dado** que o cliente esteja na tela de saque

**Quando** efetuar um saque

**Então** deve mostrar uma mensagem de "Saque executado com sucesso"

-----------------------------------------
**Cenário:** Mensagem saque não pode ser efetuado

**Dado** que o cliente esteja na tela de saque

**Quando** efetuar um saque inserindo um valor maior que o saldo da conta

**Então** deve mostrar uma mensagem de "Saque maior que o valor de saldo"

-----------------------------------------

**Cenário:** Saque sem sucesso

**Dado** que o cliente esteja na tela de saque

**Quando** efetuar um saque informando valor negativo

**Então** não deve realizar o saque

-----------------------------------------

**Cenário:** Depósito sem sucesso

**Dado** que o cliente esteja na tela de saque

**Quando** efetuar um depósito informando valor negativo

**Então** não deve realizar o depósito

-----------------------------------------
**Cenário:** Validar transação

**Dado** que o cliente tenha executado uma transação

**Quando** ir para tela de transações

**Então** deve listar as transações feitas

-----------------------------------------

**Cenário:** Cadastrar cliente

**Dado** que o gerente esteja na tela de cadastro de cliente

**Quando** preencher os campos ``<campos>``

**|Primeiro nome|**
   
**|Sobrenome nome|**

**|Código postal|**   

**Então** deve cadastrar um novo cliente

**E** o novo cadastro deve constar na lista de clientes

-----------------------------------------

**Cenário:** Abrir conta

**Dado** que o gerente esteja na tela de abertura de conta

**Quando** escolher a opção de um cliente que já tenha cadastro

**Então** deve permitir abertura de conta para o cliente

-----------------------------------------

**Cenário:** Excluir cliente

**Dado** que o gerente esteja na tela de listar todos clientes

**Quando** o gerente excluir o registro do cliente

**Então** o registro deve desaparecer da lista

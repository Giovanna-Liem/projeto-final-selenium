Feature: Login

  Scenario: Acessar a página de Login
    Given que o usuário esteja na página Demo
    When clicar no item LOGIN
    Then o usuário é direcionado para a página de Login

  Scenario: Login inválido
    Given que o usuário esteja na página de Login
    When preencher os campos email e nome incorretamente
    And clicar no botão LOGIN
    Then a mensagem Please check your emal and password é exibida
    And o login não é efetuado

  Scenario: Efetuar login
    Given que o usuário esteja na página de Login
    When preencher os campos corretamente
    And clicar no botão LOGIN
    Then o usuário é direcionado para a página Dashboard

  Scenario: Acessar a página de Forget Password
    Given que o usuário esteja na página de Login
    When clicar no botão FORGOT PASSWORD
    Then o usuário é direcionado para a página Forget Password

  Scenario: Acessar a página de Sign Up
    Given que o usuário esteja na página de Login
    When clicar no botão CREATE ACCOUNT
    Then o usuário é direcionado para a página de Sign Up

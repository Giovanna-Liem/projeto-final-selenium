Feature: Pricing

  Scenario: Acessar a página de Pricing
    Given que o usuário esteja na página Demo
    When clicar no item PRICING
    Then verificar o título da página Pricing

  Scenario: Conferir os planos oferecidos
    Given que o usuário esteja na página de Pricing
    When verificar o título da página Pricing
    Then localizar os planos Startup, Agency, Enterprise

  Scenario: Conferir os valores dos planos oferecidos
    Given que o usuário esteja na página de Pricing
    When verificar o título da página Pricing
    Then o valor do plano Startup deve ser 499
    And o valor do plano Agency deve ser 999
    And o valor do plano Enterprise deve ser 2499

  Scenario: Acessar a página de assinatura de plano
    Given que o usuário esteja na página de Pricing
    When clicar no botao Get Started
    Then o usuário é direcionado para a página de de Get Started


  Scenario: Acessar a página de Product Services
    Given que o usuário esteja na página de Pricing
    When clicar no botão PRODUCT SERVICES
    Then o usuário é direcionado para a página de Product Services
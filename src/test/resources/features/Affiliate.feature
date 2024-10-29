Feature: Affiliate

  Scenario: Acessar a página Affiliate
    Given que o usuário esteja na página Demo
    When clicar no item AFFILIATE
    Then o título da página deve ser Become an Affiliate Partner

  Scenario: Capturar título e subtítulo presentes na página Affiliate
    Given que o usuário esteja na página Affiliate
    When localizar o título da página Affiliate
    Then seu subtítulo deve ser Join the PHPTRAVELS Affiliate Program and earn High Commissions for every sale you make.

  Scenario: Clicar no botão JOIN NOW
    Given que o usuário esteja na página Affiliate
    When clicar no botão JOIN NOW
    Then a página de formulário para Affiliate Registration é exibida

  Scenario: Preencher e limpar dados do formulário
    Given que o usuário esteja no formulário Affiliate Registration
    When preencher os campos NAME, EMAIL e PHONE
    And clicar no checkbox 5000 - 10000
    And clicar no input 50+
    And clicar em LIMPAR FORMULÁRIO
    Then os campos NAME, EMAIL e PHONE devem estar vazios

  Scenario: Preencher e enviar formulário
    Given que o usuário esteja no formulário Affiliate Registration
    When preencher os campos NAME, EMAIL e PHONE
    And clicar no botão para enviar o formulário
    Then a mensagem Thank you for registration we will contact you back soon to setup your account. deve ser exibida
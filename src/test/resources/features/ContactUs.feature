Feature: Contact Us

  Scenario: Acessar a página Contact Us
    Given que o usuário esteja na página Demo
    When clicar no item CONTACT US
    Then o título da página deve ser Contact Us

  Scenario: Visualizar o subtítulo da página Contact Us
    Given que o usuário esteja na página Contact Us
    When localizar o título da página
    Then seu subtítulo deve ser Contact us anytime and we will be happy to assist you

  Scenario: Visualizar o endereço do Head Office
    Given que o usuário esteja na página Contact Us
    When localizar o item HEAD OFFICE
    Then sua descrição deve ser 71-75 Shelton Street, Covent Garden London, United Kingdom, WC2H 9JQ

  Scenario: Visualizar o endereço de Email
    Given que o usuário esteja na página Contact Us
    When localizar o item EMAIL
    Then sua descrição deve ser info@phptravels.com

  Scenario: Visualizar o telefone para contato
    Given que o usuário esteja na página Contact Us
    When localizar o item PHONE
    Then sua descrição deve ser +447874472344
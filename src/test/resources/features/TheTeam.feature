Feature: The Team

  Scenario: Acessar a página The Team
    Given que o usuário esteja na página Demo
    When clicar no item THE TEAM
    Then o usuário é direcionado para a página The Team

  Scenario: Capturar o título da página
    Given que o usuário esteja na página The Team
    When localizar o título The Core Team
    Then ele deve conter o subtítulo Meet the great minds behind this amazing application!

  Scenario: Capturar a descrição do Time
    Given que o usuário esteja na página The Team
    When localizar o título The Core Team
    Then ela deve conter o texto Our business is a business built on knowledge and unique ideas and as you may assume our team is our primary and most valuable asset. When we choose our employees we never compromise with qualities such as professionalism, experience and reliability.

  Scenario: Contar o número de pessoas no time principal
    Given que o usuário esteja na página The Team
    When localizar o Core Team
    Then ele deve conter 8 pessoas no Core Team!

  Scenario: Achar o Romi
    Given que o usuário esteja na página The Team
    When localizar o Romi
    Then ele deve conter o máximo de fofura possível
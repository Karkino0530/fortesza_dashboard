
Feature: Ingreso de Inversionista a consolidado

  @IngresaDashboard @HappyPath
  Scenario Outline: Inversionista puede ver su dashborar
    Given Usuario "<username>" accede a staging.fortesza.com/login
    When Ingresa sus datos de seguridad "<password>"
    Then Inversionista puede ve el dashboard

    Examples:
      |username                 |password     |
      |erasmotorres09@gmail.com |esFortesza21*|

Feature: Registro de inversionista en pagina de registro de fortesza.com

  @RegistrarInversionistaExitoso @HappyPath
  Scenario: Registrarse de inversionista de fortesza

    Given Cliente accede a la pagina de fortesza para registrarse como inversionista
    When Completa el formulario de registro sus datos de seguridad
    Then El cliente podra registrarse exitosamente.


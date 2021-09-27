
Feature: Actualizar datos de perfil del usuario

@EditarDatosPerfil @HappyPath
  Scenario Outline: Inversionista puede editar sus datos del perfil
   Given Inversionista accede a su perfil de fortesza con sus datos de seguridad "<username>" y "<password>"
    When Edita los datos de su perfil de usuario
     Then el Inversionista podra ver sus datos actualizados

   Examples:
    |username                 |password     |
    |erasmotorres09@gmail.com |esFortesza21*|
@Regression @LogIn
Feature: Log In clockify

  Background:
    Given estoy en la landing page de clockify
    And clickeo el boton Log in

  @TestLogInExitoso @LogInManually @Smoke
  Scenario:Logueo manual con un e-mail y una contraseña validos
    When clickeo el boton " Log in manually "
    And ingreso un "email", un "password" y clikeo el boton Log In
    Then soy redirigido la pagina principal de clockify



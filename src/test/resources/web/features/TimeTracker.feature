@Regression @TimeTracker
Feature: Creo un nuevo Workspace

  Background:
    Given estoy en la landing page de clockify
    And clickeo el boton Log in
    And clickeo el boton " Log in manually "
    And ingreso un "email", un "password" y clikeo el boton Log In

  @registroDeHoras @RegistroConFechayHora @Smoke
  Scenario: Creo un nuevo registro de horas trabajadas
    When clickeo el boton "TIME TRACKER"
    And clickeo sobre el boton Manual
    And añado una fecha
    And seteo una hora de inicio "08:00"
    And clickeo el boton " Add "
    Then se crea un nuevo time entry


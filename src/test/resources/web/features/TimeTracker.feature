@Regression @TimeTracker
Feature: Creo un nuevo Workspace

  Background:
    Given estoy en la landing page de clockify
    And clickeo el boton Log in
    And clickeo el boton " Log in manually "
    And ingreso un "email", un "password" y clikeo el boton Log In

  @RegistroDeHoras @RegistroConFechayHora @Smoke
  Scenario: Creo un nuevo registro de horas trabajadas
    When clickeo el boton "TIME TRACKER"
    And clickeo sobre el boton Manual
    And añado una fecha
    And seteo una hora de inicio "08:00"
    And clickeo el boton " Add "
    Then se crea un nuevo time entry


  @ModificoElRegistroDeHoras @ok
  Scenario: Creo un nuevo registro de horas por API y modifico los datos del time entry
    And clickeo el boton " Stop "
    When edito el nombre del time entry "NuevoTimeEntry"
    And clickeo el boton "Project"
    And clickeo el boton "LippiaFinalProject "
    And clickeo el boton " $ "
    Then se modifica el time entry


  @CreoHorasYLasDescarto @--
  Scenario: Creo un nuevo registro de horas pero lo cancelo
    And clickeo el boton "TIME TRACKER"
    And clickeo el timer relojito
    When clickeo el boton " Start "
    And clickeo los tres puntitos laterales
    And clickeo el boton " Discard"
    And clickeo el boton " Discard "
    Then se cancela la creacion del timeEntry


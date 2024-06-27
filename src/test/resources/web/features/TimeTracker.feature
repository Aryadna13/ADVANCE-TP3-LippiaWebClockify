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


  @ModificoElRegistroDeHoras @----nomesale
  Scenario: Creo un nuevo registro de horas por API y modifico los datos del time entry
    And clickeo el boton " Stop "
    And clickea el boton Project
    When clickeo el boton "LippiaFinalProject "
    And clickeo el boton "ProyectoCrowdar "
    And clickea el boton Tags
    And clickeo el boton "Crowdar"
    And clickeo el boton " $ "
    And modifico la hora de inicio "09:00"
    And modifico la hora de finalizacion "18:00"
    And selecciono el dia "13" del calendario
    Then se modifica el time entry


  @CreoHorasYLasDescarto @--exito
  Scenario: Creo un nuevo registro de horas pero lo cancelo
    And clickeo el boton "TIME TRACKER"
    And clickeo el timer relojito
    When clickeo el boton " Start "
    And clickeo los tres puntitos laterales
    And clickeo el boton " Discard"
    And clickeo el boton " Discard "
    Then se cancela la creacion del timeEntry


@Regression @NewProject
Feature: Creo un New project en clockify

  Background:
    Given estoy en la landing page de clockify
    And clickeo el boton Log in
    And clickeo el boton " Log in manually "
    And ingreso un "email", un "password" y clikeo el boton Log In
    And clickeo el boton " Projects "

  @NewProjectExitoso @Smoke
  Scenario: Creo de un nuevo proyecto
    And clickeo el boton " Projects "
    When clickeo el boton " Create new "
    And nombro mi proyecto "NuevoProyecto"
    And clickeo el boton " Create "
    Then se crea un nuevo "proyecto"



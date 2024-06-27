@Regression @Reports @oki
Feature: obtengo un report

  Background:
    Given estoy en la landing page de clockify
    And clickeo el boton Log in
    And clickeo el boton " Log in manually "
    And ingreso un "email", un "password" y clikeo el boton Log In

    @exportoMiReporteAPDF
    Scenario: a pdf
      When clickeo el boton "Reports"
      And clickea el boton Export
      And clickea el boton Save as PDF
      Then se descarga un pdf con las horas trabajadas
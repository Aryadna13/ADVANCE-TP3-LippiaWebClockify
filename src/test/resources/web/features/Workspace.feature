@Regression @NewWorkspace @ok
Feature: Workspaces

  Background:
    Given estoy en la landing page de clockify
    And clickeo el boton Log in
    And clickeo el boton " Log in manually "
    And ingreso un "email", un "password" y clikeo el boton Log In


  @NuevoWorkspaceExitoso @Smoke
  Scenario Outline: Creo un nuevo workspace
    And me encuentro en la home de workspace
    When clickeo el boton <CrearNewWorkspace>
    And nombro mi nuevo workspace "Espacio de trabajo"
    And clickeo el boton <Create>
    Then se crea un nuevo workspace

    Examples:
      | CrearNewWorkspace | Create     |
      | "workspace"       | " Create " |


  @ActualizacionDeWorkspaceExitoso @unico
  Scenario Outline: Modifico un workspace existente (creado por api)
    #Given la pagina esta en <Idioma>
    And clickeo el dropdown de workspaces
    And clickeo el boton <ManageWorkspaces>
    When clickea el boton <Settings> del ultimo workspace
    And cambio el nombre del workspace
    Then se cambia el nombre del workspace

    Examples:
      | Idioma | ManageWorkspaces      | Settings     |
      | en     | " Manage workspaces " | " Settings " |
      #| es     | " Gestionar espacios de trabajo " | " Configuración " |


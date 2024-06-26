@Regression @NewWorkspace
Feature: Workspaces

  Background:
    Given estoy en la landing page de clockify
    And clickeo el boton Log in
    And clickeo el boton " Log in manually "
    And ingreso un "email", un "password" y clikeo el boton Log In



  @NuevoWorkspaceExitoso @Smoke
  Scenario Outline: Creo un nuevo workspace
    Given clickeo el boton <ManageWorkspaces>
    When clickeo el boton <CrearNewWorkspace>
    And nombro mi nuevo workspace "Espacio de trabajo"
    And clickeo el boton <Create>
    Then se crea un nuevo workspace

    Examples:
      | ManageWorkspaces                  | CrearNewWorkspace | Create         |
      | " Manage "                        | " Create new "    | " Create "     |
      | " Gestionar espacios de trabajo " | " Configuración " | " Actualizar " |


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


  @NuevoWorkspaceFallido @Smoke
  Scenario: Creacion un nuevo workspace fallido
    When clickeo el boton "CREATE NEW WORKSPACE"
    And nombro mi nuevo workspace "@"
    #Then se muestra el cartel "Workspace name has to be between 2 and 250 characters long"



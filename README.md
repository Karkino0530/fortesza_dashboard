# Fortesza dashboard

## Uso del proyecto ⚙️

1- Clone este repositorio

2- Validar version de navegador Google Chrome (version utilizada para el project 94)

2.1- De ser necesario actualizar el chrome driver reemplazar el actual en el directorio:
   ```
   <raizProyecto>/src/test/Resources/drivers/chrome
   ```

3- Abrir el proyecto en el IDE de su preferencia

## Pre-requisitos 📋

1-  Tener instalado Java 8 o superior en su máquina y ha configurado correctamente las variables de entorno necesarias para ejecutar y compilar el projecto.

2- Tener instaldo Maven y configurar las variables de entorno necesarias para ejecutar y compilar el projecto.

## Ejecución del proyecto 🚀

1- Abrir terminal (CMD)

2- En la terminal situarse en la ruta del proyecto

3- Ejecutar comando:
   ```
    mvn verify -Dcucumber.options=" -t @nombredeltagdelfeature"
   ```

## Tags de los Features

Se manejan los siguientes tags en los features:

###### Tags Principales
* @HappyPath: Corresponde a todos los escenarios en los features
* @IngresaDashboard: Corresponde al escenario de que el usuario ingresa al consolidado de la aplicacion
* @RegistrarInversionistaExitoso: Corresponde al escenario de que se registra un nuevo usuario en la aplicacion
* @EditarDatosPerfil: Corresponde al escenario de que el usuario actualiza sus datos de usuario

## Properties 🛠️

Para el proyecto se usan los siguientes properties:

###### Configuation.properties
  ```
   <raizProyecto>/src/test/Resources/properties/Configuation.properties
  ```

En este properties se encuentran datos de configuración:

- Driver: ruta del driver necesario para la ejecución de las pruebas
- chrome.driver.timeout: es el tiempo por deafault del chromedriver
- urlfortesza.registro: Url de la aplicacion para registro del usuario, el cual se invoca en el flujo de registro del usuario
- urlfortesza.login: Url de la aplicacion para registro del usuario, el cual se invoca en el flujo de login del usuario

###### log4j.properties
  ```
   <raizProyecto>/src/main/resources/log4j.properties
  ```

En este properties se encuentra la configuración para generar logs de la ejecución.

En este archivo solo cambiar las rutas:

- log4j.appender.R.File = 'Ruta del archivo log/nombre de arvhivo.log'
- log4j.appender.TTCC.File = 'Ruta del archivo log/nombre de arvhivo1.log'
- log4j.appender.HTML.File 'Ruta del archivo log/nombre de arvhivo.html'

###### dataUsers.properties
  ```
   <raizProyecto>/src/test/Resources/properties/dataUsers.properties
  ```
En este propierties se encuentan data de prueba que es el nombre de los usuarios nuevos registrador y las ciudades para el flujo de actualizacion de datos.

## Reportes 📄

A continuación se especifican los reportes usados:

##### 1. Reporte generado con cucumber-html:

Se genera reporte en html, este archivo es un index.html y se encuentra en la ruta:

  ```
   <raizProyecto>/target/site/serenity/index.html
  ```

##### 2. Reporte generado con cucumber-json:

Se genera reporte en json, este archivo es un cucumber-report.json y se encuentra en la ruta:

  ```
   <raizProyecto>/target/cucumber-report/cucumber-report.json
  ```

* Para json, se debe agregar en el TestRunner _{"json:target/cucumber-report/cucumber-report.json"}_ en la opción _plugin_ de la anotación _@CucumberOptions_

```
@CucumberOptions(..., 
plugin = {"json:target/cucumber-report/cucumber-report.json"})
```

#### 3. Log de la aplicacion:

En la ruta:

  ```
   <raizProyecto>/Evidencias
  ```

Se generar archivos de log en el cual se registra toda la trama de la aplicacion, esta esta divida en:

  ```
   <raizProyecto>/Evidencias/Log
  ```
* Esta se divide en 3 archivos de log, 3 archivo .log y un archivo de html (en cualquiera de los mismo se puede visualizar la trama de la aplicacion)

En la ruta de:

  ```
   <raizProyecto>/Evidencias/screenshot
  ```

* Esta se divide en 2 ruta:

1- Success: en la cual se ingresan las capturas al final el escenario exitosamente.

2- Las rutas fuera de la de succes se guardan las capturar cuando el escenario termina en error con la nomeclaruta YYYY-mm-dd/hh:mm:ss/RESULATADO FALLIDO.png
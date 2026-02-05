# Mi Primera App

Esta es una aplicación Android básica desarrollada en Kotlin como parte de un proyecto de aprendizaje. La aplicación demuestra el uso de múltiples actividades, navegación mediante Intents explícitos y manejo de layouts.

## Características

La aplicación consta de 5 actividades principales:

1.  **LoginActivity**: Pantalla de inicio de sesión que valida las credenciales del usuario.
2.  **InicioActivity (Home)**: Pantalla principal que recibe el nombre de usuario y muestra opciones de navegación.
3.  **ContactoActivity**: Formulario de contacto que permite enviar datos de vuelta a la pantalla de inicio.
4.  **SobreNosotrosActivity**: Pantalla informativa sobre la aplicación o sus desarrolladores.
5.  **LocalizacionActivity**: Pantalla destinada a mostrar información de ubicación o mapas.

### Funcionalidades Clave

*   **Navegación entre Actividades**: Uso de `Intent` para moverse entre pantallas.
*   **Paso de Datos**: Transferencia de información (como el nombre de usuario) entre actividades usando `putExtra` y `getExtra`.
*   **View Binding / Inflate**: Uso del método `inflate` para la carga de layouts en lugar del tradicional `setContentView(R.layout...)`.
*   **Gestión del Ciclo de Vida**: Manejo básico del ciclo de vida de las actividades.

## Requisitos Técnicos

*   **Lenguaje**: Kotlin
*   **Minimum SDK**: API 24 (Android 7.0 Nougat)
*   **Target SDK**: API 34 (Android 14)
*   **Dependencias Principales**:
    *   androidx.core:core-ktx
    *   androidx.appcompat:appcompat
    *   com.google.android.material:material
    *   androidx.constraintlayout:constraintlayout

## Configuración y Ejecución

1.  Clonar o descargar el proyecto.
2.  Abrir el proyecto en **Android Studio**.
3.  Esperar a que Gradle sincronice las dependencias.
4.  Ejecutar la aplicación en un emulador o dispositivo físico conectado.

## Estructura del Proyecto

El código fuente principal se encuentra en:
`app/src/main/java/com/example/miprimeraapp/`

Los archivos de diseño (layouts) se encuentran en:
`app/src/main/res/layout/`

# 🧠 Evaluación Sumativa Semana 3 – Desarrollo Orientado a Objetos I

# Proyecto: Gestión de Empleados SALMONTT

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la evaluación sumativa numero 1 del segundo bimestre correspondiente a la asignatura *Desarrollo Orientado a Objetos I*. Se trata de una aplicacion Java orientada a objetos para gestionar empleados de la empresa Salmontt de Puerto Montt. Permite instanciar empleados con todos sus datos personales como Rut validado, direccion (opcional o completa) y salario, aplicando buenas practicas de herencia, composicion, polimorfismo y validacion en Java.

El proyecto fue desarrollado a partir de un caso contextualizado, abordando problemáticas reales y proponiendo una solución estructurada, modular y reutilizable.

---


## 🧱 Estructura general del proyecto

```
📦 Duoc_Desarrollo_a_Objetos_I/
┣ 📂 .idea/
┣ 📂 src/
┃ ┣ 📂 app/
┃ ┃ ┣ 📜 Main					# Clase principal con método main.
┃ ┣ 📂 model/					
┃ ┃ ┣ 📜 Direccion				# Encapsula dirección física, con validaciones
┃ ┃ ┣ 📜 Empleado				# Extiende Persona, contiene informacion laboral y salario.
┃ ┃ ┣ 📜 Persona					# Clase abstracta con datos personales, direccion y contacto
┃ ┃ ┣ 📜 Rut						# encapsula el RUT y valida su formato con excepción personalizada
┃ ┣ 📂 util/					
┃ ┃ ┣ 📜 ValidaRutException		# Excepcion propia para rut inválido
┣ 📜 .gitignore
┃ 📜 README.md
┗ 📜 cl.salmontt.empleados.iml

```

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

- Clona o descarga todo el contenido del proyecto desde el enlace de github
	
- Verifica que la estructura de carpetas corresponda a los paquetes indicados.
- Abre el proyecto en tu IDE Favorito, se recomienda IntelliJ.
- Abre la clase Main del paquete app/ y ejecuta el proyecto.

Nota: La clase Main ya trae algunos ejemplos que se mostraran en consola.

---

## 📚 Caso Planteado

Salmontt es una empresa salmonera con sede en Puerto Montt, dedicada desde hace más de 15 años a la producción, procesamiento y exportación de salmón. Su crecimiento sostenido la ha posicionado como un actor relevante en la industria acuícola del sur de Chile, con múltiples centros de cultivo, plantas de proceso y una red logística nacional e internacional.
Este desarrollo acelerado ha generado diversos desafíos en la gestión de su información interna, entre ellos:

 - Duplicación de datos entre diferentes áreas, lo que genera inconsistencias y pérdida de trazabilidad.
 - Desorganización estructural, ya que la información se gestiona sin una lógica común y con formatos dispares.
 - Ausencia de jerarquías claras entre las personas que interactúan con la empresa, dificultando los procesos de registro, comunicación y seguimiento.
 - Procesos manuales repetitivos, como la incorporación de nuevos empleados o la actualización de datos, que incrementan la carga administrativa y los errores.

Frente a este escenario, la gerencia ha decidido iniciar un proceso de digitalización de sus sistemas internos. La primera fase contempla el desarrollo de una base técnica que represente de forma estructurada las personas que forman parte de la organización, como primer paso hacia un sistema más completo.
Para ello, se solicita diseñar un modelo en Java que represente a estas personas mediante clases bien definidas, con atributos protegidos mediante encapsulamiento, relaciones claras entre objetos (por ejemplo, una persona tiene una dirección), y una estructura ordenada que siente las bases para futuras funcionalidades.

### Problematica

Actualmente, Salmontt no cuenta con un sistema estructurado que permita organizar eficientemente la información de las personas vinculadas a la empresa. La información se encuentra dispersa, duplicada y gestionada manualmente, lo que dificulta el registro, la comunicación y el seguimiento.
Además, no existe una representación clara ni reutilizable de las entidades del dominio, como personas con dirección o rol definido. Esta ausencia de diseño estructurado limita la escalabilidad del sistema y aumenta la posibilidad de errores.

Para resolver este problema, deberás diseñar e implementar en Java un modelo básico que represente a las personas que interactúan con la empresa, utilizando clases bien definidas, atributos encapsulados, relaciones de composición (por ejemplo, persona con dirección) y una estructura modular organizada en paquetes. Esta actividad constituye la primera etapa en la construcción de un sistema extensible, mantenible y alineado con buenas prácticas de desarrollo de software.

---

## 👤 Autor del proyecto
- **Nombre completo:** Matias Suarez M.
- **Sección:** 002A
- **Carrera:** Analista Programador Computacional
- **Sede:** Carrera 100% Online
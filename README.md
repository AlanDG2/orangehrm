## 📜 Historia de Usuario

- [Historia de Usuario:](docs/HU.pdf)

  
# Automatización de Proceso de Contratacion en OrangeHRM  


 **COMO** Administrador de Recursos Humanos
   
 **QUIERO** automatizar el proceso de agregar candidatos en OrangeHRM 
   
 **PARA** garantizar precisión y eficiencia en el reclutamiento.

   

## 📜 Criterios de Aceptación  

### Objetivo Principal  
Automatizar el flujo completo de creación de un candidato en OrangeHRM, validando su estado hasta **"Hired"**, aplicando buenas prácticas técnicas.  

---

### Requisitos Técnicos  
1. **Patrón Screenplay + Cucumber**:  
   - Implementación de flujos modulares con actores, tareas y preguntas.  
   - Escenarios escritos en Gherkin para claridad y mantenibilidad.  

2. **Modelo y Estructura de Proyecto**:  
   - Separación clara de capas:  
     - `tasks/`: Acciones del usuario   
     - `ui/`: Page Objects con locators.  
     - `questions/`: Validaciones y aserciones.  
     - `features/`: Archivos .feature con lenguaje natural.  

---

### Validaciones Clave  
- **Creación de Candidato**:  
  - Datos generados dinámicamente .  
  - Archivo PDF adjuntado desde recursos del proyecto.  
- **Estado Final**:  
  - Candidato registrado con estado **"CONTRATADO"**.  
- **Reportes**:  
  - Evidencia gráfica y detalle de pasos en reporte HTML.  

---

## 🛠️ Configuración  
```bash
# Clonar repositorio
git clone https://github.com/AlanDG2/orangehrm.git

# Correr el  test
./gradlew clean build

# Reporte
start target/site/serenity/index.html     

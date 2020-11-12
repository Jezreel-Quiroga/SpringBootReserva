

PARA INICIAR SPRINGBOOT DESDE EL CMD

Buscas donde tienes tu jdk que normalmente esta en C:\Program Files\Java en el explorador de archivos ubicas "Este equipo" das click derecho y das click en "Configuracion avanzada del sistema" luego a "Variables de entorno" y en Variables del sistema das a nueva, y agregas lo siguiente

JAVA_HOME C:\Program Files\Java\jdk(1.8.0_261)<--esto siempre depende de la version del jdk

Paso seguido buscas en variables del sistema la variable llamada Path y le pones a editar, una vez presiones eso se te abrira un menu donde presionaras nueva y agregaras esto

%JAVA_HOME%\bin

Para verificar esto presiona windows + r y escribe cmd, una vez echo, dentro de la consola escribiras java -version y tendra que salir un mensaje con la version de java

Luego para instalar maven (porque es necesario)

Te vas a este enlace y en la tabla buscas el archivo binare zip y presionas en la ubicacion que esta el archivo en la fila links

Una vez descargado, te vas a este equipo y C: paso seguido mueves el rar ahi y lo descomprimes

Una ves hecho esto haras lo de las variables de entorno igual que con java: este equipo, propiedades, configuracion avanzada del sistema, variables de entorno , variables del sistema, nueva y va lo siguiente:

M2_HOME C:\apache-maven-(3.6.3)<--Dependiendo de tu version de maven

Luego, aceptar y aceptar, abres de nuevo variables de entorno y al Path de variables del sistema le das editar y luego presionas en nueva y agregas esto:

%M2_HOME%\bin

Presionas aceptar, aceptar y para comprobar nuevamente te vas a cmd y ejecutas esto mvn -v

Una vez esto hecho y este todo bien, te vas al cmd y recorres las carpetas hasta llegar a la de tu proyecto maven por ejemplo: C:\Users\user> cd desktop C:\Users\user\Desktop>cd proyecto-maven C:\Users\user\Desktop\proyecto-maven>

Luego de estar en la carpeta correspondiente ejecutas:

mvn clean install

Esperas a que cargue y cuando finalize te creara un archivo .jar que tendras que ejecutar

Para verificar su nombre te vas a la carpeta del proyecto en el explorador de archivos y buscas la carpeta target, dentro de ella habra un archivo que termine en .jar.original por ejemplo:

proyecto-maven-0.0.1-SNAPSHOT.jar.original

Y una vez este ese archivo abriras tu carpeta target desde la consola (cmd) con un cd target poniendose en el caso de que sigues aca "C:\Users\user\Desktop\proyecto-maven>" y ejecutas:

java -jar proyecto-maven-0.0.1-SNAPSHOT.jar

Y listo, tendras corriendo springboot desde la cmd :D

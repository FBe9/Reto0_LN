# Reto0_LN: proyecto de Nerea y Leire.

· URL de github = https://github.com/FBe9/Reto0_LN/tree/main

· Los nombres de los archivos .jar utilizados como librerías:
  - mysql-connector-java-5.1.49.jar
  - JUnit 4.12 -junit-4.12.jar
  - Hamcrest 1.3 -hamcrest-core-1.3.jar

· Texto a cambiar en el config file: 
  - Apartado VIEW = TXT para el mensaje en texto y WINDOW para el mensaje en ventana.

  - Apartado MODEL = FILE para leer el mensaje del config file y DB para leerlo 
		   de la base de datos.

Si en cualquiera de los dos apartados hay un valor no contemplado salta una excepción 
ConfigFileBadWriteException avisando al usuario de eso.
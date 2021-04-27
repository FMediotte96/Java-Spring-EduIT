#com.educacionit.spring.beginning-class02
Java Education Project for learn Springframework.

Ejercicios (Básicos/Intermedio)
==========================================

La configuración de este proyecto es independiente de cualquier IDE de desarrollo, debido a que el proyecto
fue creado utilizando maven. (http://maven.apache.org)

Así que son libres de utilizar el IDE con el cual se sientan más agusto.



Ejercicio I (clase AppBusinessBefore)
==========================================
	
Esta clase puede ser ejecutada desde cualquier ide de desarrollo a través de la opción seleccionar la clase
y presionar la opción de ejecutar como clase java. Debido a que el código de prueba utiliza el método maín,
todos los ides de desarrollo peuden ejecutar este programa sin problemas.

Con respecto a las dependencias, estas son manejadas a traves de maven.

Si el programa es ejecutado sin problemas, podrán observar en la consola una salida como esta:

###2017-10-12 15:35:52 DEBUG BeforeAdvisor:27 - before - Before business logic !!!
###2017-10-12 15:35:53 INFO  Business:23 - businessMethod - Executin Business rules...

Dicha salida muestra la línea de ejecución del aspecto y la clase de negocio misma.



#Ejercicio II (clase AppBusinessAfter)

Esta clase puede ser ejecutada desde cualquier ide de desarrollo a través de la opción seleccionar la clase
y presionar la opción de ejecutar como clase java. Debido a que el código de prueba utiliza el método maín,
todos los ides de desarrollo peuden ejecutar este programa sin problemas.

Con respecto a las dependencias, estas son manejadas a traves de maven.

Si el programa es ejecutado sin problemas, podrán observar en la consola una salida como esta:

###2017-10-12 15:41:32 INFO  Business:23 - businessMethod - Executin Business rules...
###2017-10-12 15:41:32 DEBUG AfterAdvisor:21 - afterReturning - After business logic !!!

Dicha salida muestra la línea de ejecución del aspecto y la clase de negocio misma.



#Ejercicio III (clase AppBusinessAround)

Esta clase puede ser ejecutada desde cualquier ide de desarrollo a través de la opción seleccionar la clase
y presionar la opción de ejecutar como clase java. Debido a que el código de prueba utiliza el método maín,
todos los ides de desarrollo peuden ejecutar este programa sin problemas.

Con respecto a las dependencias, estas son manejadas a traves de maven.

Si el programa es ejecutado sin problemas, podrán observar en la consola una salida como esta:

###2017-10-12 15:44:57 DEBUG AroundAdvisor:27 - invoke - Before business logic !!!
###2017-10-12 15:44:57 INFO  Business:23 - businessMethod - Executin Business rules...
###2017-10-12 15:44:57 DEBUG AroundAdvisor:31 - invoke - After business logic !!!

Dicha salida muestra la línea de ejecución del aspecto y la clase de negocio misma.



#Ejercicio IV (clase AppBusinessException)

Esta clase puede ser ejecutada desde cualquier ide de desarrollo a través de la opción seleccionar la clase
y presionar la opción de ejecutar como clase java. Debido a que el código de prueba utiliza el método maín,
todos los ides de desarrollo peuden ejecutar este programa sin problemas.

Con respecto a las dependencias, estas son manejadas a traves de maven.

Si el programa es ejecutado sin problemas, podrán observar en la consola una salida como esta:

###2017-10-12 15:48:24 DEBUG ThrowsAdviceInterceptor:117 - getExceptionHandler - Found handler for exception of type [java.lang.Exception]: public void com.educacionit.spring.beginning.class02.aop.ThrowsAdvisor.afterThrowing(java.lang.Exception)
###2017-10-12 15:48:24 ERROR ThrowsAdvisor:24 - afterThrowing - Exception !!! / by zero

Dicha salida muestra la línea de ejecución del aspecto y la clase de negocio misma.
# ParcialHerramientasComputacionales

Este programa desarrollado en JAVA tiene como objetivo solucionar, debido a la pandemia, el problema economico que las cafeterias de la universidad tienen. Por eso, mediante el ingreso del numero de la cedula, de la elección de rol que tiene el usuario en la universidad, este le proporsionará un descuento acorde al rol de la persona.

El algoritmo esta compuesto en 3 funciones:
- menu(): se trata del menu principal en donde se le solicita el numero de cedula al usuario. Posteriormente mostrara dos opciones de rol y le pedira a cual pertenece (estudiante o profesor) mediante entrada por teclado, esto desemboca en dos funciones según el rol:

   - menuProfesor(): Esta función confirma el rol y el numero de cedula del usuario, tras esto, muestra una lista de los codigos y precios de los productos y se le solicita mediante entrada de texto al usuario que escoja uno y su cantidad. Despues de esto, tras un calculo interno se le dará el valor a pagar menos un 20% de descuento.
   
  - menuEstudiante(): Esta función confirma el rol y el numero de cedula del usuario, tras esto, muestra una lista de los codigos y precios de los productos y se le solicita mediante entrada de texto al usuario que escoja uno y su cantidad. Despues de esto, tras un calculo interno se le dará el valor a pagar menos un 50% de descuento.
  
  Calculo: Para generar el descuento acorde al rol del usuario, se realiza el siguiente calculo
  
           total = (precios * cantidad) - (precios * cantidad) * 0.2 o 0.5;
  
   
   
   
   
   

![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.
1.Comprobacion del calculo correcto del bmi
2.COmprobacion con un peso=0 salga un error
3. Comprobacion si la masa es negativa salga un error
4.Comprobacion   en 18.4 que salga UNDERWEIGHT
5.Comprobacion en 18.5 que salga NORMAL
Comprobación en 24.9 que salga NORMAL
COmprobación en 25 salga OVERWEIGHT
6.Comprobacion en 29.9 que salga OVERWEIGHT
7.Comprobacion en 30 que salga OBESE
8.Comprobacion de con un BMI negativo salga un error
9.Comprobacion que con gender=M y waistCIrcumference=1 nos devuelva true
10.Comprobacion que con gender=F y waistCIrcumference=0.9 nos devuelva true
11.Comprobacion que con gender=M y waistCIrcumference=0.8 nos devuelva false
12.Comprobacion que con gender=F y waistCIrcumference=0.7 nos devuelva false
13.Comprobacion que con gender distinto de M y F nos devuelva un error
14.Comprobacion que con un waistCircumference negativo nos devuelva un error

# Diagrama UML

<image src="C:\Users\raul\Desktop\Diagrama1.png" alt="Diagrama UML del modelo">
El caso de uso que hemos añadido es un cálculo según la altura de la persona y su género de su IBM ideal.

# Especificación de caso de uso
Calcular categoría
-Actor primario: Médico
-Objetivo: Calcular la categoría que es un paciente(obeso, delgado...) a través 
de una serie de valores.
-Scope: Software informático para calcularlo
-Level: Informar al paciente sobre a que categoría pertenece
-Stakeholder e intereses:
1. Médico: Infomar al paciente que categoría es
2. Paciente: Saber a que categoría pertenece
-Precondición: Que el médico conozca los parametros necesario(bmi) o los parámetros para 
calcularlos para poder realizar el cálculo.
-Garantía mínima: El médico recibe la información a partir del software para poder informar
al paciente
-Trigger: El médico selecciona la opción calcular categoría
-Escenario principal:
1. El médico inicia el software
2. El médico selecciona la opción calcular categoría
3. El médico introduce los parámetros(bmi)
4. El sowtware le devuelve al médico el resultado
-Escenarios alternativos:
2a. El médico no conoce el bmi
2b. El software da la opción de calcular bmi
2c. El software calcula bmi.
2d. El software calcula y devuelve la categoría
3a. El médico introduce parámetros no reales(muy altos o muy bajos)
3b. El software devuelve un error y vuelve a preguntar los parámetros

# Historias de usuario y escenarios
Historia de Usuario 1:
Como Médico
Quiero saber el bmi de un paciente
Para informarle sobre su bmi o calcular su categoria

Criterio de aceptación 11:
Escenario: Se calcula su bmi correctamente
Dado que los valores son válidos cuando introduzo esto valores en la calculadora entonces me dará el valor del bmi

Criterio de aceptación 12:
Escenario: La masa introducida es negativa
Dado que tengo una calculadora, cuando introduzco los valores en la calculadora and la masa es negativa, entonces me devolverá un error.

Criterio de aceptación 13:
Escenario: Se introduce un valor de height de 0
Dado que que tengo una calculadora and el height es igual a 0, cuando introduzco los valores , entonces me devolverá una excepción.
Historia de Usuario 2:
Como Médico
Quiero conocer a que categoría pertenece un paciente
Para informarle sobre eso

Criterio de aceptación 21:
Escenario: El bmi es igual a 5
Dado que el bmi es igual a 5 and elijo la opción calcular categoria, cuando introduzca el bmi, entonces me devolverá que la persona pertenece a la cetgoría a la underweight

Criterio de aceptación 22:
Escenario: El bmi es igual a 20
Dado que el bmi es igual a 20 and elijo la opción calcular categoria, cuando introduzca el bmi, entonces me devolverá que la persona pertenece a la cetgoría a la normal

Criterio de aceptación 23:
Escenario: El bmi es igual a 27
Dado que el bmi es igual a 27 and elijo la opción calcular categoria, cuando introduzca el bmi, entonces me devolverá que la persona pertenece a la cetgoría a la overweight

Criterio de aceptación 24:
Escenario: El bmi es igual a 30
Dado que el bmi es igual a 30 and elijo la opción calcular categoria, cuando introduzca el bmi, entonces me devolverá que la persona pertenece a la catgoría a la obese

Criterio de aceptación 25:
Escenario: El bmi es negativo
Dado que el bmi es negativo and elijo la opción calcular categoria, cuando introduzca el bmi, entonces me devolverá un error

Historia de usuario 3:
Como Médico
Quiero saber si un paciente tiene obesidad abdominal
Para informarle sobre ello

Criterio de aceptación 31:
Escenario: Persona de género másculino con wc igual a 1
Dado que el paciente es un hombre and tiene un wc igual a 1 and elige la opción calcular obesidad abdominal, cuando introduzco estos dos valores, entonces me devolverá que tiene obesidad abdominal

Criterio de aceptación 32:
Escenario: Persona de género femenino con wc igual a 1
Dado que el paciente es una mujer and tiene un wc igual a 1 and elige la opción calcular obesidad abdominal, cuando introduzco estos dos valores, entonces me devolverá que tiene obesidad abdominal

Criterio de aceptación 33:
Escenario: Persona de género másculino con wc igual a 0,8
Dado que el paciente es un hombre and tiene un wc igual a 0,8 and elige la opción calcular obesidad abdominal, cuando introduzco estos dos valores, entonces me devolverá que no tiene obesidad abdominal

Criterio de aceptación 34:
Escenario: Persona de género femenino con wc igual a 0,7
Dado que el paciente es una femenino and tiene un wc igual a 0,8 and elige la opción calcular obesidad abdominal, cuando introduzco estos dos valores, entonces me devolverá que no tiene obesidad abdominal

Criterio de aceptación 35:
Escenario: wc menor que 0
Dado que se introduce un wc menor que 0 and elige la opción calcular obesidad abdominal, cuando introduzco este valor, entonces me devolverá que el wc no puede ser menor que 0

Criterio de aceptación 36:
Escenario: genero no reconocido
Dado que see introduceen genero un valor distinto de M o F and elige la opción calcular obesidad abdominal, cuando introduzco este valor, entonces me devolverá que el genero no se ha reconocido

@tag
Feature: Como Médico Quiero saber el bmi de un paciente Para informarle sobre su bmi o calcular su categoria
@tag1
Scenario: Se calcula su bmi correctamente
Given los valores son válidos
When introduzo los valores <mass> y <height> en la calculadora
Then dara el valor del bmi
Examples: 
      | mass | height |
      | 1 | 1     |
      | 2 | 2     |
      | 3 | 6     |
      | 4 | 2  |
      | 5 | 12  |
      | 6 | 72  |
@tag2
Scenario: La masa es negativa
Given Tengo una calculadora
And la <mass> es negativa
When introduzo los valores <mass> y <height>
Then me volverá un error.
Examples: 
      | mass | height |
      | -1 | 1     |
      
@tag3
Scenario: Se introduce un valor de height de 0
Given Tengo una calculadora
And <height> es igual a 0
When introduzco los valores<mass> y <height>
Then Devolvera una excepcion
Examples: 
      | mass | height |
      | 2 | 0     |
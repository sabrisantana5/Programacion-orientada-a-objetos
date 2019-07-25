/*l ejercicio resuelto en clase del Banco-Cliente-Tarjeta de Cr�dito, deber�s agregar un tipo de datos Enum para representar los siguientes tipos de tarjeta:

Cl�sica:
Ingresos m�nimos: $7,500
Anualidad: $699

Oro
Ingresos m�nimos: $15,000
Anualidad: $959

Platinum
Ingresos m�nimos: $45,000
Anualidad:1,999

Black
Ingresos m�nimos: $100,000
Anualidad:4,599

De acuerdo al tipo de tarjeta deber� calcularse la tasa de inter�s para cada una de ellas de la siguiente forma (este c�lculo deber� ser obtenido mediante una funci�n dentro de Enum):

TASA DE INTERES (ANUAL Y MENSUAL)
Tasa de Inter�s anual (TIA): TIIE + Puntos porcentuales
Tasa de Inter�s mensual (TIM): ((TIA/360)*30
TIIE = (28*100)/360
Puntos porcentuales = MAX-MIN

MIN	MAX
Cl�sica 29 47
Oro	25	45
Platinum	16	33
Black	9.9	26

Ejemplo:
TIIE = (28*100)/360 = 7.7
TIA = 7.7 + 18 = 25.7
TIM = (25.7/360)*30 = 2.3
*/
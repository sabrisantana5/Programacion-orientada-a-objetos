/*l ejercicio resuelto en clase del Banco-Cliente-Tarjeta de Crédito, deberás agregar un tipo de datos Enum para representar los siguientes tipos de tarjeta:

Clásica:
Ingresos mínimos: $7,500
Anualidad: $699

Oro
Ingresos mínimos: $15,000
Anualidad: $959

Platinum
Ingresos mínimos: $45,000
Anualidad:1,999

Black
Ingresos mínimos: $100,000
Anualidad:4,599

De acuerdo al tipo de tarjeta deberá calcularse la tasa de interés para cada una de ellas de la siguiente forma (este cálculo deberá ser obtenido mediante una función dentro de Enum):

TASA DE INTERES (ANUAL Y MENSUAL)
Tasa de Interés anual (TIA): TIIE + Puntos porcentuales
Tasa de Interés mensual (TIM): ((TIA/360)*30
TIIE = (28*100)/360
Puntos porcentuales = MAX-MIN

MIN	MAX
Clásica 29 47
Oro	25	45
Platinum	16	33
Black	9.9	26

Ejemplo:
TIIE = (28*100)/360 = 7.7
TIA = 7.7 + 18 = 25.7
TIM = (25.7/360)*30 = 2.3
*/
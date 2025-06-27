#Funciones

def calificacion_mas_alta(lista):

    calificacion_mas_alta = 0
    for i in range(len(lista)):
        if lista[i] > calificacion_mas_alta:
            calificacion_mas_alta = lista[i]

    return calificacion_mas_alta

# Dado una lista de calificaciones, muestre en pantalla cual es la calificacion mas alta

grupo_1 = [70, 87, 93, 52, 90, 14, 55] #->93

grupo_2 = [65, 78, 82, 60, 88, 20, 50] #->88

grupo_3 = [75, 80, 91, 58, 85, 30, 60] #->91



respuesta_1 = calificacion_mas_alta(grupo_1)
respuesta_2 = calificacion_mas_alta(grupo_2)
respuesta_3 = calificacion_mas_alta(grupo_3)

print(f"La calificacion mas alta del grupo 1 es: {respuesta_1}")
print(f"La calificacion mas alta del grupo 2 es: {respuesta_2}")
print(f"La calificacion mas alta del grupo 3 es: {respuesta_3}")




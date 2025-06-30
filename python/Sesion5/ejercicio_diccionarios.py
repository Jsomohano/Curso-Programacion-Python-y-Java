"""
Enunciado:
Crea un programa que reciba un diccionario con los nombres de varios estudiantes y sus calificaciones.
Implementa tres funciones:
1. Una función que calcule y muestre el promedio de todas las calificaciones.
2. Una función que muestre el nombre del estudiante con la calificación más alta.
3. Una función que muestre el nombre del estudiante con la calificación más baja.
No uses las funciones max ni min.
"""

estudiantes = {
    "Ana": 9.5,
    "Luis": 9.2,
    "Marta": 7.8
}


def promedio(dict_calificaciones):
    #suma/numero_total
    suma = 0
    for i in dict_calificaciones.values():
        suma = suma + i

    cantidad = len(dict_calificaciones)
    promedio = suma/cantidad

    print(f"El promedio es de: {promedio}")

def cal_mas_alta(dict_calificaciones):
    mas_alta = -1
    nombre_alta = ""
    for name, cal in dict_calificaciones.items():
        if cal > mas_alta:
            mas_alta = cal
            nombre_alta = name

    print(f"La persona {nombre_alta} tiene la calificacion mas alta de: {mas_alta}")


cal_mas_alta(estudiantes)







































# def mostrar_promedio(estudiantes):
#     suma = 0
#     cantidad = 0
#     for calificacion in estudiantes.values():
#         suma += calificacion
#         cantidad += 1
#     promedio = suma / cantidad if cantidad > 0 else 0
#     print(f"Promedio de calificaciones: {promedio:.2f}")

# def mostrar_mayor(estudiantes):
#     mayor_nombre = None
#     mayor_calificacion = None
#     for nombre, calificacion in estudiantes.items():
#         if mayor_calificacion is None or calificacion > mayor_calificacion:
#             mayor_calificacion = calificacion
#             mayor_nombre = nombre
#     print(f"Estudiante con la calificación más alta: {mayor_nombre} ({mayor_calificacion})")

# def mostrar_menor(estudiantes):
#     menor_nombre = None
#     menor_calificacion = None
#     for nombre, calificacion in estudiantes.items():
#         if menor_calificacion is None or calificacion < menor_calificacion:
#             menor_calificacion = calificacion
#             menor_nombre = nombre
#     print(f"Estudiante con la calificación más baja: {menor_nombre} ({menor_calificacion})")



# mostrar_promedio(estudiantes)
# mostrar_mayor(estudiantes)
# mostrar_menor(estudiantes)
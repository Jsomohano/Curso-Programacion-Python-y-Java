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

def cal_mas_baja(dict_calificaciones):
    mas_baja = 11  # Suponiendo escala de 0 a 10
    nombre_baja = ""
    for name, cal in dict_calificaciones.items():
        if cal < mas_baja:
            mas_baja = cal
            nombre_baja = name

    print(f"La persona {nombre_baja} tiene la calificación más baja de: {mas_baja}")


promedio(estudiantes)
cal_mas_alta(estudiantes)
cal_mas_baja(estudiantes)

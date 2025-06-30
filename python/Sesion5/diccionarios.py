edades = {
   # Key    : value
    "Jaime" : 27,
    "Pedro" : 28,
    "Lalo" : 25,
    "Carla" : 29
}

print(edades.get("Antonio"))

edades["Antonio"] = 30

print(edades.get("Antonio"))

edades.pop("Antonio")

print(edades.get("Antonio"))

lista_edades_amigos = [20,27,30,28]

edad_primer_amigo = lista_edades_amigos[0]

diccionario_edades_amigos = {
    "Jaime" : 25,
    "Pedro" : 28,
    "Lalo" : 25,
    "Carla" : 29
}


edad_jaime = diccionario_edades_amigos.get("Jaime")
diccionario_edades_amigos.pop("Carla")
diccionario_edades_amigos["Enrique"] = 26

if "Jaimess" in diccionario_edades_amigos:
    print("Si tienes este amigo")
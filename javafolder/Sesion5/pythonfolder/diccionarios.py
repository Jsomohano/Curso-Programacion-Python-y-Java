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
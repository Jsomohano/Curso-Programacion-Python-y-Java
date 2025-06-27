
numero = 5

numero_adivinado = int(input("Adivina el numero: "))

while(numero_adivinado != numero):
    print("Numero incorrecto, vuelve a intentarlo")
    numero_adivinado = int(input("Adivina el numero: "))

print("Has adivinado el numero")

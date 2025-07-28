class Carro:
    # Constructor de la clase
    # Atributos
    # Metodos
    def __init__(self, color, marca, num_llanta, placa="QWERTY"):
        self.color = color
        self.marca = marca
        self.placa = placa
        self.num_llantas = num_llanta

    def frenar(self):
        print("El carro está frenando")

    def arrancar(self):
        print("El carro está arrancando")
    
    def pitar(self):
        print("El carro está pitando")
    
    def estacionar(self):
        print("El carro está estacionando")
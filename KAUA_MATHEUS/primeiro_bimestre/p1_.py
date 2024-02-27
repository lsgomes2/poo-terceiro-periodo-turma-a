from random import randint


senha = '12345'
def controle():
    valores = [str(randint(1, 5)), str(randint(1, 5)),
               str(randint(1, 5)), str(randint(1, 5)),
               str(randint(1, 5))
               ]
    
    return valores
    

print(controle())


    
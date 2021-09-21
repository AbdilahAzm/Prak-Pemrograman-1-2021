def penjumlahan(a, b):
    return a + b
  
def pengurangan(a, b):
    return a - b
  
def perkalian(a, b):
    return a * b
  
def divide(a, b):
    return a / b

def modulus(a, b):
    return a % b

print(":::::::::: Kalkulator Sederhana ::::::::::")
print()
print("1. Penjumlahan")
print("2. Pengurangan")
print("3. Perkalian")
print("4. Pembagian")
print("5. Modulus")
print()

pilihan = int(input("Masukkan pilihanmu : "))
print()
  

if pilihan == 1:
    print("----- Penjumlahan -----")
    print()
    nilaiA = int(input("Nilai a : "))
    nilaiB = int(input("Nilai b : "))
    print("Hasil penjumlahan dari", end=" ")
    print(nilaiA, "+", nilaiB, "=",
                    penjumlahan(nilaiA, nilaiB))
  
elif pilihan == 2:
    print("----- Pengurangan -----")
    print()
    nilaiA = int(input("Nilai a : "))
    nilaiB = int(input("Nilai b : "))
    print("Hasil pengurangan dari", end=" ")
    print(nilaiA, "-", nilaiB, "=",
                    pengurangan(nilaiA, nilaiB))
  
elif pilihan == 3:
    print("----- Perkalian -----")
    print()
    nilaiA = int(input("Nilai a : "))
    nilaiB = int(input("Nilai b : "))
    print("Hasil perkalian dari", end=" ")
    print(nilaiA, "*", nilaiB, "=",
                    perkalian(nilaiA, nilaiB))
  
elif pilihan == 4:
    print("----- Pembagian -----")
    print()
    nilaiA = int(input("Nilai a : "))
    nilaiB = int(input("Nilai b : "))
    print("Hasil pembagian dari", end=" ")
    print(nilaiA, "/", nilaiB, "=",
                    divide(nilaiA, nilaiB))

elif pilihan == 5:
    print("----- Modulus -----")
    print()
    nilaiA = int(input("Nilai a : "))
    nilaiB = int(input("Nilai b : "))
    print("Hasil modulus dari", end=" ")
    print(nilaiA, "%", nilaiB, "=",
                    modulus(nilaiA, nilaiB))

else:
    print("Invalid input")

print()
print(":::::::::::::::: Selesai ::::::::::::::::")
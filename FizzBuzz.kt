fun main() {
    var counter = 1 //Inicializamos el contador en 1

    while (counter <= 100) { //Iniciamos un bucle que se ejecutará hasta que el contador llegue a 100
        if (counter % 3 == 0 && counter % 5 == 0) { //Comprobamos si el número es divisible por 3 y 5
            println("fizzbuzz") // Si es divisible por ambos, imprimimos "fizzbuzz"
        } else if (counter % 3 == 0) { // Comprobamos si el número es divisible por 3
            println("fizz") // Si es divisible por 3, imprimimos "fizz"
        } else if (counter % 5 == 0) { // Comprobamos si el número es divisible por 5
            println("buzz") // Si es divisible por 5, imprimimos "buzz"
        } else {
            println(counter) // Si no es divisible por 3 ni por 5, imprimimos el número en sí
        }

        counter++ // Incrementamos el contador en 1 para pasar al siguiente número
    }
}
fun main(args: Array<String>) {
    println("¡Hola, Bienvenido al restaurante XXX!")
    print("Este es nuestro nuevo sistema para ordenar. Antes de ver nuestro menú, ¿cuál es tu nombre?")
    var cliente = readLine().toString()
    print("¿Puedes decirnos cuántas personas te acompañan?")
    var acompanantes = readLine()!!.toInt()
    var nuevoCliente = Cliente("$cliente", acompanantes)
    var menuRestaurante = MenuClass().getMenu()
}
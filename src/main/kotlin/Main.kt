fun main(args: Array<String>) {
    println("¡Hola, Bienvenido al restaurante XXX!")
    print("Este es nuestro nuevo sistema para ordenar. Antes de ver nuestro menú, ¿cuál es tu nombre?")
   var cliente= readLine().toString()
    print("¿Puedes decirnos cuántas personas te acompañan?")
    var acompanantes= readLine().toString()
    print("¿Cuál es tu número de mesa? Lo puedes encontrar en la esquina de la mesa: ")
    var numMesa=readLine().toString()
    var nuevoCliente=Cliente("$cliente", "$acompanantes", "$numMesa")
    println("Muchas gracias. Aquí tienes nuestro menú. Cuando estés listo, ingresa:'Estoy listo para ordenar'")
}
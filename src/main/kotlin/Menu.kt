open class Menu {
    var categoriasDisponibles= setOf<String>("Arroz oriental",
        "Yakimeshi",
        "Ramen",
        "Entradas",
        "Especiales",
        "Bebidas")
    open fun getCategorias() {
        var cont = 1
        for (categoria in categoriasDisponibles) {
            println("$cont - $categoria")
            cont++
        }
    }
    open fun categoriaCTA(): Int{
        print("Selecciona el numero de opción:")
        var numeroCategoria= readLine()!!.toInt()
        return numeroCategoria
    }
}
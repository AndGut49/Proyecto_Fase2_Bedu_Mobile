class MenuClass() {

    var menuAvailable: Array<FoodClass> = arrayOf(
    FoodClass ("Arroz oriental","Gohan Samurai", "Preparado con tiras de cangrejo, aguacate",85.0),
        FoodClass("Arroz oriental","Gohan Furikake","Arroz blanco condimentado consalmón o camarón",75.0),
        FoodClass("Entradas","Camarones Roca","Camarón al tempura con salsa agridulce",145.0),
        FoodClass("Entradas","Edamames","Frijol de soja al vapor sazonado con sal",70.0)
    )
    var categoriesAvailable= setOf<String>("Arroz oriental",
        "Yakimeshi",
        "Ramen",
        "Entradas",
        "Especiales",
        "Bebidas")
    init{
        println("Cargando menu...")
    }

    fun getMenu(){
        var cont=1
        for (uniqueCategory in categoriesAvailable){
            println("-------${uniqueCategory}------")
            for(element in menuAvailable){
                if(uniqueCategory.toString().equals(element.foodCategory.toString())) {
                    println("${cont} - ${element.name} : $${element.price}")
                    println(element.description)
                    cont++
                }

            }
        }
        //var categoriesAvailable = mutableListOf<String>()
        //for (element in menuAvailable) {
            //categoriesAvailable.add(element[0]).toString())
        //}


    }
    open fun categoriaCTA(): Int{
        print("Selecciona el numero de opción:")
        var numeroCategoria= readLine()!!.toInt()
        return numeroCategoria
    }
}
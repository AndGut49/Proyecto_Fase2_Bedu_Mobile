data class FoodClass(
    var foodCategory: String,
    var name: String,
    var description: String,
    var price:Double
){
    operator fun get(i: Int): Any? {
return i
    }

}
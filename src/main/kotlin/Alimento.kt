open class Alimento: Menu() {
    private var nombre: String=""
    private var descripcion: String=""
    private var precio: Double=0.0

    override fun getCategorias() {
        super.getCategorias()
        super.categoriaCTA()
    }

    fun getNombre():String{
        return this.nombre
    }
    fun getDescription():String{
        return this.descripcion
    }
    fun getPrecio():Double{
        return this.precio
    }
}
interface ClienteActions{
 fun ordenar()
 fun pagar()
 fun statusPedido()
}
public class Cliente (nombre: String,acompanantes: Int,mesa: Int): ClienteActions{
    init {
        if(acompanantes!=null && mesa !=null) {
            println("Comensal creado")
        }
    }
    override fun ordenar(){

    }
    override fun pagar(){

    }

    override fun statusPedido() {
        TODO("Not yet implemented")
    }
}
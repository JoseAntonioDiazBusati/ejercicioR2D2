class Robot (val nombre: String) {

    var posX: Int = 0
    var posY: Int = 0
    var direccion: Direccion = Direccion.POSITIVEY

    fun mover(){}
    fun obtenerPosicion(){}
    fun obtenerDireccion(){}

    override fun toString(): String {
        return "$nombre está en ($posX, $posY) $direccion"
    }
}
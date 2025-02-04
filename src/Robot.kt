class Robot (val nombre: String) {

    var posX: Int = 0
    var posY: Int = 0
    var direccion: Direccion = Direccion.POSITIVEY

    fun mover(movimientos: Array<Int>){
        for (movimiento in movimientos) {
            when(direccion) {
                Direccion.POSITIVEY -> {
                    posY += movimiento
                    direccion = Direccion.NEGATIVEX
                }
                Direccion.NEGATIVEX -> {
                    posX -= movimiento
                    direccion = Direccion.NEGATIVEY
                }
                Direccion.NEGATIVEY -> {
                    posY -= movimiento
                    direccion = Direccion.POSITIVEX
                }
                Direccion.POSITIVEX -> {
                    posX += movimiento
                    direccion = Direccion.POSITIVEY
                }
            }
        }
    }
    fun obtenerPosicion():Direccion{
        return this.direccion
    }

    fun obtenerDireccion():Pair<Int,Int>{
        return Pair(posX, posY)
    }

    override fun toString(): String {
        return "$nombre está en (x: $posX, y: $posY), direccion: $direccion"
    }
}
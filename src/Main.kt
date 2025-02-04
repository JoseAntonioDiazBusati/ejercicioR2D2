/*
Calcula dónde estará un robot (sus coordenadas finales) que se encuentra en una cuadrícula representada por los ejes "x" e "y".

El robot comienza en la coordenada (0, 0).
Para indicarle que se mueva, le enviamos un array formado por enteros (positivos o negativos)
que indican la secuencia de pasos a dar. Por ejemplo: [10, 5, -2] indica que primero se mueve 10 pasos,
se detiene, luego 5, se detiene, y finalmente 2. El resultado en este caso sería (x: -5, y: 12)
Si el número de pasos es negativo, se desplazaría en sentido contrario al que está mirando.

Los primeros pasos los hace en el eje "y". Interpretamos que está mirando hacia la parte positiva del eje "y".
El robot tiene un fallo en su programación: cada vez que finaliza una secuencia de pasos gira 90 grados en el
sentido contrario a las agujas del reloj.
No te olvides lo aprendido en las primeras unidades. Estructura condicionales, repetitivas, comentarios, etc.
*/

fun main() {
    val r2d2 = Robot("R2D2")
    val movimientosRealizados: Array<Array<Int>> = arrayOf(
        arrayOf(1, -5, 0, -9),
        arrayOf(3, 3, 5, 6, 1, 0, 0, -7),
        arrayOf(2, 1, 0, -1, 1, 1, -4),
        arrayOf(),
        arrayOf(3, 5)
    )
    for (movimiento in movimientosRealizados){
        r2d2.mover(movimiento)
        println(r2d2)
    }
}
/*
-Tras los siguientes movimientos:

    [1, -5, 0, -9],
    [3, 3, 5, 6, 1, 0, 0, -7],
    [2, 1, 0, -1, 1, 1, -4],
    [],
    [3, 5]

-Las salidas son estas:

    R2D2 está en (-4, 1) PositiveY
    R2D2 está en (-8, 0) PositiveY
    R2D2 está en (-11, 7) PositiveX
    R2D2 está en (-11, 7) PositiveX
    R2D2 está en (-8, 12) NegativeX
*/
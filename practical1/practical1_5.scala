object main extends App{

    def easypace(d: Double): Double = d * 8

    def tempo(d: Double): Double = d * 7

    def totaltime(d_easy: Double, d_tempo: Double): Double = easypace(d_easy) + tempo(d_tempo)

    println(s"total running time : ${totaltime(4,3)}")
}
package kotlinf.course.inheritance

abstract class SpaceShip(
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false
): Shooting {
    abstract fun switchToUnmannedMode()
    open fun runSysDiagnostic(){
        println("$name: the ship's diagnostic system has been launched")
    }
}
package kotlinf.course.inheritance

class Scout(name: String, speed: Int, val radarRange: Int, val afterburnerSpeed: Int): SpaceShip(name, speed) {
    fun handleDataFromRadar(){
        println("$name: radar data processing")
    }
    fun runAfterburner(){
        println("$name: fast and furious has been launched")
    }
    override fun switchToUnmannedMode() {
        println("$name: switch to unmanned mode")
    }

    override fun startShooting() {
        println("$name: the cannons are firing")
    }

    override fun reloadCannon() {
        println("$name: the cannons are reloaded")
    }
}
package kotlinf.course.inheritance

class Industrial(name: String, speed: Int, val numberOfMines: Int): SpaceShip(name, speed, unmanned = true) {
    fun launchScanningDrones(){
        println("$name: scanning drones launched")
    }
    override fun switchToUnmannedMode() {
        println("$name: switch to unmanned mode")
    }
    override fun runSysDiagnostic(){
        super.runSysDiagnostic()
        println("$name: the system of diagnostics of drones and miners has been launched")
    }
    override fun startShooting() {
        println("$name: the cannons are firing")
    }
    override fun reloadCannon() {
        println("$name: the cannons are reloaded")
    }
}
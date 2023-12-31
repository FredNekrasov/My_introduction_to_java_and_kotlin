package kotlinf.course.constructors

class Ingredient(val name: String, val weight: Int, val count: Int) {
    private var isNeedToPrepare = false
    constructor(
        name: String,
        weight: Int,
        count: Int,
        needToPrepare: Boolean,
    ): this(name, weight, count){
        isNeedToPrepare = needToPrepare
    }
    init {
        println("The ingredient $name is created")
    }
}
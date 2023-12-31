package kotlinf.course.constructors

class Dish(
    private val id:Int,
    private val name: String,
    private val category: String,
    private val ingredients: List<String>,
    var isFavourite: Boolean = false,
){
    fun addToFavourites(){
        println("$name is added to favorites")
        isFavourite = true
    }
    fun removeFromFavourites(){
        println("$name is removed from favorites")
        isFavourite = false
    }
    fun getListOfIngredients(): List<String> = this.ingredients
}
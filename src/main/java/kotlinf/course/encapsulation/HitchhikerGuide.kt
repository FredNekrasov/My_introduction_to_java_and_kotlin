package kotlinf.course.encapsulation

internal class HitchhikerGuide (private val coefficient: Int?){
    private var title = ""
    private var isTranslated = false
    var catchSignal = 1
        get() = if(coefficient != null) field + coefficient else field
        set(value){
            field = value
            if(field > 3){
                isTranslated = true
                println("catalog is translated")
            }
        }
    private fun chooseArticles(){
        println("open catalog $title")
    }
    fun setTitle(str:String){
        title = str
        chooseArticles()
    }
    fun getTitle() = title
}
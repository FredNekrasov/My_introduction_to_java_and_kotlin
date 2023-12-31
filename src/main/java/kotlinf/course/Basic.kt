package kotlinf.course

import kotlinf.course.constructors.Dish
import kotlinf.course.constructors.Ingredient
import kotlinf.course.encapsulation.HitchhikerGuide
import kotlinf.course.inheritance.Industrial
import kotlinf.course.inheritance.Scout
import kotlinf.course.polymorphism.ListItem
import kotlinf.course.polymorphism.MessageItem
import kotlinf.course.polymorphism.NotesAppItem
import kotlinf.course.polymorphism.PhoneItem
import java.io.File
import java.math.BigInteger
import java.util.*

fun dataTypeEtc(){//Типы данных в kotlin
    val kingOfTheKingdom = "123456"
    val char = 's'
    val float = 1.4336f//Float
    val double = 3.5457585//Если не указать в конце f, то оно по умолчанию будет Double
    val byte: Byte = 4
    val n3: Short = 4
    val uInt: UInt = 9u//UInt можно использовать только положительные числа
    var int = 3
    int++
    --int
    val long: Long = 4
    val bool = true
    println(bool::class)
    println(uInt::class.simpleName)
    println("$kingOfTheKingdom $char ${float + double + byte + n3 + int + long}")
}
fun str(){
    val helloWorld = "Hello World"
    val symbol = '!'
    println(helloWorld + symbol)
    println("\'$helloWorld\"! ${24 + 25}")
    var strings = """
         bob
        james
          anthony
    """.trimIndent()
    println(strings)
    strings = """
         alan
        alex
          richard
    """
    println(strings)
    strings = """
            |fred
        |john
           |mike
    """.trimMargin()
    println(strings)
}
fun bool(){
    val n = readlnOrNull()?.toIntOrNull()
    val nn = readlnOrNull()?.toIntOrNull()
    if (n == null || nn == null) return
    val c4 = ((nn < n) or (n < nn)) and ((nn != n) && (n <= nn) || (n == nn))
    println(c4)
    println(n < nn)
    println(n > nn)
    println(n <= nn)
    println(n >= nn)
    print(n == nn)
    println(n != nn)
    println(n in 2..nn)
}
fun ifElseWhen(){
    println("Enter the word")
    val str = readlnOrNull() ?: return
    if (str == "hello") println("h")
    else println(str[0])
    var result = if (str == "hello") "O" else str[str.length - 1]
    println(result)
    println("Enter a number from 1 to 3")
    val number: Any = readln().toInt()
    when(number){
        is Int -> println("Int")
        else -> println("another data type")
    }
    val value = number.toString().toIntOrNull()
    result = when {
        value == null -> return
        value < 1 -> "$number true"
        value == 2 -> "$number true"
        value > 3 -> "$number true"
        else -> "$number false"
    }
    println(result)
}
fun loops(){
    var counter = 10
    while (counter > 0){
        println(counter--)
        Thread.sleep(1000)
    }
    do{
        println(--counter)
        Thread.sleep(1000)
    }while (counter > 0)
    //val range = 0 until 10
    val r1 = 0..10
    //val r2 = 10 downTo 0 step 2
    for (i in r1){
        if (i == 2) {
            println("the number was skipped")
            continue
        } else if (i == 8){
            println("the loop was interrupted")
            return //work like break
        }
        println(i)
        Thread.sleep(1000)
    }
}
fun arrayAndList(){
    val array = arrayOf(0,1,2,3,4)//Array(5) {0}
    array.forEach { println(it) }
    val set = setOf(1,2,3,4,5,5,5,5)
    set.forEachIndexed { index, i -> println("$index $i ${i + index}") }
    val map = mapOf(1 to "qwerty", 2 to "asdfgh", 3 to "zxcvb")
    map.filter { it.key % 2 != 0 }.forEach { (t, u) -> println("$t $u") }
    //list, set(sets have only unique elements), map(dictionary each element contains a key and a value)
    val list = listOf(0, 1, 2, 3, 4)//you cannot add values or delete them
    val mList = mutableListOf(4, 9, 25, 44, 99)//you can add values or delete them
    mList.add(4, 49)
    println(mList)
    for (i in list) { println(list[i]) }
    println(list.contains(4))
    println(list.indexOf(4))
    println(mList.lastIndexOf(9))
    println(mList.sort())
    println(list.sortedDescending())
    mList.forEach { element -> print("$element ") }
}
fun nullSafety(){
    val nullableString: String? = null //string?.length can be null, but string!!.length can't be null
    val elvisOperator = nullableString?.length ?: 5
    val elvisOperator1 = readlnOrNull()?.toBigIntegerOrNull() ?: BigInteger.valueOf(12345678098L)//Могут хранить огромное число
    println(elvisOperator)
    println(elvisOperator1)
}
fun constructorsTest(){
    val soup = Dish(0,
        "Soup",
        "Dinner",
        listOf("water", "salt", "meat", "carrot", "potato"),
    )
    val sandwich = Dish(id = 1,
        name = "Sandwich",
        category = "lunch",
        ingredients = listOf("bread", "cheese", "sauces", "sausage"),
    )
    soup.addToFavourites()
    sandwich.addToFavourites()
    println(soup.isFavourite)
    println(sandwich.isFavourite)
    val getItem = soup.getListOfIngredients()
    println(getItem)
    soup.removeFromFavourites()
    println(soup.isFavourite)
    val ingredient1 = Ingredient("potato", 100, 3, true)
    println(ingredient1.name)
}
fun inheritanceTest(){
    val scout = Scout("scout", 47, 50, 50)
    scout.runSysDiagnostic()
    scout.switchToUnmannedMode()
    scout.handleDataFromRadar()
    scout.runAfterburner()
    scout.startShooting()
    scout.reloadCannon()
    println("${scout.unmanned}\n\n")
    val industrial = Industrial("Industrial", 49, 5)
    industrial.runSysDiagnostic()
    industrial.switchToUnmannedMode()
    industrial.launchScanningDrones()
    industrial.startShooting()
    industrial.reloadCannon()
    println(industrial.unmanned)
}
fun encapsulationTest(){
    val guide = HitchhikerGuide(2)
    guide.setTitle("abra")
    println("${ guide.getTitle() } ${guide.catchSignal}")
    val guide1 = HitchhikerGuide(4)
    guide1.setTitle("abra")
    println("${ guide1.getTitle() } ${guide1.catchSignal}")
}
fun polymorphismTest(){
    val creationDate = Date()
    val messageItem: NotesAppItem = MessageItem("call sister", creationDate, "message", "call sister to congratulate")
    val phoneItem: NotesAppItem = PhoneItem("sister's number", creationDate, "phone", 75678755487)
    val noteList: NotesAppItem = ListItem("forLunch", creationDate, "list", listOf("sandwich", "sushi", "pizza"))
    val arrayNotes = arrayOf(messageItem, phoneItem, noteList)
    arrayNotes.forEach { println("${ it.getItemData() }\n") }
}
fun anonymousAndLambdaFuncTest(){
    val calendar = Calendar.getInstance()
    val dayToEndOfYear = fun() = 365 - calendar[Calendar.DAY_OF_YEAR]
    println("${dayToEndOfYear.invoke()} | ${dayToEndOfYear()}")
    val printStringWithLambda: (Int) -> Unit
    printStringWithLambda = {
        println("print str with lambda $it")
    }
    printStringWithLambda(49);
    println({it: Int -> "print str with anonymous fun $it" }(99))
}
fun writeToFile(){
    val f = File("C:\\text.txt")
    f.writeText("Hello World!")
}
fun testStatus() {
    val statusesFromServer = listOf(11, 22, 33)
    for(i in statusesFromServer){
        when(i){
            11 -> setStatus(Status.JUNIOR)
            22 -> setStatus(Status.MIDDLE)
            33 -> setStatus(Status.SENIOR)
            else -> setStatus(Status.UNKNOWN)
        }
        Thread.sleep(1000)
    }
    println("\n\n${Status.MIDDLE.name} ${Status.SENIOR.ordinal}")
    for(i in Status.entries) print("$i\t${i.getStatusDescription()}\n")
}
fun setStatus(status: Status){
    when(status){
        Status.JUNIOR -> println("Junior developer")
        Status.MIDDLE -> println("Middle developer")
        Status.SENIOR -> println("Senior developer")
        Status.UNKNOWN -> println("status unknown3")
    }
}
fun testFunctions(){
    "qwerty".let { println(it.elementAt(5)) }//(it; результат - результат вычисления lambda)
    "qwerty".also { println(it) }//(it; результат - it)
    "qwerty".apply { println(this.get(4)) }//(this; результат this)
    "qwerty".run { println(this[3]) }//(this; результат - результат вычисления lambda)
}
fun interface Printable {
    fun show()
}
fun testUnusualFeature(){
    val f = Printable { print("qwerty") }
    f.show()
}
fun main() {
    testUnusualFeature()
}
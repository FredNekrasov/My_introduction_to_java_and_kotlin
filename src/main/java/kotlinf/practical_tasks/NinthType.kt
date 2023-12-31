package kotlinf.practical_tasks

class NinthType {
//Разработайте программу, которая осуществляет ввод с клавиатуры информации о студентах: фамилия, имя, оценки, а также осуществляет вывод на экран информации о трех лучших студентах по среднему баллу.
    fun task1(){
        val s = """
            alex smith 5 5 5
            fred nekrasov 5 5 5
            emma brown 4 4 5
            john brown 2 2 5
            james williams 3 3 5
        """.trimIndent()
        val thirdPlace = s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> b.slice(2..<b.size).map { c -> c.toInt() }.average().toFloat() }.sortedByDescending { d -> d }.take(3).minBy { e -> e } } else 0 }
        s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> (b[0] + " " + b[1]) to b.slice(2..<b.size).map { c -> c.toInt() }.average().toFloat() }.sortedByDescending { d -> d.second }.groupBy { e -> e.second }.forEach { (_, students) -> students.sortedBy { g -> g.first }.forEach { (name, mark) -> if (mark >= thirdPlace.toFloat()) println("$name $mark") } } } else println("Error: String is empty or blank") }
    }
//Разработайте программу, которая осуществляет ввод с клавиатуры информации о студентах: фамилия, имя, оценки, а также осуществляет вывод на экран информации о трех худших студентах по среднему баллу.
    fun task2(){
        val s = """
            alex smith 5 5 5
            fred nekrasov 5 5 5
            emma brown 4 4 5
            john brown 2 2 5
            james williams 3 3 5
        """.trimIndent()
        val thirdPlace = s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> b.slice(2..<b.size).map { c -> c.toInt() }.average() }.sortedBy { d -> d }.take(3).maxBy { e -> e } } else 0 }
        s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> (b[0] + " " + b[1]) to b.slice(2..<b.size).map { c -> c.toInt() }.average().toFloat() }.sortedBy { d -> d.second }.groupBy { e -> e.second }.forEach { (_, students) -> students.sortedBy { g -> g.first }.forEach { (name, mark) -> if (mark <= thirdPlace.toFloat()) println("$name $mark") } } } else println("Error: String is empty or blank") }
    }
//Разработайте программу, которая осуществляет ввод с клавиатуры информации о студентах: фамилия, имя, оценки, а также осуществляет вывод на экран информации о трех лучших студентах по максимальному баллу.
    fun task3(){
        val s = """
            alex smith 5 5 5
            fred nekrasov 5 5 5
            emma brown 4 4 5
            john brown 2 2 4
            james williams 3 3 4
        """.trimIndent()
        val thirdPlace = s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> b.slice(2..<b.size).maxOf { c -> c.toInt() } }.sortedByDescending { d -> d }.take(3).minBy { e -> e } } else 0 }
        s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> (b[0] + " " + b[1]) to b.slice(2..<b.size).maxOf { c -> c.toInt() } }.sortedByDescending { d -> d.second }.groupBy { e -> e.second }.forEach { (_, students) -> students.sortedBy { g -> g.first }.forEach { (name, mark) -> if (mark >= thirdPlace) println("$name $mark") } } } else println("Error: String is empty or blank") }
    }
//Разработайте программу, которая осуществляет ввод с клавиатуры информации о студентах: фамилия, имя, оценки, а также осуществляет вывод на экран информации о трех худших студентах по максимальному баллу.
    fun task4(){
        val s = """
            alex smith 5 5 5
            fred nekrasov 5 5 5
            emma brown 4 4 2
            john brown 2 2 4
            james williams 3 3 3
        """.trimIndent()
        val thirdPlace = s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> b.slice(2..<b.size).maxOf { c -> c.toInt() } }.sortedByDescending { d -> d }.take(3).minBy { e -> e } } else 0 }
        s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> (b[0] + " " + b[1]) to b.slice(2..<b.size).maxOf { c -> c.toInt() } }.sortedByDescending { d -> d.second }.groupBy { e -> e.second }.forEach { (_, students) -> students.sortedBy { g -> g.first }.forEach { (name, mark) -> if (mark <= thirdPlace) println("$name $mark") } } } else println("Error: String is empty or blank") }
    }
//Разработайте программу, которая осуществляет ввод с клавиатуры информации о студентах: фамилия, имя, оценки, а также осуществляет вывод на экран информации о трех лучших студентах по минимальному баллу.
    fun task5(){
        val s = """
            alex smith 5 5 2
            fred nekrasov 5 5 5
            emma brown 4 4 5
            john brown 2 2 5
            james williams 3 3 5
        """.trimIndent()
        val thirdPlace = s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> b.slice(2..<b.size).minOf { c -> c.toInt() } }.sortedByDescending { d -> d }.take(3).minBy { e -> e } } else 0 }
        s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> (b[0] + " " + b[1]) to b.slice(2..<b.size).minOf { c -> c.toInt() } }.sortedByDescending { d -> d.second }.groupBy { e -> e.second }.forEach { (_, students) -> students.sortedBy { g -> g.first }.forEach { (name, mark) -> if (mark <= thirdPlace) println("$name $mark") } } } else println("Error: String is empty or blank") }
    }
}
package kotlinf.pws.thirdPW

/*С клавиатуры вводится информация о студентах: фамилия, имя, оценки. Выведите на экран информацию о трех лучших студентах по максимальному баллу.
В случае, если у нескольких студентов средний балл совпадает, то выведите большее число студентов (пока не будут выведены все студенты или не будут полностью исчерпаны студенты с тремя лучшими баллами).
Вывод надо осуществлять в порядке убывания максимального балла, а для одинаковых максимальных баллов – в алфавитном порядке по фамилии и имени.*/
fun main() {
    val s = """
        alex smith 5 5 5
        fred nekrasov 5 5 5
        emma brown 4 4 5
        john brown 2 2 5
        james williams 3 3 5
    """.trimIndent()
    val thirdPlace = s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> b.slice(2..<b.size).maxOf { c -> c.toInt() } }.sortedByDescending { d -> d }.take(3).minBy { e -> e } } else 0 }
    s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> (b[0] + " " + b[1]) to b.slice(2..<b.size).maxOf { c -> c.toInt() } }.sortedByDescending { d -> d.second }.groupBy { e -> e.second }.forEach { (_, students) -> students.sortedBy { g -> g.first }.forEach { (name, mark) -> if (mark >= thirdPlace) println("$name $mark") } } } else println("Error: String is empty or blank") }
}
/*fun mainVersion() {
    val s = """
        alex smith 5 5 5
        fred nekrasov 5 5 5
        emma brown 4 5 5
        john brown 3 5 5
        james williams 4 5 5
    """.trimIndent()
    s.let {
        if (it.isNotEmpty() && it.isNotBlank()) {
            it.trim().lines()
                .asSequence()
                .map { a -> a.split(" ") }
                .map { b -> (b[0] + " " + b[1]) to b.slice(2..<b.size).map { c -> c.toInt() }.average() }
                .sortedByDescending { d -> d.second }
                .take(3)
                .groupBy { e -> e.second }
                .forEach { (_, students) ->
                    students.sortedBy { g -> g.first }
                        .forEach { (name, mark) -> println("$name $mark") }
                }
        } else println("Error: String is empty or blank")
    }
}*/
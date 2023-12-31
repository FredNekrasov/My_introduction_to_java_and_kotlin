package kotlinf.practical_tasks.eleventh_type

class StudentInfoRepository {
    private val list = mutableListOf<Student>()
    fun getList() = list.toList()
    fun addInfo(student: Student) = list.add(student)
}
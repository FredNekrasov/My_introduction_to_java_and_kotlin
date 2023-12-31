package kotlinf.practical_tasks.eleventh_type.io

import kotlinf.practical_tasks.eleventh_type.StudentInfoRepository

class OutputStudentData(
        private val repository: StudentInfoRepository
) : IOutputStudentData {
    override fun printingData() {
        repository.getList().forEach { println("${it.surname} ${it.name} ${it.mark}") }
    }
}
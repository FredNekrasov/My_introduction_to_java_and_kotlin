package kotlinf.practical_tasks.eleventh_type.io.input_name

import kotlinf.practical_tasks.eleventh_type.check_data.ICheckStudentName

class InputStudentName(
        private val checkName: ICheckStudentName
) : IInputStudentName {
    override fun scanStudentName(): String? {
        println("Enter the student's name")
        return readlnOrNull().let {
            if (it == null) {
                println("Error: Value is null"); null
            } else checkName.check(it)
        }
    }
}
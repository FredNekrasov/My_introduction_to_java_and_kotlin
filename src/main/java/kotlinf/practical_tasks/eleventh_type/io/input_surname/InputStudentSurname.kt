package kotlinf.practical_tasks.eleventh_type.io.input_surname

import kotlinf.practical_tasks.eleventh_type.check_data.ICheckStudentSurname

class InputStudentSurname(
        private val checkSurname: ICheckStudentSurname
) : IInputStudentSurname {
    override fun scanStudentSurname(): String? {
        println("Enter the student's surname")
        return readlnOrNull().let { if (it == null) { println("Error: Value is null"); null } else checkSurname.check(it) }
    }
}
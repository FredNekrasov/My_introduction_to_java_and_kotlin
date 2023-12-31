package kotlinf.practical_tasks.eleventh_type.io.input_mark

import kotlinf.practical_tasks.eleventh_type.check_data.*

class InputStudentMark(
        private val checkMark: ICheckStudentMark,
) : IInputStudentMark {
    override fun scanMark(): Int? {
        println("Enter the student's mark")
        return readlnOrNull().let {
            if (it == null) {
                println("Error: Value is null"); null
            } else checkMark.check(it)
        }
    }
}
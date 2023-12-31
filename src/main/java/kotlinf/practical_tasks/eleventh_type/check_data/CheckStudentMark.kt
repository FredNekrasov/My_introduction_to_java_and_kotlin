package kotlinf.practical_tasks.eleventh_type.check_data

class CheckStudentMark : ICheckStudentMark {
    override fun check(mark: String?): Int? {
        val inf = mark?.toIntOrNull()
        return if ((inf != null) && (inf in 1..5)) inf else null
    }
}
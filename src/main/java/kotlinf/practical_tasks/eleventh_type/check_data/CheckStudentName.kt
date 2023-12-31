package kotlinf.practical_tasks.eleventh_type.check_data

class CheckStudentName : ICheckStudentName {
    override fun check(name: String?): String? = if (name.isNullOrEmpty() || name.isBlank()) null else name
}
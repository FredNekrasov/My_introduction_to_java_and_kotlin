package kotlinf.practical_tasks.eleventh_type.check_data

class CheckStudentSurname : ICheckStudentSurname {
    override fun check(surname: String?): String? = if (surname.isNullOrEmpty() || surname.isBlank()) null else surname
}
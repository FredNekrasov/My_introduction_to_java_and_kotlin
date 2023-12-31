package kotlinf.practical_tasks.eleventh_type

import kotlinf.practical_tasks.eleventh_type.check_data.CheckStudentMark
import kotlinf.practical_tasks.eleventh_type.check_data.CheckStudentName
import kotlinf.practical_tasks.eleventh_type.check_data.CheckStudentSurname
import kotlinf.practical_tasks.eleventh_type.io.OutputStudentData
import kotlinf.practical_tasks.eleventh_type.io.input_mark.InputStudentMark
import kotlinf.practical_tasks.eleventh_type.io.input_name.InputStudentName
import kotlinf.practical_tasks.eleventh_type.io.input_surname.InputStudentSurname

class EleventhType {
    //Похоже, весь SOLID реализовал
    private val repository = StudentInfoRepository()
    private val output = OutputStudentData(repository)
    private val checkSurname = CheckStudentSurname()
    private val checkName = CheckStudentName()
    private val checkMark = CheckStudentMark()
    private val inputMark = InputStudentMark(checkMark)
    private val inputName = InputStudentName(checkName)
    private val inputSurname = InputStudentSurname(checkSurname)
//Разработайте программу ввода и вывода информации о студентах с проверкой корректности заполнения полей с соблюдением принципа D SOLID. О студентах хранится информация: фамилия, имя, оценка.
    fun dependencyInversionPrinciple(int: Int) {
        repeat(int) {
//Можно сделать 1 класс для ввода данных и туда передать интерфейсы проверкок и репозитория. Без repeat'ов
            val surname = inputSurname.scanStudentSurname()
            val name = inputName.scanStudentName()
            val mark = inputMark.scanMark()
            if (!surname.isNullOrEmpty() && !name.isNullOrEmpty() && (mark != null)) repository.addInfo(Student(surname, name, mark))
            output.printingData()
        }
    }
//Разработайте программу ввода и вывода информации о студентах с проверкой корректности заполнения полей с соблюдением принципа O SOLID. О студентах хранится информация: фамилия, имя, оценка.
    fun openClosedPrinciple(int: Int) {
//Надо переписать точно также, как и тут. Без repeat'ов
        repeat(int) {
            val surname = inputSurname.scanStudentSurname()
            val name = inputName.scanStudentName()
            val mark = inputMark.scanMark()
            if (!surname.isNullOrEmpty() && !name.isNullOrEmpty() && (mark != null)) repository.addInfo(Student(surname, name, mark))
            output.printingData()
        }
    }
//Разработайте программу ввода и вывода информации о студентах с проверкой корректности заполнения полей с соблюдением принципа S SOLID. О студентах хранится информация: фамилия, имя, оценка.
    fun singleResponsibilityPrinciple(int: Int) {
//Можно сделать 1 класс для ввода данных и туда передать проверки и репозитория, а также можно без интерфейсов делать. Без repeat'ов
        repeat(int) {
            val surname = inputSurname.scanStudentSurname()
            val name = inputName.scanStudentName()
            val mark = inputMark.scanMark()
            if (!surname.isNullOrEmpty() && !name.isNullOrEmpty() && (mark != null)) repository.addInfo(Student(surname, name, mark))
            output.printingData()
        }
    }
}
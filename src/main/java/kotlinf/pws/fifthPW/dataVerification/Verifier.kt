package kotlinf.pws.fifthPW.dataVerification

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Verifier : CheckData {
    override fun checkString(inf: String?): String? {
        return if (!inf.isNullOrEmpty() && inf.isNotBlank()) inf else null
    }

    override fun checkInt(inf: String?): Int? {
        val i = inf?.toIntOrNull()
        return if ((i != null) && (i > 0)) i else null
    }

    override fun checkMark(inf: String?): Int? {
        val i = inf?.toIntOrNull()
        return if ((i != null) && (i > 0) && (i <= 5)) i else null
    }

    override fun checkDate(inf: String?): LocalDate? {
        return if ((inf != null) && (inf.contains(Regex("""^\d\d\.\d\d\.\d\d\d\d$""")))) {
            val date = LocalDate.parse(inf, DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            if ((date < LocalDate.now()) && (date > LocalDate.of(2023, 9, 1))) {
                date
            } else null
        } else null
    }
}
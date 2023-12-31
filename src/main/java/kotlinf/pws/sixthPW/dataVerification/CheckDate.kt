package kotlinf.pws.sixthPW.dataVerification

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import javax.inject.Inject

class CheckDate @Inject constructor() : IDate {
    override fun check(inf: String?): LocalDate? {
        return if ((inf != null) && (inf.contains(Regex("""^\d\d\.\d\d\.\d\d\d\d$""")))) {
            val date = LocalDate.parse(inf, DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            if ((date < LocalDate.now()) && (date > LocalDate.of(2023, 9, 1))) date else null
        } else null
    }
}
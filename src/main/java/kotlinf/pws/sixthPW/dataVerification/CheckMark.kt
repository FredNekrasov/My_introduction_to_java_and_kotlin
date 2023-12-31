package kotlinf.pws.sixthPW.dataVerification

import javax.inject.Inject

class CheckMark @Inject constructor() : IMark {
    override fun check(inf: String?): Int? {
        val i = inf?.toIntOrNull()
        return if ((i != null) && (i > 0) && (i <= 5)) i else null
    }
}
package kotlinf.pws.sixthPW.dataVerification

import javax.inject.Inject

class CheckLVL @Inject constructor() : ILvl {
    override fun check(inf: String?): Int? {
        val i = inf?.toIntOrNull()
        return if ((i != null) && (i > 0)) i else null
    }
}
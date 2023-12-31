package kotlinf.pws.sixthPW.dataVerification

import javax.inject.Inject

class CheckVariant @Inject constructor() : IVariant {
    override fun check(inf: String?): Int? {
        val i = inf?.toIntOrNull()
        return if ((i != null) && (i > 0)) i else null
    }
}
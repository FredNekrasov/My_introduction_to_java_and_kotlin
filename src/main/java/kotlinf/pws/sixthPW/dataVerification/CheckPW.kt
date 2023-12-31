package kotlinf.pws.sixthPW.dataVerification

import javax.inject.Inject

class CheckPW @Inject constructor() : IPW {
    override fun check(inf: String?): String? {
        return if (!inf.isNullOrEmpty() && inf.isNotBlank()) inf else null
    }
}
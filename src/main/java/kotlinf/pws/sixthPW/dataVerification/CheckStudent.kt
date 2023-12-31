package kotlinf.pws.sixthPW.dataVerification

import javax.inject.Inject

class CheckStudent @Inject constructor() : IStudent {
    override fun check(inf: String?): String? {
        return if (!inf.isNullOrEmpty() && inf.isNotBlank()) inf else null
    }
}
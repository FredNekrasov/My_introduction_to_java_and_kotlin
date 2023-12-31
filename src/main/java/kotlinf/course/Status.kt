package kotlinf.course

enum class Status{
    JUNIOR {
        override fun getStatusDescription(): String {
            return "he has little experience and knowledge"
        }
    },
    MIDDLE {
        override fun getStatusDescription(): String {
            return "he has enough experience and knowledge, but less than senior"
        }
    },
    SENIOR {
        override fun getStatusDescription(): String {
            return "he has a lot of experience and knowledge"
        }
    },
    UNKNOWN {
        override fun getStatusDescription(): String {
            return "Unidentified status"
        }
    };
    abstract fun getStatusDescription(): String
}
package im.vector.matrix.core.api.failure

import com.squareup.moshi.Json

data class MatrixError(@Json(name = "errcode") val code: String,
                       @Json(name = "error") val message: String) {

    companion object {
        const val FORBIDDEN = "M_FORBIDDEN"
        const val UNKNOWN = "M_UNKNOWN"
        const val UNKNOWN_TOKEN = "M_UNKNOWN_TOKEN"
        const val BAD_JSON = "M_BAD_JSON"
        const val NOT_JSON = "M_NOT_JSON"
        const val NOT_FOUND = "M_NOT_FOUND"
        const val LIMIT_EXCEEDED = "M_LIMIT_EXCEEDED"
        const val USER_IN_USE = "M_USER_IN_USE"
        const val ROOM_IN_USE = "M_ROOM_IN_USE"
        const val BAD_PAGINATION = "M_BAD_PAGINATION"
        const val UNAUTHORIZED = "M_UNAUTHORIZED"
        const val OLD_VERSION = "M_OLD_VERSION"
        const val UNRECOGNIZED = "M_UNRECOGNIZED"

        const val LOGIN_EMAIL_URL_NOT_YET = "M_LOGIN_EMAIL_URL_NOT_YET"
        const val THREEPID_AUTH_FAILED = "M_THREEPID_AUTH_FAILED"
        // Error code returned by the server when no account matches the given 3pid
        const val THREEPID_NOT_FOUND = "M_THREEPID_NOT_FOUND"
        const val THREEPID_IN_USE = "M_THREEPID_IN_USE"
        const val SERVER_NOT_TRUSTED = "M_SERVER_NOT_TRUSTED"
        const val TOO_LARGE = "M_TOO_LARGE"
        const val M_CONSENT_NOT_GIVEN = "M_CONSENT_NOT_GIVEN"
        const val RESOURCE_LIMIT_EXCEEDED = "M_RESOURCE_LIMIT_EXCEEDED"
    }
}
package android.auth.oidc.pkce

enum class CodeChallengeMethod(
    val method: String,
    val algorithm: String = ""
) {

    PLAIN_TEXT("plain"),
    SHA_256("S256", "SHA-256")

}
package android.auth.oidc.pkce

data class PkcePair(
    val verifier: String,
    val challenge: String
)
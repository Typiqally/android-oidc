package android.auth.oidc

enum class GrantType(val grant: String) {

    AUTHORIZATION_CODE("authorization_code"),
    CLIENT_CREDENTIALS("client_credentials"),
    PASSWORD("password"),
    IMPLICIT("implicit")

}
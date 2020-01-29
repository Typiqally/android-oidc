package android.auth.oidc

enum class ResponseType(val type: String) {

    AUTHORIZATION_CODE("code"),
    ACCESS_TOKEN("token"),
    IDENTITY_TOKEN("id_token")

}
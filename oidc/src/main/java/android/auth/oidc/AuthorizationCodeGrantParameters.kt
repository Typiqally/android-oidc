package android.auth.oidc

import android.net.Uri

data class AuthorizationCodeGrantParameters(
    val clientId: String,
    val clientSecret: String? = null,
    val redirectUri: Uri,
    val responseTypes: List<ResponseType>,
    val scopes: List<String>
)
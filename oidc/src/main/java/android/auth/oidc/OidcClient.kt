package android.auth.oidc

import android.auth.oidc.pkce.CodeChallengeMethod
import android.net.Uri

class OidcClient(
    authority: Uri,
    grantType: GrantType,
    useCodeChallenge: Boolean = true,
    codeChallengeMethod: CodeChallengeMethod = CodeChallengeMethod.SHA_256
) {

}
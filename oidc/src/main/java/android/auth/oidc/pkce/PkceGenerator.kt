package android.auth.oidc.pkce

import android.os.Build
import androidx.annotation.RequiresApi
import java.security.MessageDigest
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
class PkceGenerator(
    private val method: CodeChallengeMethod = CodeChallengeMethod.SHA_256,
    private val length: Int = 48
) {
    private val characters = ('a'..'z').toList().toTypedArray()

    fun generatePair(): PkcePair {
        val verifier = generateVerifier()
        var challenge = verifier

        if (method == CodeChallengeMethod.SHA_256) {
            challenge = generateChallenge(verifier)
        }

        return PkcePair(verifier, challenge)
    }

    private fun generateChallenge(verifier: String): String {
        val sha: MessageDigest = MessageDigest.getInstance(method.algorithm)
        sha.update(verifier.toByteArray())

        val digest: ByteArray = sha.digest()

        return Base64.getUrlEncoder().encodeToString(digest)
    }

    private fun generateVerifier(): String {
        return (1..length).map { characters.random() }.joinToString("")
    }
}
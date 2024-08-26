package fr.delcey.data

import org.junit.Assert.assertTrue
import org.junit.Test

class RepositoryTest {
    @Test
    fun `getUsers() should return one of predefined users`() {
        // When
        val user = Repository().getUser()

        // Then
        assertTrue(
            user in listOf(
                User(
                    firstName = "Nino",
                    surname = "DLC",
                ),
                User(
                    firstName = "Adam Whitney",
                    surname = "SAVAGE",
                ),
                User(
                    firstName = "Bob",
                    surname = "L'ÉPONGE",
                ),
            )
        )
    }
}
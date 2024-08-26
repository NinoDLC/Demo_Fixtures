package fr.delcey.demo_fixts

import fr.delcey.data.Repository
import fr.delcey.data.User
import fr.delcey.fixtures.DataFixtures.getDefaultUser
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    private val repository: Repository = mockk()

    @Before
    fun setUp() {
        every { repository.getUser() } returns getDefaultUser()
    }

    @Test
    fun `nominal - getMainText() should return 'Hello, Nino DLC!'`() {
        // When
        val mainText = MainViewModel(repository).getMainText()

        // Then
        assertEquals("Hello, Nino DLC!", mainText)
    }

    @Test
    fun `edge - getMainText() should work with multiple first name like Adam Whitney SAVAGE`() {
        // Given
        every { repository.getUser() } returns User(
            firstName = "Adam Whitney",
            surname = "SAVAGE",
        )

        // When
        val mainText = MainViewModel(repository).getMainText()

        // Then
        assertEquals("Hello, Adam Whitney SAVAGE!", mainText)
    }
}
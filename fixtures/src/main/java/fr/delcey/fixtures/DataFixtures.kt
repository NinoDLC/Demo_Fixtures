package fr.delcey.fixtures

import fr.delcey.data.User

object DataFixtures {
    fun getDefaultUser(): User = User(
        "Nino",
        "DLC",
    )
}
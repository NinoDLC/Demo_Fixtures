package fr.delcey.data

class Repository {
    private val users = listOf(
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

    fun getUser(): User = users.random()
}

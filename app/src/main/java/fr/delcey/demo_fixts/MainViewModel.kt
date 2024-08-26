package fr.delcey.demo_fixts

import fr.delcey.data.Repository

class MainViewModel(
    private val repository: Repository
) {
    fun getMainText(): String {
        val user = repository.getUser()

        return "Hello, ${user.firstName} ${user.surname}!"
    }
}

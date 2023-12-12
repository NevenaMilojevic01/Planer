package com.example.planer

object RegistrationTests {

    fun validateRegistrationInput(
        username: String,
        email: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if(username.isEmpty() || email.isEmpty()) {
            return false
        }
        if(password != confirmedPassword) {
            return false
        }
        return true
    }
}
package com.example.planer

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationTest {

    @Test
    fun parametersIsEmpty() {
        val result = RegistrationTests.validateRegistrationInput(
            "Sara",
            "",
            "123456",
            "123456"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun parametersIsEmpty2() {
        val result = RegistrationTests.validateRegistrationInput(
            "",
            "sara@gmail.com",
            "123456",
            "123456"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun notEquals() {
        val result = RegistrationTests.validateRegistrationInput(
            "Sara",
            "sara@gmail.com",
            "123456",
            "654321"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun validInputs() {
        val result = RegistrationTests.validateRegistrationInput(
            "Sara",
            "sara@gmail.com",
            "123456",
            "123456"
        )
        assertThat(result).isTrue()
    }

}
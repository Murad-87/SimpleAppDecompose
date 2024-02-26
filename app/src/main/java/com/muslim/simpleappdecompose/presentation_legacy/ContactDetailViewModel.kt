package com.muslim.simpleappdecompose.presentation_legacy

import androidx.lifecycle.ViewModel
import com.muslim.simpleappdecompose.data.RepositoryImpl
import com.muslim.simpleappdecompose.domain.AddContactUseCase
import com.muslim.simpleappdecompose.domain.Contact
import com.muslim.simpleappdecompose.domain.EditContactUseCase

class ContactDetailViewModel : ViewModel() {

    private val repository = RepositoryImpl

    private val addContactUseCase = AddContactUseCase(repository)
    private val editContactUseCase = EditContactUseCase(repository)

    fun addContact(username: String, phone: String) {
        addContactUseCase(username, phone)
    }

    fun editContact(contact: Contact) {
        editContactUseCase(contact)
    }
}
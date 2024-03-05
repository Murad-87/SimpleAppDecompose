package com.muslim.simpleappdecompose.presentation

import com.arkivanov.mvikotlin.core.store.Store
import com.muslim.simpleappdecompose.domain.Contact

interface ContactListStore :
    Store<ContactListStore.Intent, ContactListStore.State, ContactListStore.Label> {

        //TODO

    data class State(
        val contactList: List<Contact>
    )

    sealed interface Intent {

        data class SelectContact(val contact: Contact) : Intent

        object AddContact : Intent
    }

    sealed interface Label {

        data class EditContact(val contact: Contact) : Label

        object AddContact : Label
    }
}
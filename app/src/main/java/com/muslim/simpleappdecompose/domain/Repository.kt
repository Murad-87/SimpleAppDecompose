package com.muslim.simpleappdecompose.domain

import kotlinx.coroutines.flow.Flow

interface Repository {

    val contacts: Flow<List<Contact>>

    fun saveContact(contact: Contact)
}
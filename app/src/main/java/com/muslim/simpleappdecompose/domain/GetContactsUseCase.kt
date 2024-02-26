package com.muslim.simpleappdecompose.domain

import kotlinx.coroutines.flow.Flow

class GetContactsUseCase(
    private val repository: Repository
) {

    operator fun invoke(): Flow<List<Contact>> = repository.contacts
}
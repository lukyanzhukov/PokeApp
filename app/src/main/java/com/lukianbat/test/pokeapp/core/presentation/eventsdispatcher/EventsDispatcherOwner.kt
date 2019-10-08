package com.lukianbat.test.pokeapp.core.presentation.eventsdispatcher

interface EventsDispatcherOwner<T> {
    val eventsDispatcher: EventsDispatcher<T>
}
package com.mvi.todo.presentation.base.model

import androidx.lifecycle.LiveData
import com.mvi.todo.presentation.base.intent.IIntent
import com.mvi.todo.presentation.base.state.IState
import kotlinx.coroutines.channels.Channel

interface IModel<S: IState, I: IIntent> {
    val intents: Channel<I>
    val state: LiveData<S>
}
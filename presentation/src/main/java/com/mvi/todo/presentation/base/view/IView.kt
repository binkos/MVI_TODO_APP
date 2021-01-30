package com.mvi.todo.presentation.base.view

import com.mvi.todo.presentation.base.state.IState

interface IView<S : IState> {
    fun render(state: S)
}
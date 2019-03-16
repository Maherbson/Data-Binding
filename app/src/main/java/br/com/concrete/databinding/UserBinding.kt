package br.com.concrete.databinding

import androidx.databinding.ObservableField

class UserBinding(
    val nome: ObservableField<String> = ObservableField(""),
    val email: ObservableField<String> = ObservableField("")
)
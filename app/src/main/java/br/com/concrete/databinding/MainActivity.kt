package br.com.concrete.databinding

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import br.com.concrete.databinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.user = UserBinding(
            ObservableField("Usuario"),
            ObservableField("usuario@email.com.br")
        )

        button.setOnClickListener {
            val userBinding = binding.user
            userBinding?.let {
                Log.d("LOG-NOME", userBinding.nome.get())
                Log.d("LOG-EMAIL", userBinding.email.get())
            }
        }
    }
}

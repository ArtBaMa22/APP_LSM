package com.example.ensaame


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setup()
    }


    private fun setup(){
        title = "Autenticacion"

        btnRegist.setOnClickListener {
             if (txtEmail.text.isNotEmpty() && txtPass.text.isNotEmpty()){

                 FirebaseAuth.getInstance()
                   .createUserWithEmailAndPassword(txtEmail.text.toString(),
                 txtPass.text.toString()).addOnCompleteListener {
                   if (it.isSuccessful){
                      showHome(it.result?.user?.email ?:"",ProviderType.BASIC)
                 }else{
                       showAlert()
             }
            }
            }
        }


        btnIniciar.setOnClickListener {
            if (txtEmail.text.isNotEmpty() && txtPass.text.isNotEmpty()){
                FirebaseAuth.getInstance().signInWithEmailAndPassword(txtEmail.text.toString(),
                    txtPass.text.toString()).addOnCompleteListener {
                    if (it.isSuccessful){
                        showHome(it.result?.user?.email ?:"",ProviderType.BASIC)
                    }else{
                        showAlert()
                    }
                }
            }
        }
    }

    private fun showAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showHome(email: String, provider: ProviderType){

        val homeIntent = Intent(this,MainActivity::class.java).apply {
            putExtra("email",email)
            putExtra("provider",provider.name)
        }
        startActivity(homeIntent)
    }


}
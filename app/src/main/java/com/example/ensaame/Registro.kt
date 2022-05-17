package com.example.ensaame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isNotEmpty
import com.example.ensaame.Interface.IOnBackPressed
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_registro.*
import kotlinx.android.synthetic.main.activity_registro.btnGuardar
import kotlinx.android.synthetic.main.activity_registro.txtEmail

class Registro : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onBackPressed() {
        val fragment = this.supportFragmentManager.findFragmentById(R.id.cerrarSesion)
        (fragment as? IOnBackPressed)?.onBackPressed()?.not()?.let { isCanceled: Boolean ->
            if (!isCanceled) super.onBackPressed()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
    }

    private fun setup(email: String, provider: ProviderType){
        title = "Autenticacion"
      //  txtEmail.text = email

       // btnRegist.setOnClickListener {
         //   startActivity(Intent(this, Registro::class.java))
            // if (txtEmail.text.isNotEmpty() && txtPass.text.isNotEmpty()){

            //   FirebaseAuth.getInstance().createUserWithEmailAndPassword(txtEmail.text.toString(),
            //     txtPass.text.toString()).addOnCompleteListener {
            //       if (it.isSuccessful){
            //           showHome(it.result?.user?.email ?:"",ProviderType.BASIC)
            //     }else{
            //           showAlert()
            // }
            //}
            //}
   //     }
        btnGuardar.setOnClickListener {
            if (txtEmail.text.isNotEmpty() && txtpass.isNotEmpty()){
                FirebaseAuth.getInstance().signInWithEmailAndPassword(txtEmail.text.toString(),
                    txtPass.toString()).addOnCompleteListener {
                    if (it.isSuccessful){
                        showHome(it.result?.user?.email ?:"",ProviderType.BASIC)
                    }else{
                        showAlert()
                    }
                }
            }
        }

        btnGuardar.setOnClickListener {
            db.collection("usuarios").document()
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

        val homeIntent = Intent(this,PerfilFragment::class.java).apply {
            putExtra("email",email)
            putExtra("provider",provider.name)
        }
        startActivity(homeIntent)
    }



}
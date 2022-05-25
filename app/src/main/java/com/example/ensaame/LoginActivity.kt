package com.example.ensaame


import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat.startActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setup()
       // session()
    }

    override fun onStart() {
        super.onStart()
        authLayout.visibility = View.VISIBLE
    }

    private fun session(){
        val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE)
        val email = prefs.getString("email",null)
        val provider = prefs.getString("provider",null)
        if(email != null && provider != null){
            authLayout.visibility = View.INVISIBLE
            showHome2(email, ProviderType.valueOf(provider))
        }
    }


    private fun setup(){
        title = "Autenticacion"

        btnRegist.setOnClickListener {
            if (txtEmail.text.isNotEmpty() && txtPass.text.isNotEmpty()){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(txtEmail.text.toString(), txtPass.text.toString()).addOnCompleteListener {
                    if (it.isSuccessful){
                        showHome2(it.result?.user?.email ?: "",ProviderType.BASIC)
                    }else{
                         showAlert()
                    }
                }
            }
        }
        btnGoogle.setOnClickListener {
            //Configuracion
   //    val googleConfig = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
     //      .requestIdToken(getString(R.string.))

        }


              try{
                  btnGuardar.setOnClickListener {
                      if (txtEmail.text.isNotEmpty() && txtPass.text.isNotEmpty()){
                          FirebaseAuth.getInstance().signInWithEmailAndPassword(txtEmail.text.toString(),
                              txtPass.text.toString()).addOnCompleteListener{
                                  if (it.isSuccessful){
                              showHome(it.result?.user?.email ?:"",ProviderType.BASIC)
                                }
                              else{
                                showAlert()
                              }
                          }
                      }
                  }
              } catch (e: FirebaseAuthException){
                  if(e.message.toString() == "user-not-found"){
                      val toast = Toast.makeText(this,"Usuario no Encontado", Toast.LENGTH_SHORT).show()

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

    private fun showHome(email: String, provider: ProviderType) {
        val homeIntent = Intent(this,MainActivity::class.java).apply {
            putExtra("email",email)
            putExtra("provider",provider.name)
        }
        startActivity(homeIntent)

        }



            // val homeIntent = Intent(this,Datos::class.java).apply {
            //   putExtra("email",email)
            // putExtra("provider",provider.name)
            // }
            //startActivity(homeIntent)





private fun showHome2(email: String, provider: ProviderType){

        val homeIntent = Intent(this,Datos::class.java).apply {
            putExtra("email",email)
            putExtra("provider",provider.name)
        }
        startActivity(homeIntent)
    }




}
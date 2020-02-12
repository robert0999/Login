package topete.salazar.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val USER = "Erick"
    val PASS = "hola123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnlogin.setOnClickListener {
            val usuario = user.text.toString()
            val pass = pass.text.toString()

            if(!cadenaVacia(usuario) and !cadenaVacia(pass)){
                //verificar datos
                if (verificarDatos(usuario,pass)){
                    mensaje("Bienvenido")
                }else{
                    mensaje("Datos Incorrectos")
                }

            }else{
                //mensaje datos vacios
                mensaje("Datos Vacios")
            }
        }
    }
    fun verificarDatos(user:String, pass:String):Boolean{
        return user.equals(USER) and pass.equals(PASS)
    }
    /*metodo que muestra toast*/
    fun mensaje(mensaje:String){
    Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
        }
    /*verificar que la cadena este vacia*/
    fun cadenaVacia(cadenaVerificar:String):Boolean{
        return cadenaVerificar.isEmpty()
    }
    /*
    * leer suario
    * leer pass
    * verificar que noe sten vacios
    * caparar usuario permitido
    * comparar pass con la del usuario
    * si es corecto emnsaje d e bienvenida
    * de lo contrario pedir los datos neuvamente
    * */
}

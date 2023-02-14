package com.example.ejercicio_10_aleatorizador_eventos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ejercicio_10_aleatorizador_eventos.databinding.ActivityPantallaMercaderBinding

class pantallaMercader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaMercaderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /** Tres botones compra venta y cancelar invisibles
         * boton compra, vender y cancelar**/
        binding.botonComprar.visibility = View.INVISIBLE
        binding.botonVender.visibility = View.INVISIBLE
        binding.botonCancelar.visibility = View.INVISIBLE

        /**Cosas de la compra invisibles
         * texto informativo, numeros de articulos, boton carrito, texto arriba y imagen**/
        binding.textViewInfo.visibility=View.INVISIBLE
        binding.editTextNumArticulos.visibility=View.INVISIBLE
        binding.botonCarrito.visibility= View.INVISIBLE
        binding.textoObjeto.visibility= View.INVISIBLE
        binding.objetoCompra.visibility= View.INVISIBLE

        /** Cosas vender invisibles
         * texto info venta ,imagen mochila, texto informativo, numero ventas,
         */
        binding.textoVenta.visibility=View.INVISIBLE
        binding.imagenMochila.visibility=View.INVISIBLE
        binding.textoVenta.visibility=View.INVISIBLE
        binding.textViewVenta.visibility=View.INVISIBLE
        binding.editTextArticulosVenta.visibility=View.INVISIBLE
        binding.botonVenta.visibility=View.INVISIBLE

        binding.botonComerciar.setOnClickListener(){
            /**Invisibles boton comerciar y continuar**/
            binding.botonComerciar.visibility = View.INVISIBLE
            binding.botonContinuarMer.visibility = View.INVISIBLE
            /**Ponemos visibles los tres botones
             * comprar comerciar cancelar**/
            binding.botonComprar.visibility = View.VISIBLE
            binding.botonVender.visibility = View.VISIBLE
            binding.botonCancelar.visibility = View.VISIBLE



            //BOTON COMPRAR
            binding.botonComprar.setOnClickListener(){

                /**Ponemos a invisible
                 * texto mercader y la imagen*/
                binding.textoMercader.visibility=View.INVISIBLE
                binding.imagenMercader.visibility=View.INVISIBLE

                /** Ponemos a visible
                 * texto informativo, numero de articulos, carrito, foto objeto y texto objeto**/
                binding.textViewInfo.visibility=View.VISIBLE
                binding.editTextNumArticulos.visibility=View.VISIBLE
                binding.botonCarrito.visibility= View.VISIBLE
                binding.textoObjeto.visibility=View.VISIBLE
                binding.objetoCompra.visibility=View.VISIBLE
                /** Quitar cosas de boton vender**/

                binding.textoVenta.visibility=View.INVISIBLE
                binding.imagenMochila.visibility=View.INVISIBLE
                binding.textoVenta.visibility=View.INVISIBLE
                binding.textViewVenta.visibility=View.INVISIBLE
                binding.editTextArticulosVenta.visibility=View.INVISIBLE
                binding.botonVenta.visibility=View.INVISIBLE
                //BOTON CARRITO
                binding.botonCarrito.setOnClickListener(){
                    val intent= Intent(this, cosasMercader::class.java)
                    startActivity(intent)
                }
            }




            //BOTON VENDER
            binding.botonVender.setOnClickListener() {
                /**Ponemos a invisible
                 * texto mercader y la imagen*/
                binding.textoMercader.visibility=View.INVISIBLE
                binding.imagenMercader.visibility=View.INVISIBLE

                /**Ponemos a invisible cosas compra
                 * texto informativo, numero de articulos, carrito, foto objeto y texto objeto*/
                binding.textViewInfo.visibility=View.INVISIBLE
                binding.editTextNumArticulos.visibility=View.INVISIBLE
                binding.botonCarrito.visibility= View.INVISIBLE
                binding.textoObjeto.visibility=View.INVISIBLE
                binding.objetoCompra.visibility=View.INVISIBLE

                /**Ponemos visible cosas vender
                 * texto info venta ,imagen mochila, texto informativo, numero ventas,
                 */
                binding.textoVenta.visibility=View.VISIBLE
                binding.imagenMochila.visibility=View.VISIBLE
                binding.textoVenta.visibility=View.VISIBLE
                binding.textViewVenta.visibility=View.VISIBLE
                binding.editTextArticulosVenta.visibility=View.VISIBLE
                binding.botonVenta.visibility=View.VISIBLE
                /**Quitar cosas de boton comprar **/
                binding.textViewInfo.visibility=View.INVISIBLE
                binding.editTextNumArticulos.visibility=View.INVISIBLE
                binding.botonCarrito.visibility= View.INVISIBLE
                binding.textoObjeto.visibility= View.INVISIBLE
                binding.objetoCompra.visibility= View.INVISIBLE

                //BOTON VENTA
                binding.botonVenta.setOnClickListener(){
                    val intent= Intent(this, cosasMercader::class.java)
                    startActivity(intent)
                }
            }

            //BOTON CANCELAR
            binding.botonCancelar.setOnClickListener(){
                /**Ponemos a visible
                 * texto mercader y la imagen*/
                binding.textoMercader.visibility=View.VISIBLE
                binding.imagenMercader.visibility=View.VISIBLE
                /** Ponemos dos botones y Quitamos los tres botones**/
                binding.botonComerciar.visibility = View.VISIBLE
                binding.botonContinuarMer.visibility = View.VISIBLE
                binding.botonComprar.visibility = View.INVISIBLE
                binding.botonVender.visibility = View.INVISIBLE
                binding.botonCancelar.visibility = View.INVISIBLE
                /**Quitar cosas de boton comprar **/
                binding.textViewInfo.visibility=View.INVISIBLE
                binding.editTextNumArticulos.visibility=View.INVISIBLE
                binding.botonCarrito.visibility= View.INVISIBLE
                binding.textoObjeto.visibility= View.INVISIBLE
                binding.objetoCompra.visibility= View.INVISIBLE

                /** Quitar cosas de boton vender**/

                binding.textoVenta.visibility=View.INVISIBLE
                binding.imagenMochila.visibility=View.INVISIBLE
                binding.textoVenta.visibility=View.INVISIBLE
                binding.textViewVenta.visibility=View.INVISIBLE
                binding.editTextArticulosVenta.visibility=View.INVISIBLE
                binding.botonVenta.visibility=View.INVISIBLE



            }
        }

        binding.botonContinuarMer.setOnClickListener(){
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}
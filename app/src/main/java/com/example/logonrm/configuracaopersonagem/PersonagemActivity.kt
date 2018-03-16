package com.example.logonrm.configuracaopersonagem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.AdapterView
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_personagem.*
import java.util.*

class PersonagemActivity : AppCompatActivity() {

    fun trocaImagem(idImagem: Int){
        ivClasse.setImageDrawable(
                ContextCompat.getDrawable(this , idImagem))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personagem)

        sbForca.setOnSeekBarChangeListener(object :
        SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
               tvForca.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        spClasse.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val tipoPersonagem = TipoPersonagemEnum.from(position)
                when (tipoPersonagem){
                    TipoPersonagemEnum.ANAO -> trocaImagem(R.drawable.anao)
                    TipoPersonagemEnum.ARQUEIRO -> trocaImagem(R.drawable.arqueiro)
                    TipoPersonagemEnum.ELFO -> trocaImagem(R.drawable.elfo)
                    TipoPersonagemEnum.GUERREIRO -> trocaImagem(R.drawable.guerreiro)
                    TipoPersonagemEnum.MAGO -> trocaImagem(R.drawable.mago)
                    TipoPersonagemEnum.BARDO -> trocaImagem(R.drawable.bardo)
                }
            }
        })

        btCriar.setOnClickListener{
            Toast.makeText(
                    this, "Usuário criado", Toast.LENGTH_SHORT)
                    .show()
            


        }


    }
}

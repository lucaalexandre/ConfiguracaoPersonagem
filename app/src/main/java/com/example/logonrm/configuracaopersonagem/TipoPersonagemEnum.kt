package com.example.logonrm.configuracaopersonagem

enum class TipoPersonagemEnum constructor(val id: Int){

    ANAO(0),
    ARQUEIRO(1),
    BARDO(2),
    ELFO(3),
    GUERREIRO(4),
    MAGO(5);

    companion object {
        fun from(findValue: Int): TipoPersonagemEnum =
                TipoPersonagemEnum.values().first{it.id == findValue}
    }

}

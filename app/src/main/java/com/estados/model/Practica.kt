package com.estados.model

import androidx.room.Entity
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName="Estado")

data class Practica(
    @Primarykey(autoGenerate = true)
    val id: Int,
    @ColumInfo(name="nombre")
    val nombre: String,
    @ColumInfo(name="capital")
    val capital: String,
    @ColumInfo(name="poblacion")
    val poblacion: Int,
    @ColumInfo(name="moneda")
    val moneda: String,
    @ColumInfo(name="continente")
    val continente: String,
)

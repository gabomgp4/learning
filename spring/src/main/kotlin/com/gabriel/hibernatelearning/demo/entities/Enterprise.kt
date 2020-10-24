package com.gabriel.hibernatelearning.demo.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
data class Enterprise(
        @Id
        @GeneratedValue()
        val id: Int,

        @NotNull
        val name: String,

        val nit: Long,

        @NotNull
        val gln: Long,
)
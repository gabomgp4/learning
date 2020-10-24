package com.gabriel.hibernatelearning.demo.entities

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.validation.constraints.NotNull

@Entity
data class Code(
        @Id
        val id: Int,

        @NotNull
        @ManyToOne
        val owner: Enterprise,

        @NotNull
        @ManyToOne
        val prefix: Prefix,

        @NotNull
        val name: String,

        val description: String,
)
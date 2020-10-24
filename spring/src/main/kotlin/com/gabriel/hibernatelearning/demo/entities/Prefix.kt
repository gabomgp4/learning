package com.gabriel.hibernatelearning.demo.entities

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.validation.constraints.NotNull

@Entity
data class Prefix(
        @Id
        val id: Int,

        @NotNull
        @ManyToOne
        val kind: PrefixKind,

        @NotNull
        val name: String,

        val description: String,
)
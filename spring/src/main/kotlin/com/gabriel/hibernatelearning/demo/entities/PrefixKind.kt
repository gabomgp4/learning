package com.gabriel.hibernatelearning.demo.entities

import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
data class PrefixKind(
        @Id
        val id: Int,

        @NotNull
        val name: String,

        val description: String,
)
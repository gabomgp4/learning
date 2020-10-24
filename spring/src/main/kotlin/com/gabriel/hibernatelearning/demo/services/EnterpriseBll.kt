package com.gabriel.hibernatelearning.demo.services

import com.gabriel.hibernatelearning.demo.dao.EnterpriseRepository
import org.springframework.stereotype.Component

@Component
class EnterpriseBll(val enterpriseRepository: EnterpriseRepository) {

    fun getPage(startIndex: Int, count: Int) =
            enterpriseRepository.findAll()

}
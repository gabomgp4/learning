package com.gabriel.hibernatelearning.demo.dao

import com.gabriel.hibernatelearning.demo.entities.Enterprise
import org.springframework.data.repository.PagingAndSortingRepository

interface EnterpriseRepository : PagingAndSortingRepository<Enterprise, Int> {
}
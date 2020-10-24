package com.gabriel.hibernatelearning.demo.control

import com.gabriel.hibernatelearning.demo.dao.EnterpriseRepository
import com.gabriel.hibernatelearning.demo.services.EnterpriseBll
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class EnterpriseController(
        val enterpriseBll: EnterpriseBll
) {
    @GetMapping()
    fun index()= ModelAndView("enterprise/index", enterpriseBll.getPage())
}
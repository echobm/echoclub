package com.echo.question.application.controller;

import com.echo.question.application.controller.convert.QuestionCategoryDTOConverter;
import com.echo.question.application.controller.dto.QuestionCategoryDTO;
import com.echo.question.entity.QuestionCategoryBO;
import com.echo.question.infra.basic.entity.QuestionCategory;
import com.echo.question.infra.basic.service.QuestionCategoryService;
import com.echo.question.service.QuestionCategoryDomainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/question/category")
public class QuestionCategoryController {
    @Resource
    private QuestionCategoryDomainService questionCategoryDomainService;

    @GetMapping("/add")
    public String add(@RequestBody QuestionCategoryDTO questionCategoryDTO){
        QuestionCategoryBO questionCategoryBO = QuestionCategoryDTOConverter.INSTANCE.convertDTOToBO(questionCategoryDTO);
        questionCategoryDomainService.add(questionCategoryBO);


    }
}


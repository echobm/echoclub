package com.echo.question.application.controller;

import com.echo.question.infra.basic.entity.QuestionCategory;
import com.echo.question.infra.basic.service.QuestionCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//刷题Controller
@RestController
public class QuestionController {
    @Resource
    private QuestionCategoryService questionCategoryService;

    @GetMapping("/test")
    public String test(){
        QuestionCategory questionCategory = questionCategoryService.queryById(2);
        return questionCategory.getCategoryName() ;
    }
}

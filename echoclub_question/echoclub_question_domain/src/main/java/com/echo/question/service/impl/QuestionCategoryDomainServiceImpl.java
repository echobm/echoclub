package com.echo.question.service.impl;

import com.echo.question.convert.QuestionCategoryConverter;
import com.echo.question.entity.QuestionCategoryBO;
import com.echo.question.infra.basic.entity.QuestionCategory;
import com.echo.question.infra.basic.service.QuestionCategoryService;
import com.echo.question.infra.basic.service.impl.QuestionCategoryServiceImpl;
import com.echo.question.service.QuestionCategoryDomainService;

import javax.annotation.Resource;

public class QuestionCategoryDomainServiceImpl implements QuestionCategoryDomainService {
    @Resource
    private QuestionCategoryService questionCategoryService;

    public void add(QuestionCategoryBO questionCategoryBO){
        QuestionCategory questionCategory = QuestionCategoryConverter.INSTANCE.convertBoToCategory(questionCategoryBO);
        questionCategoryService.insert(questionCategory);
    }
}

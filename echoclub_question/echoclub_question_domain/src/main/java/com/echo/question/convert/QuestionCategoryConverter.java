package com.echo.question.convert;

import com.echo.question.entity.QuestionCategoryBO;
import com.echo.question.infra.basic.entity.QuestionCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface QuestionCategoryConverter {
    QuestionCategoryConverter INSTANCE = Mappers.getMapper(QuestionCategoryConverter.class);

    QuestionCategory convertBoToCategory(QuestionCategoryBO questionCategoryBO);


}

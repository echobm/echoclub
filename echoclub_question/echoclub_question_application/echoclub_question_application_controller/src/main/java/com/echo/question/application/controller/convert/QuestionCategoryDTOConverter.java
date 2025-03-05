package com.echo.question.application.controller.convert;

import com.echo.question.application.controller.dto.QuestionCategoryDTO;
import com.echo.question.entity.QuestionCategoryBO;
import com.echo.question.infra.basic.entity.QuestionCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface QuestionCategoryDTOConverter {
    QuestionCategoryDTOConverter INSTANCE = Mappers.getMapper(QuestionCategoryDTOConverter.class);

    QuestionCategoryBO convertDTOToBO(QuestionCategoryDTO questionCategoryDTO);


}

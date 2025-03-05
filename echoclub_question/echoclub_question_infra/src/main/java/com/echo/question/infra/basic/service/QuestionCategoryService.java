package com.echo.question.infra.basic.service;

import com.echo.question.infra.basic.entity.QuestionCategory;


/**
 * 题目分类表(QuestionCategory)表服务接口
 *
 * @author makejava
 * @since 2025-03-24 15:57:43
 */
public interface QuestionCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    QuestionCategory queryById(Integer id);


    /**
     * 新增数据
     *
     * @param questionCategory 实例对象
     * @return 实例对象
     */
    QuestionCategory insert(QuestionCategory questionCategory);

    /**
     * 修改数据
     *
     * @param questionCategory 实例对象
     * @return 实例对象
     */
    QuestionCategory update(QuestionCategory questionCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}

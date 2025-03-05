package com.echo.question.infra.basic.service.impl;

import com.echo.question.infra.basic.entity.QuestionCategory;
import com.echo.question.infra.basic.mapper.QuestionCategoryDao;
import com.echo.question.infra.basic.service.QuestionCategoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * 题目分类表(QuestionCategory)表服务实现类
 *
 * @author makejava
 * @since 2025-03-24 15:57:43
 */
@Service("questionCategoryService")
public class QuestionCategoryServiceImpl implements QuestionCategoryService {
    @Resource
    private QuestionCategoryDao questionCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public QuestionCategory queryById(Integer id) {
        return this.questionCategoryDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param questionCategory 实例对象
     * @return 实例对象
     */
    @Override
    public QuestionCategory insert(QuestionCategory questionCategory) {
        this.questionCategoryDao.insert(questionCategory);
        return questionCategory;
    }

    /**
     * 修改数据
     *
     * @param questionCategory 实例对象
     * @return 实例对象
     */
    @Override
    public QuestionCategory update(QuestionCategory questionCategory) {
        this.questionCategoryDao.update(questionCategory);
        return this.queryById(questionCategory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.questionCategoryDao.deleteById(id) > 0;
    }
}

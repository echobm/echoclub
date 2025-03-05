package com.echo.question.infra.basic.mapper;

import com.echo.question.infra.basic.entity.QuestionCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 题目分类表(QuestionCategory)表数据库访问层
 *
 * @author makejava
 * @since 2025-03-24 15:57:41
 */
public interface QuestionCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    QuestionCategory queryById(Integer id);

    /**
     * 统计总行数
     *
     * @param questionCategory 查询条件
     * @return 总行数
     */
    long count(QuestionCategory questionCategory);

    /**
     * 新增数据
     *
     * @param questionCategory 实例对象
     * @return 影响行数
     */
    int insert(QuestionCategory questionCategory);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<QuestionCategory> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<QuestionCategory> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<QuestionCategory> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<QuestionCategory> entities);

    /**
     * 修改数据
     *
     * @param questionCategory 实例对象
     * @return 影响行数
     */
    int update(QuestionCategory questionCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}


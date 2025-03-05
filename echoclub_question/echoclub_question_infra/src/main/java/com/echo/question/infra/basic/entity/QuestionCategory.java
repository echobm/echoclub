package com.echo.question.infra.basic.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 题目分类表(QuestionCategory)实体类
 *
 * @author makejava
 * @since 2025-03-24 15:57:42
 */
@Data
public class QuestionCategory implements Serializable {
    private static final long serialVersionUID = 350842087683060803L;
/**
     * 主键
     */
    private Integer id;

/**
     * 分类名称
     */
    private String categoryName;

/**
     * 分类类型
     */
    private Integer categoryType;

/**
     * 分类图标
     */
    private String categorImg;

/**
     * 父类id
     */
    private Integer parentId;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public String getCategorImg() {
        return categorImg;
    }

    public void setCategorImg(String categorImg) {
        this.categorImg = categorImg;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

}


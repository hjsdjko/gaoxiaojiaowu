package com.entity.model;

import com.entity.KaoshianpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 考试安排
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaoshianpaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String kaoshianpaiName;


    /**
     * 考试时间节点
     */
    private String kaoshishijian;


    /**
     * 班级
     */
    private Integer banjiTypes;


    /**
     * 考试安排详情
     */
    private String kaoshianpaiContent;


    /**
     * 创建时间 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getKaoshianpaiName() {
        return kaoshianpaiName;
    }


    /**
	 * 设置：标题
	 */
    public void setKaoshianpaiName(String kaoshianpaiName) {
        this.kaoshianpaiName = kaoshianpaiName;
    }
    /**
	 * 获取：考试时间节点
	 */
    public String getKaoshishijian() {
        return kaoshishijian;
    }


    /**
	 * 设置：考试时间节点
	 */
    public void setKaoshishijian(String kaoshishijian) {
        this.kaoshishijian = kaoshishijian;
    }
    /**
	 * 获取：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 设置：班级
	 */
    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 获取：考试安排详情
	 */
    public String getKaoshianpaiContent() {
        return kaoshianpaiContent;
    }


    /**
	 * 设置：考试安排详情
	 */
    public void setKaoshianpaiContent(String kaoshianpaiContent) {
        this.kaoshianpaiContent = kaoshianpaiContent;
    }
    /**
	 * 获取：创建时间 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

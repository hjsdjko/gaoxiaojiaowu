package com.entity.vo;

import com.entity.KaoshianpaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 考试安排
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kaoshianpai")
public class KaoshianpaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "kaoshianpai_name")
    private String kaoshianpaiName;


    /**
     * 考试时间节点
     */

    @TableField(value = "kaoshishijian")
    private String kaoshishijian;


    /**
     * 班级
     */

    @TableField(value = "banji_types")
    private Integer banjiTypes;


    /**
     * 考试安排详情
     */

    @TableField(value = "kaoshianpai_content")
    private String kaoshianpaiContent;


    /**
     * 创建时间 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getKaoshianpaiName() {
        return kaoshianpaiName;
    }


    /**
	 * 获取：标题
	 */

    public void setKaoshianpaiName(String kaoshianpaiName) {
        this.kaoshianpaiName = kaoshianpaiName;
    }
    /**
	 * 设置：考试时间节点
	 */
    public String getKaoshishijian() {
        return kaoshishijian;
    }


    /**
	 * 获取：考试时间节点
	 */

    public void setKaoshishijian(String kaoshishijian) {
        this.kaoshishijian = kaoshishijian;
    }
    /**
	 * 设置：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 获取：班级
	 */

    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 设置：考试安排详情
	 */
    public String getKaoshianpaiContent() {
        return kaoshianpaiContent;
    }


    /**
	 * 获取：考试安排详情
	 */

    public void setKaoshianpaiContent(String kaoshianpaiContent) {
        this.kaoshianpaiContent = kaoshianpaiContent;
    }
    /**
	 * 设置：创建时间 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

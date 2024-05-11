package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 考试安排
 *
 * @author 
 * @email
 */
@TableName("kaoshianpai")
public class KaoshianpaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KaoshianpaiEntity() {

	}

	public KaoshianpaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kaoshianpai{" +
            "id=" + id +
            ", kaoshianpaiName=" + kaoshianpaiName +
            ", kaoshishijian=" + kaoshishijian +
            ", banjiTypes=" + banjiTypes +
            ", kaoshianpaiContent=" + kaoshianpaiContent +
            ", createTime=" + createTime +
        "}";
    }
}

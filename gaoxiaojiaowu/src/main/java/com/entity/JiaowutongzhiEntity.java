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
 * 教务通知
 *
 * @author 
 * @email
 */
@TableName("jiaowutongzhi")
public class JiaowutongzhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaowutongzhiEntity() {

	}

	public JiaowutongzhiEntity(T t) {
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
    @TableField(value = "jiaowutongzhi_name")

    private String jiaowutongzhiName;


    /**
     * 类型
     */
    @TableField(value = "jiaowutongzhi_types")

    private Integer jiaowutongzhiTypes;


    /**
     * 封面
     */
    @TableField(value = "jiaowutongzhi_photo")

    private String jiaowutongzhiPhoto;


    /**
     * 通知详情
     */
    @TableField(value = "jiaowutongzhi_content")

    private String jiaowutongzhiContent;


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
    public String getJiaowutongzhiName() {
        return jiaowutongzhiName;
    }


    /**
	 * 获取：标题
	 */

    public void setJiaowutongzhiName(String jiaowutongzhiName) {
        this.jiaowutongzhiName = jiaowutongzhiName;
    }
    /**
	 * 设置：类型
	 */
    public Integer getJiaowutongzhiTypes() {
        return jiaowutongzhiTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setJiaowutongzhiTypes(Integer jiaowutongzhiTypes) {
        this.jiaowutongzhiTypes = jiaowutongzhiTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getJiaowutongzhiPhoto() {
        return jiaowutongzhiPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setJiaowutongzhiPhoto(String jiaowutongzhiPhoto) {
        this.jiaowutongzhiPhoto = jiaowutongzhiPhoto;
    }
    /**
	 * 设置：通知详情
	 */
    public String getJiaowutongzhiContent() {
        return jiaowutongzhiContent;
    }


    /**
	 * 获取：通知详情
	 */

    public void setJiaowutongzhiContent(String jiaowutongzhiContent) {
        this.jiaowutongzhiContent = jiaowutongzhiContent;
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
        return "Jiaowutongzhi{" +
            "id=" + id +
            ", jiaowutongzhiName=" + jiaowutongzhiName +
            ", jiaowutongzhiTypes=" + jiaowutongzhiTypes +
            ", jiaowutongzhiPhoto=" + jiaowutongzhiPhoto +
            ", jiaowutongzhiContent=" + jiaowutongzhiContent +
            ", createTime=" + createTime +
        "}";
    }
}

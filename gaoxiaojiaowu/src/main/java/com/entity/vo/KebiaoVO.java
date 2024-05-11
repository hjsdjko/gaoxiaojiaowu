package com.entity.vo;

import com.entity.KebiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课表
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kebiao")
public class KebiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "kebiao_name")
    private String kebiaoName;


    /**
     * 班级
     */

    @TableField(value = "banji_types")
    private Integer banjiTypes;


    /**
     * 课表上传
     */

    @TableField(value = "kebiao_photo")
    private String kebiaoPhoto;


    /**
     * 课程详情
     */

    @TableField(value = "kebiao_content")
    private String kebiaoContent;


    /**
     * 创建时间 photoShow
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
    public String getKebiaoName() {
        return kebiaoName;
    }


    /**
	 * 获取：标题
	 */

    public void setKebiaoName(String kebiaoName) {
        this.kebiaoName = kebiaoName;
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
	 * 设置：课表上传
	 */
    public String getKebiaoPhoto() {
        return kebiaoPhoto;
    }


    /**
	 * 获取：课表上传
	 */

    public void setKebiaoPhoto(String kebiaoPhoto) {
        this.kebiaoPhoto = kebiaoPhoto;
    }
    /**
	 * 设置：课程详情
	 */
    public String getKebiaoContent() {
        return kebiaoContent;
    }


    /**
	 * 获取：课程详情
	 */

    public void setKebiaoContent(String kebiaoContent) {
        this.kebiaoContent = kebiaoContent;
    }
    /**
	 * 设置：创建时间 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

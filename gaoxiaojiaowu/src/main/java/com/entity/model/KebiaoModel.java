package com.entity.model;

import com.entity.KebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KebiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String kebiaoName;


    /**
     * 班级
     */
    private Integer banjiTypes;


    /**
     * 课表上传
     */
    private String kebiaoPhoto;


    /**
     * 课程详情
     */
    private String kebiaoContent;


    /**
     * 创建时间 photoShow
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
    public String getKebiaoName() {
        return kebiaoName;
    }


    /**
	 * 设置：标题
	 */
    public void setKebiaoName(String kebiaoName) {
        this.kebiaoName = kebiaoName;
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
	 * 获取：课表上传
	 */
    public String getKebiaoPhoto() {
        return kebiaoPhoto;
    }


    /**
	 * 设置：课表上传
	 */
    public void setKebiaoPhoto(String kebiaoPhoto) {
        this.kebiaoPhoto = kebiaoPhoto;
    }
    /**
	 * 获取：课程详情
	 */
    public String getKebiaoContent() {
        return kebiaoContent;
    }


    /**
	 * 设置：课程详情
	 */
    public void setKebiaoContent(String kebiaoContent) {
        this.kebiaoContent = kebiaoContent;
    }
    /**
	 * 获取：创建时间 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

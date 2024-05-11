package com.entity.model;

import com.entity.JiaowutongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教务通知
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaowutongzhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String jiaowutongzhiName;


    /**
     * 类型
     */
    private Integer jiaowutongzhiTypes;


    /**
     * 封面
     */
    private String jiaowutongzhiPhoto;


    /**
     * 通知详情
     */
    private String jiaowutongzhiContent;


    /**
     * 创建时间 show1 show2 photoShow
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
    public String getJiaowutongzhiName() {
        return jiaowutongzhiName;
    }


    /**
	 * 设置：标题
	 */
    public void setJiaowutongzhiName(String jiaowutongzhiName) {
        this.jiaowutongzhiName = jiaowutongzhiName;
    }
    /**
	 * 获取：类型
	 */
    public Integer getJiaowutongzhiTypes() {
        return jiaowutongzhiTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setJiaowutongzhiTypes(Integer jiaowutongzhiTypes) {
        this.jiaowutongzhiTypes = jiaowutongzhiTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getJiaowutongzhiPhoto() {
        return jiaowutongzhiPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setJiaowutongzhiPhoto(String jiaowutongzhiPhoto) {
        this.jiaowutongzhiPhoto = jiaowutongzhiPhoto;
    }
    /**
	 * 获取：通知详情
	 */
    public String getJiaowutongzhiContent() {
        return jiaowutongzhiContent;
    }


    /**
	 * 设置：通知详情
	 */
    public void setJiaowutongzhiContent(String jiaowutongzhiContent) {
        this.jiaowutongzhiContent = jiaowutongzhiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

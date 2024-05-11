package com.entity.vo;

import com.entity.JiaowutongzhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教务通知
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaowutongzhi")
public class JiaowutongzhiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

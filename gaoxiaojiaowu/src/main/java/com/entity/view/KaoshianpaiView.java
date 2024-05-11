package com.entity.view;

import com.entity.KaoshianpaiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 考试安排
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kaoshianpai")
public class KaoshianpaiView extends KaoshianpaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 班级的值
		*/
		private String banjiValue;



	public KaoshianpaiView() {

	}

	public KaoshianpaiView(KaoshianpaiEntity kaoshianpaiEntity) {
		try {
			BeanUtils.copyProperties(this, kaoshianpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 班级的值
			*/
			public String getBanjiValue() {
				return banjiValue;
			}
			/**
			* 设置： 班级的值
			*/
			public void setBanjiValue(String banjiValue) {
				this.banjiValue = banjiValue;
			}





}

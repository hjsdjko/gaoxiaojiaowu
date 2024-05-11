package com.dao;

import com.entity.JiaowutongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaowutongzhiView;

/**
 * 教务通知 Dao 接口
 *
 * @author 
 */
public interface JiaowutongzhiDao extends BaseMapper<JiaowutongzhiEntity> {

   List<JiaowutongzhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

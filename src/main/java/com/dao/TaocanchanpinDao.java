package com.dao;

import com.entity.TaocanchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TaocanchanpinVO;
import com.entity.view.TaocanchanpinView;


/**
 * 套餐产品
 * 
 * @author 
 * @email 
 * @date 2023-04-17 23:09:40
 */
public interface TaocanchanpinDao extends BaseMapper<TaocanchanpinEntity> {
	
	List<TaocanchanpinVO> selectListVO(@Param("ew") Wrapper<TaocanchanpinEntity> wrapper);
	
	TaocanchanpinVO selectVO(@Param("ew") Wrapper<TaocanchanpinEntity> wrapper);
	
	List<TaocanchanpinView> selectListView(@Param("ew") Wrapper<TaocanchanpinEntity> wrapper);

	List<TaocanchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<TaocanchanpinEntity> wrapper);
	
	TaocanchanpinView selectView(@Param("ew") Wrapper<TaocanchanpinEntity> wrapper);
	

}

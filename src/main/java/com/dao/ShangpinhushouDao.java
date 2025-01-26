package com.dao;

import com.entity.ShangpinhushouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinhushouVO;
import com.entity.view.ShangpinhushouView;


/**
 * 商品互售
 * 
 * @author 
 * @email 
 * @date 2023-04-17 23:09:40
 */
public interface ShangpinhushouDao extends BaseMapper<ShangpinhushouEntity> {
	
	List<ShangpinhushouVO> selectListVO(@Param("ew") Wrapper<ShangpinhushouEntity> wrapper);
	
	ShangpinhushouVO selectVO(@Param("ew") Wrapper<ShangpinhushouEntity> wrapper);
	
	List<ShangpinhushouView> selectListView(@Param("ew") Wrapper<ShangpinhushouEntity> wrapper);

	List<ShangpinhushouView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinhushouEntity> wrapper);
	
	ShangpinhushouView selectView(@Param("ew") Wrapper<ShangpinhushouEntity> wrapper);
	

}

package com.dao;

import com.entity.DiscussshangpinhushouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshangpinhushouVO;
import com.entity.view.DiscussshangpinhushouView;


/**
 * 商品互售评论表
 * 
 * @author 
 * @email 
 * @date 2023-04-17 23:09:41
 */
public interface DiscussshangpinhushouDao extends BaseMapper<DiscussshangpinhushouEntity> {
	
	List<DiscussshangpinhushouVO> selectListVO(@Param("ew") Wrapper<DiscussshangpinhushouEntity> wrapper);
	
	DiscussshangpinhushouVO selectVO(@Param("ew") Wrapper<DiscussshangpinhushouEntity> wrapper);
	
	List<DiscussshangpinhushouView> selectListView(@Param("ew") Wrapper<DiscussshangpinhushouEntity> wrapper);

	List<DiscussshangpinhushouView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshangpinhushouEntity> wrapper);
	
	DiscussshangpinhushouView selectView(@Param("ew") Wrapper<DiscussshangpinhushouEntity> wrapper);
	

}

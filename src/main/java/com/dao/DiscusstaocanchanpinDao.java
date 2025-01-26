package com.dao;

import com.entity.DiscusstaocanchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstaocanchanpinVO;
import com.entity.view.DiscusstaocanchanpinView;


/**
 * 套餐产品评论表
 * 
 * @author 
 * @email 
 * @date 2023-04-17 23:09:41
 */
public interface DiscusstaocanchanpinDao extends BaseMapper<DiscusstaocanchanpinEntity> {
	
	List<DiscusstaocanchanpinVO> selectListVO(@Param("ew") Wrapper<DiscusstaocanchanpinEntity> wrapper);
	
	DiscusstaocanchanpinVO selectVO(@Param("ew") Wrapper<DiscusstaocanchanpinEntity> wrapper);
	
	List<DiscusstaocanchanpinView> selectListView(@Param("ew") Wrapper<DiscusstaocanchanpinEntity> wrapper);

	List<DiscusstaocanchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstaocanchanpinEntity> wrapper);
	
	DiscusstaocanchanpinView selectView(@Param("ew") Wrapper<DiscusstaocanchanpinEntity> wrapper);
	

}

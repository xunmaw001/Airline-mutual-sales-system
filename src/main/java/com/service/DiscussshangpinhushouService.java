package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshangpinhushouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshangpinhushouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshangpinhushouView;


/**
 * 商品互售评论表
 *
 * @author 
 * @email 
 * @date 2023-04-17 23:09:41
 */
public interface DiscussshangpinhushouService extends IService<DiscussshangpinhushouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshangpinhushouVO> selectListVO(Wrapper<DiscussshangpinhushouEntity> wrapper);
   	
   	DiscussshangpinhushouVO selectVO(@Param("ew") Wrapper<DiscussshangpinhushouEntity> wrapper);
   	
   	List<DiscussshangpinhushouView> selectListView(Wrapper<DiscussshangpinhushouEntity> wrapper);
   	
   	DiscussshangpinhushouView selectView(@Param("ew") Wrapper<DiscussshangpinhushouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshangpinhushouEntity> wrapper);
   	

}


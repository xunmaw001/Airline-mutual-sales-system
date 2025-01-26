package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinhushouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinhushouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinhushouView;


/**
 * 商品互售
 *
 * @author 
 * @email 
 * @date 2023-04-17 23:09:40
 */
public interface ShangpinhushouService extends IService<ShangpinhushouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinhushouVO> selectListVO(Wrapper<ShangpinhushouEntity> wrapper);
   	
   	ShangpinhushouVO selectVO(@Param("ew") Wrapper<ShangpinhushouEntity> wrapper);
   	
   	List<ShangpinhushouView> selectListView(Wrapper<ShangpinhushouEntity> wrapper);
   	
   	ShangpinhushouView selectView(@Param("ew") Wrapper<ShangpinhushouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinhushouEntity> wrapper);
   	

}


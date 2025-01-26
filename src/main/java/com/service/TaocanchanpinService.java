package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TaocanchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TaocanchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TaocanchanpinView;


/**
 * 套餐产品
 *
 * @author 
 * @email 
 * @date 2023-04-17 23:09:40
 */
public interface TaocanchanpinService extends IService<TaocanchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TaocanchanpinVO> selectListVO(Wrapper<TaocanchanpinEntity> wrapper);
   	
   	TaocanchanpinVO selectVO(@Param("ew") Wrapper<TaocanchanpinEntity> wrapper);
   	
   	List<TaocanchanpinView> selectListView(Wrapper<TaocanchanpinEntity> wrapper);
   	
   	TaocanchanpinView selectView(@Param("ew") Wrapper<TaocanchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TaocanchanpinEntity> wrapper);
   	

}


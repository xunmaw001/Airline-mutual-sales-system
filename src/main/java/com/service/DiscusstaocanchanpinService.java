package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstaocanchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstaocanchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstaocanchanpinView;


/**
 * 套餐产品评论表
 *
 * @author 
 * @email 
 * @date 2023-04-17 23:09:41
 */
public interface DiscusstaocanchanpinService extends IService<DiscusstaocanchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstaocanchanpinVO> selectListVO(Wrapper<DiscusstaocanchanpinEntity> wrapper);
   	
   	DiscusstaocanchanpinVO selectVO(@Param("ew") Wrapper<DiscusstaocanchanpinEntity> wrapper);
   	
   	List<DiscusstaocanchanpinView> selectListView(Wrapper<DiscusstaocanchanpinEntity> wrapper);
   	
   	DiscusstaocanchanpinView selectView(@Param("ew") Wrapper<DiscusstaocanchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstaocanchanpinEntity> wrapper);
   	

}


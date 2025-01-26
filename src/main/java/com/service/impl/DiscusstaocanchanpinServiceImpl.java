package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusstaocanchanpinDao;
import com.entity.DiscusstaocanchanpinEntity;
import com.service.DiscusstaocanchanpinService;
import com.entity.vo.DiscusstaocanchanpinVO;
import com.entity.view.DiscusstaocanchanpinView;

@Service("discusstaocanchanpinService")
public class DiscusstaocanchanpinServiceImpl extends ServiceImpl<DiscusstaocanchanpinDao, DiscusstaocanchanpinEntity> implements DiscusstaocanchanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstaocanchanpinEntity> page = this.selectPage(
                new Query<DiscusstaocanchanpinEntity>(params).getPage(),
                new EntityWrapper<DiscusstaocanchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstaocanchanpinEntity> wrapper) {
		  Page<DiscusstaocanchanpinView> page =new Query<DiscusstaocanchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstaocanchanpinVO> selectListVO(Wrapper<DiscusstaocanchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstaocanchanpinVO selectVO(Wrapper<DiscusstaocanchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstaocanchanpinView> selectListView(Wrapper<DiscusstaocanchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstaocanchanpinView selectView(Wrapper<DiscusstaocanchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

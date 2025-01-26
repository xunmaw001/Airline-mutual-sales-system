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


import com.dao.TaocanchanpinDao;
import com.entity.TaocanchanpinEntity;
import com.service.TaocanchanpinService;
import com.entity.vo.TaocanchanpinVO;
import com.entity.view.TaocanchanpinView;

@Service("taocanchanpinService")
public class TaocanchanpinServiceImpl extends ServiceImpl<TaocanchanpinDao, TaocanchanpinEntity> implements TaocanchanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TaocanchanpinEntity> page = this.selectPage(
                new Query<TaocanchanpinEntity>(params).getPage(),
                new EntityWrapper<TaocanchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TaocanchanpinEntity> wrapper) {
		  Page<TaocanchanpinView> page =new Query<TaocanchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TaocanchanpinVO> selectListVO(Wrapper<TaocanchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TaocanchanpinVO selectVO(Wrapper<TaocanchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TaocanchanpinView> selectListView(Wrapper<TaocanchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TaocanchanpinView selectView(Wrapper<TaocanchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

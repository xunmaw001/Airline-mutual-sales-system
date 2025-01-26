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


import com.dao.DiscussshangpinhushouDao;
import com.entity.DiscussshangpinhushouEntity;
import com.service.DiscussshangpinhushouService;
import com.entity.vo.DiscussshangpinhushouVO;
import com.entity.view.DiscussshangpinhushouView;

@Service("discussshangpinhushouService")
public class DiscussshangpinhushouServiceImpl extends ServiceImpl<DiscussshangpinhushouDao, DiscussshangpinhushouEntity> implements DiscussshangpinhushouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshangpinhushouEntity> page = this.selectPage(
                new Query<DiscussshangpinhushouEntity>(params).getPage(),
                new EntityWrapper<DiscussshangpinhushouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshangpinhushouEntity> wrapper) {
		  Page<DiscussshangpinhushouView> page =new Query<DiscussshangpinhushouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshangpinhushouVO> selectListVO(Wrapper<DiscussshangpinhushouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshangpinhushouVO selectVO(Wrapper<DiscussshangpinhushouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshangpinhushouView> selectListView(Wrapper<DiscussshangpinhushouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshangpinhushouView selectView(Wrapper<DiscussshangpinhushouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

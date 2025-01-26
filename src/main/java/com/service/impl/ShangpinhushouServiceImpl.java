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


import com.dao.ShangpinhushouDao;
import com.entity.ShangpinhushouEntity;
import com.service.ShangpinhushouService;
import com.entity.vo.ShangpinhushouVO;
import com.entity.view.ShangpinhushouView;

@Service("shangpinhushouService")
public class ShangpinhushouServiceImpl extends ServiceImpl<ShangpinhushouDao, ShangpinhushouEntity> implements ShangpinhushouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinhushouEntity> page = this.selectPage(
                new Query<ShangpinhushouEntity>(params).getPage(),
                new EntityWrapper<ShangpinhushouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinhushouEntity> wrapper) {
		  Page<ShangpinhushouView> page =new Query<ShangpinhushouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinhushouVO> selectListVO(Wrapper<ShangpinhushouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinhushouVO selectVO(Wrapper<ShangpinhushouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinhushouView> selectListView(Wrapper<ShangpinhushouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinhushouView selectView(Wrapper<ShangpinhushouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

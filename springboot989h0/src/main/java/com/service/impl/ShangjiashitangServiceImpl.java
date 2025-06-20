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


import com.dao.ShangjiashitangDao;
import com.entity.ShangjiashitangEntity;
import com.service.ShangjiashitangService;
import com.entity.vo.ShangjiashitangVO;
import com.entity.view.ShangjiashitangView;

@Service("shangjiashitangService")
public class ShangjiashitangServiceImpl extends ServiceImpl<ShangjiashitangDao, ShangjiashitangEntity> implements ShangjiashitangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangjiashitangEntity> page = this.selectPage(
                new Query<ShangjiashitangEntity>(params).getPage(),
                new EntityWrapper<ShangjiashitangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangjiashitangEntity> wrapper) {
		  Page<ShangjiashitangView> page =new Query<ShangjiashitangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangjiashitangVO> selectListVO(Wrapper<ShangjiashitangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangjiashitangVO selectVO(Wrapper<ShangjiashitangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangjiashitangView> selectListView(Wrapper<ShangjiashitangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangjiashitangView selectView(Wrapper<ShangjiashitangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

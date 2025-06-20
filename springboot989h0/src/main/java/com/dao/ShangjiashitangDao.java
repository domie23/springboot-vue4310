package com.dao;

import com.entity.ShangjiashitangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangjiashitangVO;
import com.entity.view.ShangjiashitangView;


/**
 * 商家食堂
 * 
 * @author 
 * @email 
 * @date 2022-05-24 19:17:45
 */
public interface ShangjiashitangDao extends BaseMapper<ShangjiashitangEntity> {
	
	List<ShangjiashitangVO> selectListVO(@Param("ew") Wrapper<ShangjiashitangEntity> wrapper);
	
	ShangjiashitangVO selectVO(@Param("ew") Wrapper<ShangjiashitangEntity> wrapper);
	
	List<ShangjiashitangView> selectListView(@Param("ew") Wrapper<ShangjiashitangEntity> wrapper);

	List<ShangjiashitangView> selectListView(Pagination page,@Param("ew") Wrapper<ShangjiashitangEntity> wrapper);
	
	ShangjiashitangView selectView(@Param("ew") Wrapper<ShangjiashitangEntity> wrapper);
	

}

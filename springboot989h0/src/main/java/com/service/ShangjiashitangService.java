package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangjiashitangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangjiashitangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangjiashitangView;


/**
 * 商家食堂
 *
 * @author 
 * @email 
 * @date 2022-05-24 19:17:45
 */
public interface ShangjiashitangService extends IService<ShangjiashitangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangjiashitangVO> selectListVO(Wrapper<ShangjiashitangEntity> wrapper);
   	
   	ShangjiashitangVO selectVO(@Param("ew") Wrapper<ShangjiashitangEntity> wrapper);
   	
   	List<ShangjiashitangView> selectListView(Wrapper<ShangjiashitangEntity> wrapper);
   	
   	ShangjiashitangView selectView(@Param("ew") Wrapper<ShangjiashitangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangjiashitangEntity> wrapper);
   	

}


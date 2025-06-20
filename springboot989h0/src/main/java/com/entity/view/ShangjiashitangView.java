package com.entity.view;

import com.entity.ShangjiashitangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商家食堂
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-24 19:17:45
 */
@TableName("shangjiashitang")
public class ShangjiashitangView  extends ShangjiashitangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangjiashitangView(){
	}
 
 	public ShangjiashitangView(ShangjiashitangEntity shangjiashitangEntity){
 	try {
			BeanUtils.copyProperties(this, shangjiashitangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

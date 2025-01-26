package com.entity.view;

import com.entity.ShangpinhushouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品互售
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-17 23:09:40
 */
@TableName("shangpinhushou")
public class ShangpinhushouView  extends ShangpinhushouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinhushouView(){
	}
 
 	public ShangpinhushouView(ShangpinhushouEntity shangpinhushouEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinhushouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

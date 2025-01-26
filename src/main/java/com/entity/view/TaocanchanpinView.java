package com.entity.view;

import com.entity.TaocanchanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 套餐产品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-17 23:09:40
 */
@TableName("taocanchanpin")
public class TaocanchanpinView  extends TaocanchanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TaocanchanpinView(){
	}
 
 	public TaocanchanpinView(TaocanchanpinEntity taocanchanpinEntity){
 	try {
			BeanUtils.copyProperties(this, taocanchanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

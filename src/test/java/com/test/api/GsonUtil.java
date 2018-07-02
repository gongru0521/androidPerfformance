package com.test.api;

import com.google.gson.Gson;

public class GsonUtil {
	
	static Gson gson = new Gson(); 
	private static Gson getGson(){
		if (gson == null) {
			gson = new Gson();
		}
		return gson;
		
	}
	
	
	//转换为json
	public static String togson(Object bean){
		
		return getGson().toJson(bean);
		
	}
	
	//反序列化
	public static<T> Object fromgson(String json,Class<T> Obj){
		
		
		return getGson().fromJson(json, Obj);
		
		
	}

}

package com.shop.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CollectionBean {
private Object[] arr;
private List list;
private Map map;
private Properties pro;
public Object[] getArr() {
	return arr;
}
public void setArr(Object[] arr) {
	this.arr = arr;
}
public List getList() {
	return list;
}
public void setList(List list) {
	this.list = list;
}
public Map getMap() {
	return map;
}
public void setMap(Map map) {
	this.map = map;
}
public Properties getPro() {
	return pro;
}
public void setPro(Properties pro) {
	this.pro = pro;
}
@Override
public String toString() {
	return "CollectionBean [arr=" + Arrays.toString(arr) + ", list=" + list + ", map=" + map + ", pro=" + pro + "]";
}
}

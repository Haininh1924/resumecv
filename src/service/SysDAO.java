/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;

abstract public class SysDAO<EntityType, KeyType> {//generic
//    abstract public int insert(EntityType entity);//EntityType: NhanVien, Khach hang...
//    abstract public int update(EntityType entity,KeyType id);
//    abstract public int delete(KeyType id);//KeyType: String, Integer, Double...
    abstract public EntityType selectById(KeyType id);
    abstract public List<EntityType> selectAll();
    abstract protected List<EntityType> selectBySql(String sql, Object...args);
}

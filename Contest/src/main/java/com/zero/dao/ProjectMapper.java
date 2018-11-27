package com.zero.dao;

import com.zero.bean.Project;
import com.zero.bean.ProjectExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ProjectMapper {
    long countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Project record);

    int insertSelective(Project record);

    List<Project> selectByExample(ProjectExample example);

    Project selectByPrimaryKey(Integer id);
    
    List<Project> selectByExampleWithName(ProjectExample example);

    Project selectByPrimaryKeyWithName(Integer id);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

	List<Project> search(Map<String, Object> searchParam);
}
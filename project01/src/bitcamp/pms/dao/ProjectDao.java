package bitcamp.pms.dao;

import java.util.List;
import java.util.Map;

import bitcamp.pms.domain.Project;

public interface ProjectDao {
  List<Project> selectList();
  Project selectOne(Map<String,Object> paramMap);
  int insert(Project project);
  int update(Project project);
  int delete(int no);
}

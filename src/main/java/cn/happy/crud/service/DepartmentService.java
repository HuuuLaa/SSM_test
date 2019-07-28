package cn.happy.crud.service;

import cn.happy.crud.bean.Department;
import cn.happy.crud.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    /*
    * 返回所有部门信息
    * */

    public List<Department> getDepts() {
        //查出的所有部门信息
        List<Department> list = departmentMapper.selectByExample(null);
        return list;
    }
}

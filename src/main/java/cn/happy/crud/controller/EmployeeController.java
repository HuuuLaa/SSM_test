package cn.happy.crud.controller;

import cn.happy.crud.bean.Employee;
import cn.happy.crud.bean.Msg;
import cn.happy.crud.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;




/*
* 处理员工的CRUD请求
* @author hlj
* */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    /*
     * 保存员工
     * @return
     * */
    @RequestMapping(value = "/emps", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveEmp(Employee employee){
        employeeService.saveEmp(employee);
        return Msg.success();
    }

    /*
    * 导入Jackson包
    * @param pn
    * @return
    * */
    @RequestMapping("/emps")
    @ResponseBody
    public Msg getEmpsWithJson(@RequestParam(value="pn",defaultValue = "1")Integer pn){
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码以及 页面的大小
        PageHelper.startPage(pn,5);
        //StartPage后面紧跟的查询就是一个分页查询
        List<Employee> emps = employeeService.getAll();
        //使用pageInfo包装查询后的结果，只需要将PageInfo交给页面
        //封装了详细的信息，包括了我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(emps,5);

        return Msg.success().add("pageInfo",page);
    }
    /*
    * 查询员工数据（分页查询）
    * @return
    * */
    //@RequestMapping("/emps")
    public String getEmp(@RequestParam(value = "pn",defaultValue = "1") Integer pn,
                         Model model){

        //数据很多，这不是一个分页查询
        //List<Employee> emps = employeeService.getAll();

        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码以及 页面的大小
        PageHelper.startPage(pn,5);
        //StartPage后面紧跟的查询就是一个分页查询
        List<Employee> emps = employeeService.getAll();
        //使用pageInfo包装查询后的结果，只需要将PageInfo交给页面
        //封装了详细的信息，包括了我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(emps,5);

        model.addAttribute("pageInfo",page);

        return "list";

    }
}

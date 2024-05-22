package cn.edu;

import cn.edu.services.CustomerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class HelloController
{

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/zhuce")
    public String hhh()
    {
        System.out.println("controller");
        return "login";
    }

    @RequestMapping("/test")
    @ResponseBody
    public WeatherInfo test()
    {
        System.out.println("controller");

        return new WeatherInfo("1", "这是temp", "3","4","5");
    }

//    注册业务
    @RequestMapping("/login")
    public String login(HttpServletRequest request, Customer customer, Model model)
    {
        System.out.println(request.getParameter("name") + ":这是request获取的");
        System.out.println(customer);
        int i = customerService.addCustomer(customer);
        System.out.println("i = " + i);
        if (i != 0)
            model.addAttribute("message", "添加成功！");
        else
            model.addAttribute("message", "添加失败！");

        return "message";
    }

//    @PathVariable的用法
    @RequestMapping("/nnnnnn/{yy}")
    public String login(@PathVariable("yy") String yy)
    {
        System.out.println("yy = " + yy);

        return "message";
    }

    @RequestMapping("/ceshichekbox")
    public String ceshichekbox()
    {
        return "login2";
    }

//    @RequestMapping("/login2")
//    public String login2(String[] fans, Model model)
//    {
//        System.out.println("fans = " + Arrays.deepToString(fans));
//        String re = "您选择的内容为：" + Arrays.deepToString(fans);
//        model.addAttribute("message", re);
//        System.out.println("re = " + re);
//        return "message";
//    }

    @RequestMapping("/login2")
    @ResponseBody
    public String login2(String[] fans)
    {
        System.out.println("fans = " + Arrays.deepToString(fans));
        String re = "您选择的内容为：" + Arrays.deepToString(fans);
        System.out.println("re = " + re);
        return re;
    }
}

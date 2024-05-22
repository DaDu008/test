package cn.edu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer
{
    private String name;
    private String danwei;
    private String zhiwei;
    private String birthday;
    private String sex;
    private String phone;
}

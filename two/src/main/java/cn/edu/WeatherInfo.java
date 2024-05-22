package cn.edu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherInfo
{
    private String id;
    private String temp;
    private String weather;
    private String name;
    private String wind;
}

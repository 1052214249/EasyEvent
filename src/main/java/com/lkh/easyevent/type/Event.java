package com.lkh.easyevent.type;

import lombok.Data;

/**
 * 与schema文件中的类型进行对应
 * @author lkh
 * @create 2022-07-04-17:44
 */
@Data
public class Event {
    private String id;
    private String title;
    private String desc;
    private Float price;
    private String date;
}

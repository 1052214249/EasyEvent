package com.lkh.easyevent.fetcher;

import com.lkh.easyevent.type.Event;
import com.lkh.easyevent.type.InputEvent;
import com.netflix.graphql.dgs.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * @author lkh
 * @create 2022-07-04-14:54
 */
@DgsComponent
public class EventDataFetcher {
    private List<Event> list = new ArrayList<>();
//    /**
//     * 表示这是个查询操作
//     * @return
//     */
//    @DgsQuery
//    public List<String> events(){
//        return Arrays.asList("1","2","3");
//    }
//    /**
//     * 表示这是个增删改操作
//     * 其中入参需要用@InputArgument注解，参数名需要与schema中的入参名对应，如果不对应，则可以在注解中使用name属性指定
//     * @return
//     */
//    @DgsMutation
//    public String createEvent(@InputArgument String name){
//        return name;
//    }

    @DgsQuery
    public List<Event> events(){
        return list;
    }

    @DgsMutation
    public String createEvent(@InputArgument(name = "event") InputEvent ie){
        Event event = new Event();
        event.setId(UUID.randomUUID().toString());
        event.setDate(ie.getDate());
        event.setDesc(ie.getDesc());
        event.setPrice(ie.getPrice());
        event.setTitle(ie.getTitle());
        list.add(event);
        return "OK";
    }
}

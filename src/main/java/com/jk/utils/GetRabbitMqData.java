package com.jk.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "chuchu")
public class GetRabbitMqData {

    @RabbitHandler
    public void getMsg(String msg){
        //System.out.println(msg);

      /*  JSONObject jb = JSONArray.parseObject(msg);
        Integer id = jb.getInteger("id");*/

        System.out.println(msg);

    }


}

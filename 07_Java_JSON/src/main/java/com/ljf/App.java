package com.ljf;


import com.alibaba.fastjson.JSONObject;

import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        String str = "{\"2a3ecdf5-2a9b-4429-811c-71d5114cbba5\":\"2021-01-005\",\"f6021194-c896-4e7b-ae02-811a9b3aa5c3\":\"张七滨\",\"8bfb4617-23c2-4109-b7ad-59be51d635b4\":\"1\",\"e3df9ccd-ceed-4a62-b575-c09c1285e536\":\"42\",\"3d0639b6-ebc7-4430-85ac-a724cc6cd00b\":\"342225198201030594\",\"4ea7cb67-94b0-49ac-811d-5f4f2b5384a8\":\"\",\"803f0ad0-53e5-442d-8a00-4cb6a9e657c2\":\"18802050055\",\"aaef3eff-6b54-472a-86ac-c6352b38b9c4\":\"\",\"200ea674-fe63-4369-8f02-7a0e4e0fbd22\":\"\",\"e6f54428-e367-4680-8e72-1d3083e8613c\":\"\",\"a41a9f42-8796-478f-8298-25f3e69b63be\":\"\",\"197704c3-441f-4ef6-853f-47715475ba46\":\"\",\"441af033-9829-4c70-8535-479d5f92823c\":\"\",\"92f741a2-f12b-46d5-b46e-ae96fefac9aa\":\"2000436370\",\"f93fd540-0b8d-4aa8-a55c-b6857417fa17\":\"2021-01-11\",\"4074088c-9647-4df2-ae1d-db07fc6e7589\":\"2021-01-11\",\"234de7bd-8eb4-4593-a6e1-a9b68d7a08d1\":\"\",\"9a7d960a-b2f7-4b66-824a-1c5224516fda\":\"\",\"94db6c4b-f5a9-4321-a642-7eecc33a04f4\":\"test\",\"08bc419a-a663-49ae-8287-f444eb3ca4bd\":\"\",\"e13d0c60-7420-411d-8c9a-f5e3fc474e22\":\"\",\"e7d2d98f-e69d-4505-8f27-8ce3f177e38c\":\"\"}";
        JSONObject jsonObject = JSONObject.parseObject(str);
        Set<String> strings = jsonObject.keySet();

        for (Map.Entry<String, Object> stringObjectEntry : jsonObject.entrySet()) {
            System.out.println(stringObjectEntry.getKey());
            System.out.println(stringObjectEntry.getValue());
        }




        System.out.println( "Hello World!" );
    }
}

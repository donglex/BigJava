package com.bigjava.util;

import java.util.UUID;

public class CodeUtil {
    //生成唯一的激活码
    public static String generateUniqueCode() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}

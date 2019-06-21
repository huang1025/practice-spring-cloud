package com.huang.service.a.service.test;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * Test - test
 *
 * @author: huang_jiangling
 * @date: 2019-06-17
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Test {

    private String name;

    public static void main(String[] args) {
        Function<Test, String> getName = Test::getName;
        Function<CharSequence, Boolean> isNotBlank = StringUtils::isNotBlank;
        Maps.EntryTransformer<String, Integer, String> stringIntegerStringEntryTransformer = StringUtils::abbreviate;
    }
}

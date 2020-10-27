package com.homework.wemakeprice.service.impl;

import com.homework.wemakeprice.dto.WebCrawlingRequest;
import com.homework.wemakeprice.dto.WebCrawlingResponse;
import com.homework.wemakeprice.service.WebCrawlingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by kimchanjung on 2020-10-27 오후 2:42
 */
@Slf4j
@Service
public class WebCrawlingServiceImpl implements WebCrawlingService {

    @Override
    public WebCrawlingResponse crawling(WebCrawlingRequest request) {
        return WebCrawlingResponse.of("몫","나머지");
    }
}
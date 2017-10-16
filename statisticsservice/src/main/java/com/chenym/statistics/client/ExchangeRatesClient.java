package com.chenym.statistics.client;

import com.chenym.statistics.domain.Currency;
import com.chenym.statistics.domain.ExchangeRatesContainer;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "${rates.url}", name = "rates-client")
public interface ExchangeRatesClient {

    @GetMapping("/latest")
    ExchangeRatesContainer getRates(@RequestParam("base") Currency base);

}

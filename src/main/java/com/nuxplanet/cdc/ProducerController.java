package com.nuxplanet.cdc;

import com.nuxplanet.cdc.dto.Beer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oleciwoj
 */
@RestController
@RequestMapping("/api/producer")
class ProducerController {

    @GetMapping("/beer/{beerName}")
    Beer serve(@PathVariable String beerName) {
        return new Beer(beerName, 5.3);
    }

}



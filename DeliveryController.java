package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.klef.fsad.exam.model.Delivery;
import com.klef.fsad.exam.service.DeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService service;

    // POST → Add Delivery
    @PostMapping("/add")
    public Delivery addDelivery(@RequestBody Delivery d) {
        return service.addDelivery(d);
    }

    // DELETE → Delete Delivery
    @DeleteMapping("/delete/{id}")
    public String deleteDelivery(@PathVariable Long id) {
        service.deleteDelivery(id);
        return "Delivery Deleted Successfully";
    }
}

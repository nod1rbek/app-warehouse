package uz.pdp.appwarehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.appwarehouse.entity.Warehouse;
import uz.pdp.appwarehouse.payload.Result;
import uz.pdp.appwarehouse.service.WarehouseService;

import java.util.List;


@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;

    @PostMapping
    public Result addWarehouse(@RequestBody Warehouse warehouse) {
        return warehouseService.addWarehouse(warehouse);
    }

    @GetMapping
    public List<Warehouse> getAllWarehouse() {
        return warehouseService.getAllWarehouse();
    }

    @GetMapping("/{id}")
    public Warehouse getWarehouseById(@PathVariable Integer id) {
        return warehouseService.getWarehouseById(id);
    }

    @PutMapping("/{id}")
    public Result editWarehouse(@PathVariable Integer id, @RequestBody Warehouse warehouse) {
        return warehouseService.editWarehouse(id, warehouse);
    }

    @DeleteMapping("/{id}")
    public Result deleteWarehouse(@PathVariable Integer id) {
        return warehouseService.deleteWarehouse(id);
    }
}
